package com.winter.s1.lang.wrapper.ex;

public class WeatherService {
	// Controller Layer
	// Business Layer
	// DAO Layer

	// 문자열 누적
	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60"); // 01234
		this.sb.append("-부산 , 33.3 - 흐림 - 90");// 5678
		this.sb.append("-제주 , 26.5 - 눈 - 30");// 9101112
		this.sb.append("-광주 , 10.6 - 태풍 - 80");

	}

	public void init() {
		// sb 에 있는 것을 문자열 변수에 담아서 출력
		String info = sb.toString();
		// System.out.println(info);
		info = info.replace(",", "-");
//		info = info.replace(" ", "");
		String[] data = info.split("-");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

//		for(int i=0;i<)
		int cnt = (int) sb.length() / 4;
		WeatherDTO[] str1 = new WeatherDTO[cnt];
		System.out.println(str1.length);

		for (int i = 0; i < str1.length; i++) {

			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(data[i].trim());
			weatherDTO.setGion(Double.parseDouble(data[i].trim()));
			weatherDTO.setStaus(data[i].trim());
			weatherDTO.setHuminity(Integer.parseInt(data[i].trim()));

//			System.out.println(str1.length);
			System.out.println(str1[i].getCity());
		}

	}
}
