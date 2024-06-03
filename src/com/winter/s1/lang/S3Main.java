package com.winter.s1.lang;

public class S3Main {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		String name = "final.pdf";
		boolean flag = true;
		int result = 0;
//연속해서 찾고싶을때
		// name에서 어떤 글자를 줬을때 그 글자의 index번호를 반환해줌
//		int result = name.indexOf('a');// 3
		while (flag) {
			// result는 0으로 초기화해줬으니 f,0번째 부터 찾게 됨
			result = name.indexOf('.', result);// 2 문자열을 주면 첫글자 위치 반환

			if (result == -1) {
				break;
			}
			System.out.println(result);
			result++;
		}
		System.out.println("종료");
	}

}
