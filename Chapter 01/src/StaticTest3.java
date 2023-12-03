import static1.Student;

public class StaticTest3 {
	
//	static {
//		System.out.println("프로그램 실행 시 가장 먼저 실행되는 코드 영역");
//	}
	// static 블록으로 지정된 코드는 클래스 파일이 로딩되는 순간 가장 먼저 실행된다.

	/*
	 * static 블록을 잘 이용하면 클래스로부터 하나의 객체만 생성되도록 강제할 수 있다.
	 * 현재의 Student 클래스는 생성자를 통해 무한대로 객체를 생성할 수 있다.
	 * 만약 하나의 객체만 생성하여 여러 곳에서 공유하기 위해서는 객체의 주소를 복사하여 재사용해야 한다.
	 * 즉, 객체를 공유하는 가장 기본은 주소를 복사하는 것이다.
	 */
	public static void main(String[] args) {
		// System.out.println("main() 메소드 실행됨");
		
//		Student kim = new Student("김둘리", 93);
//		Student park = kim;
//		Student choi = park;
//		
//		System.out.println(kim);
//		System.out.println(park);
//		System.out.println(choi);
		
		Student kim = Student.studentInstance;
		System.out.println(kim.toString());
		kim.printInfo();
		
		Student park = Student.studentInstance;
		System.out.println(park.toString());
		park.printInfo();
		
		Student choi = Student.studentInstance;
		System.out.println(choi.toString());
		choi.printInfo();
		
		/*
		 * 위 코드의 실행 결과를 보면 kim, park, choi 세 개의 참조 변수가 참조하는 객체의 주소가 모두 동일하다.
		 * 결숫 Student 객체를 아무리 많이 생성한다고 해도 하나의 객체만 유지할 수 있다.*/
	}

}
