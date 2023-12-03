package inheritance1;

public class InheritanceTest1 {

	public static void main(String[] args) {
		
		UniversityStudent kim = new UniversityStudent();
		
		kim.name = "김둘리";
		kim.setScore(83);
		kim.major = "컴퓨터 공학";
		System.out.println(kim.getName() + "의 점수: " + kim.score);
		
		
		HighStudent park = new HighStudent();
		park.name = "박또치";
		park.setScore(100);
		park.classNumber = 6;
		System.out.println(park.getName() + "의 점수: " + park.score);
	}

	/*
	 * 상속을 이용하면 클래스에 필요한 변수와 메소드를 재사용할 수 있어서 원하는 클래스를 쉽게 만들 수 있다.
	 * 참고로 상속과 관련한 예약어가 inheritance가 아닌 확장이라는 의미의 extends인 이유는 상속이 단순히 소스를 물려받는 것만을 의미하지 않기 때문이다.
	 * 상속은 자식 클래스에서 멤버 변수나 메소드를 추가로 확장했을 때 의미를 가진다.
	*/
}
