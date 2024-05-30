package com.winter.study3.student;

public class Student {
	//test
	// 멤버변수
	// 인스턴스 변수
	// 데이터만 있을땐 메서드x
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	// 클래스안에 if문 사용x 변수랑 메서드만 있어야함
	// 변수 선언 공식 데이터아입명 변수명
	// 객체 생성 공식 new 클래스명()
	// 메서드 선언 공식 첫글자 소문자
	// public static void main(String[] args){}
	// 접근지정자 [그외지정자] 리턴타입 메서드명 (매개변수들 선언){}
	// [그외지정자][매개변수들] 필수아님

	// Student 를 구성하는 메서드
	// info메서드가 해야하는 기능
	// 스택에 실행되는데 둘의 메모리 저장 위치가 달라서 변수이름 중복가능
	// 메인에서 사용하고 나면 int num은 사라짐 실행될때마 생성되고 사라짐
	public void info() {
		int num = 0;
		System.out.println("info 실행");
	}

}
