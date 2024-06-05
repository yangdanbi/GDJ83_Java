package com.winter.s1.lang.wrapper.ex;

public class WeatherMain {
	public static void main(String[] args) {

		// DTO(Data Transfer object): 데이터를 운반
		// Getters/Setters 필요
		// 생성자는 여러개 만들어도 상관없지만 기본생성자는 필수

//		WeatherService ws = new WeatherService();
//
//		ws.init();
//		WeatherDTO[] dtos = new WeatherService().init();
//		WeatherView v = new WeatherView();// 객체 생성
//		v.view(dtos);// 메서드 실행

		// 참조변수명.메서드명
		WeatherContoroller wc = new WeatherContoroller();
		wc.start();

	}

}
