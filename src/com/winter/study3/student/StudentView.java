package com.winter.study3.student;

public class StudentView {
	public void view(String str) {
		System.out.println(str);
	}

	public void view(Student student) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(student.num + "\t");
		System.out.print(student.name + "\t");
		System.out.print(student.kor + "\t");
		System.out.print(student.eng + "\t");
		System.out.print(student.math + "\t");
		System.out.print(student.total + "\t");
		System.out.print(student.avg + "\t" + "\n");
	}

	public void view(Student[] students) {// 매개변수
//		Student[] students = new Student[];
		// Student students = new Student();

//		System.out.println("view");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < students.length; i++) {// students는 입력받은 학생정보들
			Student student = students[i];
			System.out.print(students[i].num + "\t");// 객체
			System.out.print(students[i].name + "\t");// 객체
			System.out.print(students[i].kor + "\t");// 객체
			System.out.print(students[i].eng + "\t");// 객체
			System.out.print(students[i].math + "\t");// 객체
			System.out.print(students[i].total + "\t");// 객체
			System.out.print(students[i].avg + "\t" + "\n");// 객체
		}
		// 다른 메서드에 있는 객체 가져오기
		// 매개변수

		// return students;
		// 모든 학생들의 정보 출력
	}

}
