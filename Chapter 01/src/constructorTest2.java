import constructor.Student;

public class constructorTest2 {

	public static void main(String[] args) {
		// Student 객체 생성 및 초기화
		Student kim = new Student();
		kim.name = "김둘리";
		kim.score = 83;
		kim.isPassed = true;
		kim.major = "컴퓨터 공학";
		kim.printInfo();
		// 여기까지의 소스는 기본 생성자를 이용하여 Student 객체를 생성한 후에 멤버 변수를 적절한 값으로 초기화하고 있다.
		// 하지만 이렇게 멤버 변수를 초기화한다면 멤버 변수가 늘어나거나 생성해야 할 객체가 많을 때 지루한 작업을 반복해야 한다.
		
		// Student park = new Student("박또치", 100, true, "식품 영양학");
		Student park = new Student("박또치", 100);
		park.printInfo();
		// 네 개의 멤버 변수 중에 두 개(name, score)만 초기화하면 나머지 멤버 변수(isPassed, major)에는 자동으로 기본값이 할당된다.
		
	}

}
/*
 * 실수로 생성자에 리턴 타입을 지정하면 어떻게 되나요?
 * => 원래 생성자는 리턴 타입을 지정하지 않는다. 생성자의 목적 자체가 생성되는 객체의 멤버 변수를 초기화하는 것으로, 결과값을 리턴하는 일반 메소드와는 구분되기 때문.
 * => 그런데 만약 생성자에 리턴 타입을 지정하거나 하다못해 void라도 지정한다면, 해당 생성자는 더 이상 생성자가 아닌 일반 메소드로 처리된다.
 */
