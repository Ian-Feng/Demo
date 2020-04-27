package com.altimetrick.demo.entity;

public class ResponseVO {
	private int AvgMonthlyTestsInJan, 
				AvgMonthlyTestsInFeb, 
				AvgMonthlyTestsInMar, 
				AvgMonthlyTestsInAprCurrentRate,
				AvgMonthlyTestsInMayCurrentRate,
				AvgMonthlyTestsInApr10XRate,
				AvgMonthlyTestsInMay10XRate;
	
	private String status;
	
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";

	public int getAvgMonthlyTestsInJan() {
		return AvgMonthlyTestsInJan;
	}

	public void setAvgMonthlyTestsInJan(int avgMonthlyTestsInJan) {
		AvgMonthlyTestsInJan = avgMonthlyTestsInJan;
	}

	public int getAvgMonthlyTestsInFeb() {
		return AvgMonthlyTestsInFeb;
	}

	public void setAvgMonthlyTestsInFeb(int avgMonthlyTestsInFeb) {
		AvgMonthlyTestsInFeb = avgMonthlyTestsInFeb;
	}

	public int getAvgMonthlyTestsInMar() {
		return AvgMonthlyTestsInMar;
	}

	public void setAvgMonthlyTestsInMar(int avgMonthlyTestsInMar) {
		AvgMonthlyTestsInMar = avgMonthlyTestsInMar;
	}

	public int getAvgMonthlyTestsInAprCurrentRate() {
		return AvgMonthlyTestsInAprCurrentRate;
	}

	public void setAvgMonthlyTestsInAprCurrentRate(int avgMonthlyTestsInAprCurrentRate) {
		AvgMonthlyTestsInAprCurrentRate = avgMonthlyTestsInAprCurrentRate;
	}

	public int getAvgMonthlyTestsInMayCurrentRate() {
		return AvgMonthlyTestsInMayCurrentRate;
	}

	public void setAvgMonthlyTestsInMayCurrentRate(int avgMonthlyTestsInMayCurrentRate) {
		AvgMonthlyTestsInMayCurrentRate = avgMonthlyTestsInMayCurrentRate;
	}

	public int getAvgMonthlyTestsInApr10XRate() {
		return AvgMonthlyTestsInApr10XRate;
	}

	public void setAvgMonthlyTestsInApr10XRate(int avgMonthlyTestsInApr10XRate) {
		AvgMonthlyTestsInApr10XRate = avgMonthlyTestsInApr10XRate;
	}

	public int getAvgMonthlyTestsInMay10XRate() {
		return AvgMonthlyTestsInMay10XRate;
	}

	public void setAvgMonthlyTestsInMay10XRate(int avgMonthlyTestsInMay10XRate) {
		AvgMonthlyTestsInMay10XRate = avgMonthlyTestsInMay10XRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
