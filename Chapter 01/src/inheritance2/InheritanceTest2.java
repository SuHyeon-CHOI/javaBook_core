package inheritance2;

public class InheritanceTest2 {

	public static void main(String[] args) {

		UniversityStudent kim = new UniversityStudent();
		kim.name = "김둘리";
		kim.score = "83점"; // score 변수의 타입을 String이 아닌 int로 하용하고 싶다면, UniversityStudent 클래스의 score 변수를 주석으로 처리하여 score 변수가 오버라이딩 되지 않도록 하면 된다.
		kim.major = "컴퓨터 공학";
		
		// System.out.println(kim.name + "의 점수: " + kim.score);
		kim.printInfo();
	}

}
