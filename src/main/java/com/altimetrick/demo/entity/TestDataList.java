package com.altimetrick.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class TestDataList {
	private List<TestData> dataList;
	
	public TestDataList() {
		dataList = new ArrayList<>();
	}

	public List<TestData> getDataList() {
		return dataList;
	}

	public void setDataList(List<TestData> dataList) {
		this.dataList = dataList;
	}
}
