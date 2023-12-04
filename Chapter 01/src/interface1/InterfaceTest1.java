package interface1;

public class InterfaceTest1 {

	public static void main(String[] args) {
		Student kim = new Student("김둘리", 83);
		System.out.println("게임의 최고 레벨 (Gamer): " + Gamer.GAME_MAX_LEVEL);
		System.out.println("게임의 최고 레벨 (Singer): " + Singer.GAME_MAX_LEVEL);
		kim.doGame();
		System.out.println(kim.name + "의 점수: " + kim.score);
		
		System.out.println("오디션 최대 기회: " + Singer.AUDITION_MAX_CHANCE);
		kim.singSong();
	}

}

/*
 * 추상 클래스와 마찬가지로 추상 메소드를 포함하고 있는 인터페이스 역시 객체로 생성할 수 없다.
 * 따라서 인터페이스도 추상 클래스처럼 상속 구조에서 최상위 부모 클래스로만 사용된다.
 * 다만 인터페이스를 상속할 때는 extends가 아닌 '구현한다'는 의미의 implements 예약어를 사용한다.
 * 그리고 클래스를 상속할 때와 다르게 인터페이스는 다중 상속을 허용한다. 
 * 이는 인터페이스가 상수만을 가지기 때문이다.
*/

/*
 * 인터페이스를 상속한 자식 클래스는 반드시 인터페이스에 정의되어 있는 모든 추상 메소드를 오버라이딩해야 한다.
 * 그렇지 않으면 자식 클래스를 추상 클래스로 선언해야 한다.
*/
