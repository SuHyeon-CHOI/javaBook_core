package inheritance3;

public class InheritanceTest3 {

	public static void main(String[] args) {
		
		UniversityStudent kim = new UniversityStudent("김둘리", 83);
		// System.out.println(kim.name + "의 점수: " + kim.score);
		System.out.println(kim.printInfo());
		
	}

}
/*
 * 부모의 멤버 변수는 자식 클래스로 상속되기 전에 반드시 초기화되어야 한다.
 * 이를 위해 부모의 생성자가 먼저 호출되는 것이다.
 * 만약 Student도 Person 같은 부모 클래스가 있다면 상위 클래스의 생성자가 연속으로 호출된다.
*/
