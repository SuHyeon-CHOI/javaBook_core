package inheritance2;

public class UniversityStudent extends Student {
	/*
	 * UniversityStudent가 부모인 Student 클래스에 선언된 score 변수와 동일한 이름의 멤버 변수를 선언
	 * => 변수의 오버라이딩
	 * 부모의 멤버 변수를 자식 클래스에서 오버라이딩하면 부모의 변수는 상속되지 않는다.
	 * => 이 코드에서는 자식 클래스인 UniversityStudent에는 String 타입의 score 변수만 존재하는 것이다.
	*/
	
	String score;
	String major;
	
	public void printInfo() {
		System.out.println(name + "(" + major + ")의 점수: " + score);
	}
	
	public void printInfo(int grade) {
		System.out.println(name + "(" + grade + ")의 점수: " + score);
	}
}
