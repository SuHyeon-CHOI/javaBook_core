// 1. 클래스 선언부
public class Student {

	// 2. 멤버 변수
	public String name = "둘리";
	private int score = 83;
	
	// 3. 생성자 메소드
	Student() {
		System.out.println("---> Student 객체 생성");
	}
	
	// 4. 멤버 메소드
	public void printInfo() {
		System.out.println(name + "의 점수: " + score);
	}
}
