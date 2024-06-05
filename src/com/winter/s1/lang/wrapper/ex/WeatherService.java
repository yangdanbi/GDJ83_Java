package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;

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

	public WeatherDTO[] init() {// 지역변수
		// sb 에 있는 것을 문자열 변수에 담아서 출력
		String info = sb.toString();
		// System.out.println(info);
		info = info.replace(",", "-");
//		info = info.replace(" ", "");
		// WeatherDTO weatherDTO = new WeatherDTO();
		WeatherDTO[] dtos = this.getWeathers(info);
		return dtos;

	}

	private WeatherDTO[] getWeathers(String info) {
		String[] data = info.split("-");// 16개/4

		for (int i = 0; i < data.length; i++) {
			data[i] = data[i].trim();

			// System.out.println(data[i]);

		}
		WeatherDTO[] dtos = new WeatherDTO[data.length / 4];// 배열 4개씩 만들어야함
//		for (int i = 0; i < str1.length; i++) { // 객체를 만들어줘야함
//
//			// str1[i] = weatherDTO; // 이 객체에 속성을 배열로 만들것
//		}

		for (int i = 0; i < dtos.length; i++) {// 16번 도는 for문
			WeatherDTO weatherDTO = new WeatherDTO();// 객체도 4번이 만들어져야함 그게 아니면 데이터가 한배열에만 들어감
			weatherDTO.setCity(data[i * 4]);
			weatherDTO.setGion(Double.parseDouble(data[i * 4 + 1]));
			weatherDTO.setStaus(data[i * 4 + 2]);
			weatherDTO.setHuminity(Integer.parseInt(data[i * 4 + 3]));

			dtos[i] = weatherDTO;

		}
//		for (int i = 0; i < str1.length; i++) {
//			System.out.println(str1[i].getCity());
//			System.out.println(str1[i].());
//			System.out.println(str1[i].getStaus());
//			System.out.println(str1[i].getHuminity());
//			System.out.println("=====================");
//		}

		return dtos;// []타입의 데이터를 리턴해줘야해서 변수명
	}

	// 날씨정보를 도시명으로 검색 서울입력하면 서울 정보 리턴
	// findByCity

	public WeatherDTO findByCity(WeatherDTO[] ar, Scanner sc) {
		WeatherDTO weatherDTO = null;
		System.out.println("검색 할 도시를 입력하세요: ");
		String city = sc.next();
		// System.out.println(city);

		for (int i = 0; i < ar.length; i++) {
			if (city.equals(ar[i].getCity())) {
				weatherDTO = ar[i];
				break;
//				System.out.println(ar[0].getCity());
//				System.out.println(ar[0].getGion());
//				System.out.println(ar[0].getStaus());
//				System.out.println(ar[0].getHuminity());
			}
		}
		return weatherDTO;

	}

	// 날씨 정보를 추가하는 메서드
	// 메서드 명은 addWeather
	public WeatherDTO[] addWeather(WeatherDTO[] ar, Scanner sc) {
		WeatherDTO weatherDTO = new WeatherDTO();

		System.out.println("추가 할 도시를 입력하세요: ");
		weatherDTO.setCity(sc.next());
		// String cityName = sc.next();

		System.out.println("도시의 기온을 입력하세요: ");
//		weatherDTO.setCity(sc.next());
		weatherDTO.setGion(sc.nextDouble());
		System.out.println("도시의 현재 상태를 입력하세요: ");
		weatherDTO.setStaus(sc.next());

		System.out.println("도시의 습도를 입력하세요: ");
		weatherDTO.setHuminity(sc.nextInt());
//		String cityStaus = sc.next();
		// int cityHumi = sc.nextInt();

		// WeatherDTO weatherDTO = new WeatherDTO();
//		weatherDTO.setCity(cityName);
//		weatherDTO.setGion(cityGion);
//		weatherDTO.setHuminity(cityHumi);
//		weatherDTO.setStaus(cityStaus);

		WeatherDTO[] ar2 = new WeatherDTO[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}

		ar2[ar2.length - 1] = weatherDTO;
//		System.out.println(ar2[4].getCity());
//		System.out.println(cityName + cityGion + cityStaus + cityHumi);
		return ar2;
	}

	// removeWeather
	// 기존 배열에서 하나를 삭제
	// 도시명을 입력받아서 일치하는 날씨정보 삭제
	// 3번은 추가 4번은 제거
	// 반복문 두개쓰는게 젤 간ㅍㄴ
	public void removeWeather(Scanner sc, WeatherDTO[] ar) {
		WeatherDTO weatherDTO = new WeatherDTO();

		WeatherDTO[] ar2 = new WeatherDTO[ar.length - 1];
		System.out.println("삭제할 도시명을 입력해주세요: ");
		String delName = sc.next();
		for (int i = 0; i < ar2.length - 1; i++) {
			if (delName.equals(ar2[i].getCity())) {
				System.out.println("같은이름입력");

			} else {
				System.out.println("오류");
			}

		}

	}
}
