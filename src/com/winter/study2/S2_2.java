package com.winter.study2;

import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {
		// 학생 수를 입력받아서 학생 수 만큼 이름, 국어점수, 영어점수를 입력받아서 출력하자
		Scanner sc = new Scanner(System.in);
		// 1. 학생정보 입력 2.학생정보 출력 3. 프로그램 종료 4.학생찾기
		boolean flag = true;
		int cnt = 0;
		String[] student = null;
		int kor[] = null;
		int eng[] = null;
		int math[] = null;
		int num[] = null;// 학생번호
		int[] total = null;// 총합
		double[] avg = null;// 평균
		int temp = 0;
		String sTemp = "";

		while (flag) {
			System.out.println("1. 학생정보 입력 2.학생정보 출력 3. 학생찾기(번호) 4. 성적순 정렬 5.프로그램 종료");
			int mode = sc.nextInt();

			switch (mode) {
			case 1:
				System.out.println("학생 수 입력:");
				cnt = sc.nextInt();

				num = new int[cnt];
				student = new String[cnt];
				kor = new int[cnt];
				eng = new int[cnt];
				math = new int[cnt];
				total = new int[cnt];
				avg = new double[cnt];

				// System.out.println(cnt);

				for (int i = 0; i < student.length; i++) {
					num[i] = i + 1;
					System.out.println("이름 입력:");
					student[i] = sc.next();
					System.out.println(student[i] + "의 국어 점수 입력:");
					kor[i] = sc.nextInt();
					System.out.println(student[i] + "의 영어 점수 입력:");
					eng[i] = sc.nextInt();
					System.out.println(student[i] + "의 수학 점수 입력:");
					math[i] = sc.nextInt();
					total[i] = (kor[i] + eng[i] + math[i]);
					avg[i] = total[i] / 3;
				}
				break;
			case 2:
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				for (int i = 0; i < cnt; i++) {
					System.out.print(num[i] + "\t");
					System.out.print(student[i] + "\t");
					System.out.print(kor[i] + "\t");
					System.out.print(eng[i] + "\t");
					System.out.print(math[i] + "\t");
					System.out.print(total[i] + "\t");
					System.out.print(avg[i] + "\n");
				}
				break;
			case 3:
				System.out.println("찾는 학생의 번호 입력:");
				int sNum = sc.nextInt();
				for (int i = 0; i < num.length; i++) {
					if (sNum == num[i]) {
						System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
						System.out.print(num[i] + "\t");
						System.out.print(student[i] + "\t");
						System.out.print(kor[i] + "\t");
						System.out.print(eng[i] + "\t");
						System.out.print(math[i] + "\t");
						System.out.print(total[i] + "\t");
						System.out.print(avg[i] + "\n");
					}
				}
				break;
			case 4:

				for (int i = 0; i < total.length; i++) { // i=0,j=01234 ~i=4
					// System.out.println("1번째 for i= " + i);
					for (int j = i; j < total.length; j++) {

						if (avg[i] < avg[j]) { // i<j
							temp = (int) avg[i];// 빈 변수에 더 작은수 넣기
							avg[i] = avg[j];// i=j
							avg[j] = temp;// j에 더 작은 수 담아놓은 변수 값 넣기

							sTemp = student[i];
							student[i] = student[j];
							student[j] = sTemp;

							temp = num[i];
							num[i] = num[j];
							num[j] = temp;

							temp = kor[i];
							kor[i] = kor[j];
							kor[j] = temp;

							temp = eng[i];
							eng[i] = eng[j];
							eng[j] = temp;

							temp = math[i];
							math[i] = math[j];
							math[j] = temp;

							temp = total[i];
							total[i] = total[j];
							total[j] = temp;
						}
					}
				}
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				for (int i = 0; i < num.length; i++) {

					System.out.print(num[i] + "\t");
					System.out.print(student[i] + "\t");
					System.out.print(kor[i] + "\t");
					System.out.print(eng[i] + "\t");
					System.out.print(math[i] + "\t");
					System.out.print(total[i] + "\t");
					System.out.print(avg[i] + "\n");
				}

				break;
			default:
				flag = !flag;
				System.out.println("프로그램 종료");

			}
		}
	}
}