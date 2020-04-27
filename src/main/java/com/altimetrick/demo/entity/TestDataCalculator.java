package com.altimetrick.demo.entity;

public class TestDataCalculator {
	public int month;
	public int numOfDays;
	public int totalTests;
	
	public TestDataCalculator(int month) {
		this.month = month;
	}
	
	public void increment(int numOfTests) {
		numOfDays++;
		totalTests += numOfTests;
	}
	
	public int getAverage() {
		return totalTests / numOfDays;
	}

	public int getMonth() {
		return month;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public int getTotalTests() {
		return totalTests;
	}
	
	public void setNumOfDays(int days) {
		this.numOfDays = days;
	}
}
