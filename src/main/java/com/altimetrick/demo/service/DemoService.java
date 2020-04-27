package com.altimetrick.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.altimetrick.demo.entity.TestData;
import com.altimetrick.demo.entity.TestDataCalculator;
import com.altimetrick.demo.entity.ResponseVO;

@Service
public class DemoService {

	@Autowired
	RestTemplate restTemplate;
	
	private static final String URL = "https://covidtracking.com/api/cdc/daily";
	
	public ResponseVO getPredictData() {
		ResponseVO response = new ResponseVO();
		TestData[] dataArray = getPublicData();
		
		if (dataArray == null || dataArray.length == 0) {
			response.setStatus(ResponseVO.FAIL);
			return response;
		}
		List<TestData> dataList = Arrays.asList(getPublicData());

		Map<Integer, TestDataCalculator> monthToData = new HashMap<>();
		
		// collect all the tests and group by month
		dataList.forEach(item -> {
			int month = Character.getNumericValue(item.getDateCollected().charAt(0));
			if (!monthToData.containsKey(month)) {
				TestDataCalculator newMonth = new TestDataCalculator(month);
				monthToData.put(month, newMonth);
			}
			
			monthToData.get(month).increment(item.getDailyTotal());
		});

		return calculateValues(monthToData);
	}
	
	private ResponseVO calculateValues(Map<Integer, TestDataCalculator> monthToData) {
		ResponseVO response = new ResponseVO();
		TestDataCalculator calculatorForApril = monthToData.get(4);
		calculatorForApril.setNumOfDays(7);
		int rateX10 = calculatorForApril.getAverage() * 10;
		
		int specialRate = (calculatorForApril.getTotalTests() + rateX10 * 23) / 30;
		
		response.setAvgMonthlyTestsInJan(monthToData.get(1).getAverage());
		response.setAvgMonthlyTestsInFeb(monthToData.get(2).getAverage());
		response.setAvgMonthlyTestsInMar(monthToData.get(3).getAverage());
		response.setAvgMonthlyTestsInAprCurrentRate(calculatorForApril.getAverage());
		response.setAvgMonthlyTestsInMayCurrentRate(response.getAvgMonthlyTestsInAprCurrentRate());
		response.setAvgMonthlyTestsInMay10XRate(response.getAvgMonthlyTestsInMayCurrentRate() * 10);
		response.setAvgMonthlyTestsInApr10XRate(specialRate);
		response.setStatus(ResponseVO.SUCCESS);
		
//		System.out.println(dataList);
		return response;
	}
	
	private TestData[] getPublicData() {
		try {
			return restTemplate.getForEntity(URL, TestData[].class).getBody();
		} catch (Exception e) {
			System.out.println("Something Nasty Happened!");
			return null;
		}
		
	}
}
