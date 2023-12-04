package interface1;

public class Student implements Singer { // 인터페이스에 대한 다중 상속은 콤마(,)를 이용한다.
	String name;
	int score;
	
	Student(String name, int score) { 
		this.name = name;
		this.score = score;
	}
	
	public void doGame() {
		System.out.println(name + " 게임을 한다.");
	}
	
	public void singSong() {
		System.out.println(name + " 노래를 부른다.");
	}
}

/*
 * 이렇게 두 개의 인터페이스를 상속한 Student 클래스에는 Gamer와 Singer가 가지고 있는 총 세 개의 상수가 상속된다.
 * 이 중에 GAME_MAX_LEVEL은 중복되는 상수다.
 * 하지만 이렇게 중복되는 상수가 있어도 문법적으로 문제가 없는 것은 static이 붙은 상수는 실제 사용할 때 인터페이스 이름과 결합하여 Gamer, GAME_MAX_LEVEL이나 Singer, GAME_MAX_LEVEL처럼 사용하기 때문이다.
*/