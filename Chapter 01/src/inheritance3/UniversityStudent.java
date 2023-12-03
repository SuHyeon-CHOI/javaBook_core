package inheritance3;

public class UniversityStudent extends Student {
	int score;
	
	UniversityStudent(String name, int score) {
		
		super(name);
		// super()는 부모 클래스의 기본 생성자를 의미한다.
		// 상속 관계에 있는 클래스에서 별도의 언급이 없으면 부모의 기본 생성자가 자동으로 호출된다.
		// super()는 생략할 수 있다. 
		// 하지만 부모 클래스에 기본 생성자가 없다면 반드시 인자가 있는 super()를 사용하여 생성자를 명시적으로 호출해야 한다.
		
		// super() 생성자가 부모 클래스의 생성자를 호출한다면, super 참조 변수는 부모 클래스의 멤버 변수나 메소드를 참조할 때 사용한다.
		
		this.score = score;
		System.out.println("===> UniversityStudent(String name, int score) 생성자 호출");
	}
	
	String printInfo() {
		return super.printInfo() + ", 점수: " + score;
	}
	// UniversityStudent의 printInfo() 메소드는 부모 클래스의 printInfo() 메소드를 오버라이딩했다.
	// 따라서 부모 클래스의 printInfo() 메소드는 상속되지 않는다. 
	// 이때 super를 이용하여 부모의 printInfo() 메소드를 호출할 수 있다.
	// 이렇게 super는 자식 클래스에서 부모 클래스의 멤버 변수나 메소드를 참조할 떄 사용한다.
}
