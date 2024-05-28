package com.winter.study2;

public class S2 {

	public static void main(String[] args) {
		// primitive type : 더이상 분해할 수 없는 타입 byte short int long float double char
		// boolean
		// reference type :primotive type 를 제외한 모든 타입 String

		// 메모리 영역 구분
		// 1. 메서드 영역 : 클래스 변수
		// 2. 스택 영역:메서드가 실행 될때 차지하는 영역 위가 뚫려있음 적재될때 위로, 빠져나갈때도 위로,
		// 메인위로 다른 메서드가 쌓임 처음 들어온건 마지막에나갈 수 있음 FILO/LIFO 구조(선입선출)
		// 메서드 안에 선언된 것 지역변수
		// 3. 힙 영역 : 인스턴스 변수

		// 배열 - 하나의 변수로 여러개의 데이터를 다룰때 사용(데이터를 묶어주는 데이터의 집합)
		// let ar[];
		// 같은 데이터 타입만 모을 수 있다.

		// 배열 선언
		// 모으려고하는 데이터타입[] 변수명 = new 모으려고하는 데이터타입명[갯수]
		// new 객체 만드는 연산자 힙에 저장// 힙 영역에 뭘 만들어라 라는 의미
		// 변수 선언
		// 데이터타입명 변수명;
		// String name;
		// ar은 int [] 타입
		// 참조변수
		// 지역변수 {시작되면 만들어지고 }소멸 초기화하지않고 사용하면 에러발생
		// 힙에 만들어지는 인스턴스변수는 자동으로 초기화됨
		int num = 0;
		double n2 = 0.0;
		char ch = ' ';
		boolean flag = false;
		String name = null;

		int[] ar = new int[3]; // 4바이트를 3개 이어서 만들기,int type
		int[] ar2 = { 1, 2, 3 };

		String[] names = new String[2];

		System.out.println(flag);

		System.out.println(num);
		System.out.println(ar[0]);
		System.out.println(names[0]);// reference 기본값은 0

		ar[0] = 50;
		ar = ar2; // ar2의 주소를 ar에 넣음
		System.out.println(ar[1]);// ar2
	}

}
