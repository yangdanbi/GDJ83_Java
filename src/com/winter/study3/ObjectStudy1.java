package com.winter.study3;

public class ObjectStudy1 {

	public static void main(String[] args) {
		StudyReturn sr = new StudyReturn();
//		int result = sr.t2();
		int n = sr.t1();
//		System.out.println(result);

		// 짝수면 출력x
//		sr.t2();

//		// 학생 객체 생성
//		// new 클래스() -> 객체의 주소가 반환
//		// s엔 Student 타입만 담을 수 있음
//		// 지역변수는 초기화x
//		Student s = new Student();
//		s.num = 2; // Student 타입이 아니라 int
//		s.name = "iu";
//
//		System.out.println(s);
//		System.out.println(s.name);// iu
//		System.out.println(s.kor);// 초기화 돼서 0
//
//		// 학생 추가
//		Student s2 = new Student();
////		s2.name = "winter";
//		System.out.println(s2.name);// 초기화 돼서 null
//
//		Student s3 = null; // Exception 에러 s3는 Student 타입이라 Student만 넣을수있음(s,s2)
//		s3 = s;
//		System.out.println(s3.name);
//		s3.name = "winter";// 같은 객체를 바라보게 했기 때문에 이름 바뀜
//		System.out.println(s.name);
//
//		Student s4 = new Student();
//		s4.num = s.num;
//		s4.name = s.name;
//		System.out.println(s4.name);
//		s4.name = "hani";
//		System.out.println(s.name);
//
//		// Student 클래스에 만들어 둔 멤버메서드 호출
//		// 참조변수명.멤버메서드명();
//		// 멤버변수 사용
//		// 참조변수명.멤버변수명
//		s.info();
	}

}
