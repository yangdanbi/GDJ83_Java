package com.winter.s3;

public class S3Main {

	public static void main(String[] args) {
		// 배열선언
		Tiger tiger = new Tiger();

		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;

		// bird,animal 받음
		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "펭수";
		penguin.wing = 2;

		// 선언은 할 수있음
		// 자식 is a 부모 tiger타입은 animal타입이다
		// tiger 가 Animal 타입으로 변함
		Animal animal = tiger;// animal 에 타이거 주소 넣기
		animal = penguin;
		penguin = (Penguin) animal;
		// 다형성
		// 관계가 있으니 형변환 가능
		tiger = (Tiger) animal;

		// 부모가 접근할 수 있는것은 부모가 알고있는것만 접근 가능 animal에 power가 없어서 ㅇㅔ러
//		System.out.println(animal.power);

		// 다형성
		// 상속관계에서만 레퍼런스끼리 형변환, 부모와 자식간의 형변환
		Animal[] dropShip = new Animal[8];// Animal타입 태우기

		dropShip[0] = tiger; // Animal타입이기도함
		dropShip[1] = penguin;

		Tiger ani = (Tiger) dropShip[0];// 꺼내면 animal타입인데 실제론 tiger이니까

//		자식 is a 부모
//		자식 has a 부모

		// 아ㅣ무런 관계없는 객체 만들기
		// 두개의 접점은 없지만 부모를 연결해서 사용하기도 함 
		Eagle eagle = new Eagle();
		AirPlane airplane = new AirPlane();

		// eagle은 fly를 상속받기 때문에 Fly 타입이기도 함
		Fly fly = eagle;
		fly = airplane;

	}

}
