package com.winter.study3.student;

import java.util.Scanner;

public class StudentController {
	// 코드를 분리해놓으면 재사용가능, 코드 수정하기도 편함
	// StudentService 를 쓰기 위해 객체생성

	public void start() {
		StudentService service = new StudentService();
		StudentView view = new StudentView();
		// 객체 먼저 만들기
		System.out.println("Student start 메서드 실행");

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		// if else는 break 사용가능
//		Student[] students = service.makeStudent();
		Student[] students = null; // 재사용하기 위해 null로 초기화
		while (flag) {
			System.out.println("1.학생정보입력 2.전체출력 3.학생검색 4.종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생정보입력 코드 작성");
				students = service.makeStudent();// 밑에서 students 가 어딨는지 찾아감

			} else if (select == 2) {
				System.out.println("전체출력 코드 작성");
				if (students != null) {
					view.view(students);
				} else {
					view.view("학생 정보를 먼저 입력");
				}
				// view.view(students);
				// Student s = students[i];
//					System.out.println(s.name);
//					System.out.println(students[i].avg);

			} else if (select == 3) {
				System.out.println("학생검색 코드 작성");
				Student student = service.findByNum(students);
				if (student != null) {
					view.view(student);
				} else {
					view.view("검색결과가 없습니다.");
				}

			} else if (select == 4) {
				System.out.println("프로그램종료 코드 작성");
				flag = false;
			} else {
				System.out.println("잘못입력");
			}

		} // while 종료
	}

}
