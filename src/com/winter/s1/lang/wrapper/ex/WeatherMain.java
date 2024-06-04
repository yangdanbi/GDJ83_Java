package com.winter.s1.lang.wrapper.ex;

public class WeatherMain {
	public static void main(String[] args) {

		// DTO(Data Transfer object): 데이터를 운반
		// Getters/Setters 필요
		// 생성자는 여러개 만들어도 상관없지만 기본생성자는 필수

		WeatherService ws = new WeatherService();

		ws.init();

	}

}
