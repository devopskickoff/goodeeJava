package com.goodee.precipitation;

public class PrecipitationData {
	String cityName = "";
	int []month = new int[12];
	float avg;
	
	public PrecipitationData(String cityName, int[] month) {
		super();
		this.cityName = cityName;
		this.month = month;
		process();
	}
	
	public PrecipitationData() {
		super();
		
	}
	
	public void process()
	{
		int sum = 0;
		for(int i : month)
		{
			sum += i;
		}
		avg = (float)sum/12;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int[] getMonth() {
		return month;
	}
	public void setMonth(int[] month) {
		this.month = month;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	public void display() {
		System.out.printf("µµ½Ã¸í : %s Æò±Õ : %.2f", cityName, avg);
		for(int i : month)
		{
			System.out.printf("%4d", i);
		}
		System.out.println();
	}
}
