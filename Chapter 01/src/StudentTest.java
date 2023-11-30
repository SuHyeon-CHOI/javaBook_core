
public class StudentTest {

	public static void main(String[] args) {
		
		// Student 객체 생성 및 초기화 (by 생성자)
		Student kim = new Student();
		kim.name = "둘리";
		kim.score = 83;
		
		// Student 객체의 요소 사용
		System.out.println("이름: " + kim.name);
		System.out.println("점수: " + kim.score);
		kim.printInfo();
	}

}
