package constructor;

public class Student {
	public String name;
	public int score;
	public boolean isPassed;
	public String major;
	
	public Student() {
		// 매개변수가 없는 기본 생성자. 멤버 변수를 기본값으로 초기화한다.
	}
	
	public Student(String stdName, int stdScore) { 
		name = stdName;
		score = stdScore;
	}
	
//	public Student(String stdName, int stdScore, boolean stdIsPassed, String stdMajor) {
//		// 두 번째 생성자는 모든 멤버 변수에 매개변수로 받은 값을 설정하는 생성자
//		name = stdName;
//		score = stdScore;
//		isPassed = stdIsPassed;
//		major = stdMajor;
//	}
	
	public Student(String name, int score, boolean isPassed, String major) {
		this(name, score);
		// this.score = score;
		this.isPassed = isPassed;
		this.major = major;
		// 생성자에서 this와 결합된 변수는 자동으로 멤버 변수를 의미하며, this가 없는 매개변수는 매개변수로 인식된다.
		// 따라서 동일한 이름의 매개변수와 멤버 변수를 구분하여 사용할 수 있으므로 더 이상 매개변수의 이름을 고민할 필요가 없다.
		
	}
	
	/*
	 * 생성자의 이름은 반드시 클래스의 이름과 동일해야 한다. 
	 * 그런데 생성자 중에서 클래스의 이름을 사용하지 않는 this()라는 독특한 생성자가 존재하는데, 이 this() 생성자를 이용하면 같은 클래스에 있는 다른 생성자를 호출할 수 있다.
	 * 이를 통해 생성자 내의 코드 중복을 제거할 수 있다.*/
	
	public void printInfo() {
		System.out.println(name + "의 전공: " + major + ", 점수: " + score + "(시험 통과 여부: " + isPassed + ")");
	}
}
