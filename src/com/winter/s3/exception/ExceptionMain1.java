package com.winter.s3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num = 10;

			System.out.println("숫자를 입력하세요:");
			int num2 = sc.nextInt();
			System.out.println(num / num2);
//			throw new ArithmeticException();// 클래스가 데이터타입 0을 입력하면 이 코드ㅜ가 실행
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {// 인트가 아닌 데이터타입 입력시 에러메시지
			System.out.println("숫자만 입력할 수 있습니다.");
		} catch (Exception e) {// 다형성 모든 에러 보통은 exception에서 끝남

		} catch (Throwable e) {

		}
		Exception1 ex1 = new Exception1();
		try {// 예외가 발생하면 종료가 되는데 그걸 막고 프로그램이 정상적으로 돌아가게 하기 위함
			ex1.ex1(0);
		} catch (ArithmeticException e) {
//			e.printStackTrace();// 어디서 에러가 발생한건지 찍어주는 메서드
			System.out.println(e.printStackTrace());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");

	}

}
