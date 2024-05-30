package com.winter.study3.student;

import java.util.Scanner;

public class StudentService {
	// findByNum메서드 만들기
	public Student findByNum(Student[] students) {// 받아올 매개변수

		// 찾으려는 학생의 번호를 입력받아서 일치하는 학생 객체를 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 학생의 번호를 입력하세요: ");
		int sNum = sc.nextInt();// 학생번호 입력받기
		Student student = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i].num == sNum) {
//				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
//				System.out.print("입력 번호 " + students[i].num + "\t");
//				System.out.print("이름 " + students[i].name + "\t");
//				System.out.print("국어점수 " + students[i].kor + "\t");
//				System.out.print("영어점수" + students[i].eng + "\t");
//				System.out.print("수학점수 " + students[i].math + "\t");
				student = students[i];
//				return students[i];
			}
		}
		return student;

	}

	// makeStudent 메서드 선언
	public Student[] makeStudent() {
		Scanner sc = new Scanner(System.in);
		// 같은 데이터 타입을 묶는것
//		System.out.println("makeStudent 학생 정보 입력");
		System.out.println("학생의 수를 입력하세요: ");
		int cnt = sc.nextInt();

		// 학생들을 모을 배열을 리턴

		// null해결
		// 배열을 가리키는 주소는 만들어짐
		// 우선 빈 칸 자리만 만들어주는..
		// new Student[cnt]을 새로 만들건데 그걸 students에 담자
		Student[] students = new Student[cnt];
		for (int i = 0; i < students.length; i++) {
//			students[i] = new Student();
			Student s = new Student();
			System.out.println(i + 1 + "번째 이름 입력");
			s.name = sc.next();
			System.out.println(s.name + "의 번호를 입력");
			s.num = sc.nextInt();
			System.out.println(s.name + "의 국어점수를 입력");
			s.kor = sc.nextInt();
			System.out.println(s.name + "의 영어점수를 입력");
			s.eng = sc.nextInt();
			System.out.println(s.name + "의 수학점수를 입력");
			s.math = sc.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;

			students[i] = s;

		}

		System.out.println(students.length);
		// 학생 수 만큼 정수배열을 만들어서 리턴
		// int[] ar = new int[cnt];
//
//		// 학생 한명을 생성해서 리턴
//		// 객체를 만들로 리턴
//		Student st = new Student();

		return students;

	}
}
