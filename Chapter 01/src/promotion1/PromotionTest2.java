package promotion1;

public class PromotionTest2 {

	public static void main(String[] args) {
		Human kim = new Human();
		kim = new Student();
		kim = new UniversityStudent();
		kim = new HighStudent();
		System.out.println(kim.age);
		
		Student park = new Student();
		park = new UniversityStudent();
		park = new HighStudent();
		System.out.println(park.age);
		System.out.println(park.score);

	}

}
/*
 * Human 입장에서 Student, UniversityStudent, HighStudent는 모두 자식 클래스다.
 * 그리고 Student는 UniversityStudent, HighStudent를 자식 클래스로 가지고 있따.
 * 하지만 참조 변수가 선언된 클래스 타입에 따라 사용할 수 있는 멤버 변수는 달라진다.
 * 따라서 Human 타입의 참조 변수로는 age만 사용할 수 있고, Student 타입의 참조 변수로는 age와 score만 사용할 수 있다.
 * 묵시적 타입 변환을 이용하면 다양한 타입의 객체를 배열 같은 컬렉션에 저장하고 사용할 수 있다.
 * 원래 배열은 동일한 타입의 데이터만 저장할 수 있지만, 묵시적 타입 변환을 이용하면 이런 제약에서 벗어날 수 있다.
*/
 