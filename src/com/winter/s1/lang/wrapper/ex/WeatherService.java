package com.winter.s1.lang.wrapper.ex;

public class WeatherService {
	// Controller Layer
	// Business Layer
	// DAO Layer

	// 문자열 누적
	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60"); // 0123
		this.sb.append("-부산 , 33.3 - 흐림 - 90");// 4567
		this.sb.append("-제주 , 26.5 - 눈 - 30");// 891011
		this.sb.append("-광주 , 10.6 - 태풍 - 80");

	}

	public void init() {
		// sb 에 있는 것을 문자열 변수에 담아서 출력
		String info = sb.toString();
		// System.out.println(info);
		info = info.replace(",", "-");
//		info = info.replace(" ", "");
		String[] data = info.split("-");
		//WeatherDTO weatherDTO = new WeatherDTO();

		for (int i = 0; i < data.length; i++) {
			data[i] = data[i].trim();

			// System.out.println(data[i]);
		}
		WeatherDTO[] str1 = new WeatherDTO[data.length / 4];// 배열 4개씩 만들어야함
		for (int i = 0; i < str1.length; i++) { // 객체를 만들어줘야함

			//str1[i] = weatherDTO; // 이 객체에 속성을 배열로 만들것
		}

		for (int i = 0; i < str1.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(data[i * 4]);
			weatherDTO.setGion(Double.parseDouble(data[i * 4 + 1]));
			weatherDTO.setStaus(data[i * 4 + 2]);
			weatherDTO.setHuminity(Integer.parseInt(data[i * 4 + 3]));

			str1[i] = weatherDTO;
			// for (int j = 0; j < data.length; j = j + 4) {
//				str1[i].setCity(data[j*4]);
//				str1[i].setGion(Double.parseDouble(data[j*4+1]));
//				str1[i].setStaus(data[j*4+2]);
//				str1[i].setHuminity(Integer.parseInt(data[j*4+3]));

			// System.out.println(str1[0]);
			// }
		}
		for (int i = 0; i < str1.length; i++) {
			//for (int j = 0; j < data.length; j = j + 4) {
				System.out.println(str1[i].getCity());
				System.out.println(str1[i].getGion());
				System.out.println(str1[i].getStaus());
				System.out.println(str1[i].getHuminity());
				System.out.println("=====================");

		}


	}
}
