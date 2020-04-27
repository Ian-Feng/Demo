package com.altimetrick.demo.entity;

public class TestData {
	
	private String dateCollected;
	private int cdcLabs;
	private int usPubHealthLabs;
	private int dailyTotal;
	private int lag;
	
	public String getDateCollected() {
		return dateCollected;
	}
	public void setDateCollected(String dateCollected) {
		this.dateCollected = dateCollected;
	}
	public int getCdcLabs() {
		return cdcLabs;
	}
	public void setCdcLabs(int cdcLabs) {
		this.cdcLabs = cdcLabs;
	}
	public int getUsPubHealthLabs() {
		return usPubHealthLabs;
	}
	public void setUsPubHealthLabs(int usPubHealthLabs) {
		this.usPubHealthLabs = usPubHealthLabs;
	}
	public int getDailyTotal() {
		return dailyTotal;
	}
	public void setDailyTotal(int dailyTotal) {
		this.dailyTotal = dailyTotal;
	}
	public int getLag() {
		return lag;
	}
	public void setLag(int lag) {
		this.lag = lag;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dateCollected + " " + dailyTotal;
	}
	
	
}
