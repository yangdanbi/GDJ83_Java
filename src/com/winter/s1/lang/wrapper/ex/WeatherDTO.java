package com.winter.s1.lang.wrapper.ex;

public class WeatherDTO {
	// 도시명
	private String city;
	// 기온
	private double gion;
	// 날씨정보
	private String staus;
	// 습도
	private int huminity;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}

	public int getHuminity() {
		return huminity;
	}

	public void setHuminity(int huminity) {
		this.huminity = huminity;
	}

}
