// package 선언
package school.university;

// 1. 클래스 선언부
public class Student {
	
	// 2. 멤버 변수
	public String name = "둘리";
	private int score = 83;
	
	// 3. 생성자 메소드
	public Student() {
		System.out.println("---> Student 객체 생성");
	}
	
	// 로컬 변수만 사용하는 메소드
	public int forTest() {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum = sum + 1;
		}
		return sum;
		// System.out.println("1 ~ 100까지의 합: " + sum);
	}
	
	
	// 4. 메소드 (멤버 변수만 사용하는 메소드)
	public String printInfo() {
		// System.out.println(name + "의 점수: " + score);
		return name + "의 점수: " + score;
	}
	
	// 멤버 변수와 로컬 변수를 모두 사용하는 메소드
	public double printAvg(int javaScore, int pythonScore, int sqlScore) {
		System.out.println("printAvg(int, int, int) 호출");
		int sumScore = javaScore + pythonScore + sqlScore;
		int avgScore = sumScore/3;
		// System.out.println(name + "의 세 과목 평균 점수: " + avgScore);
		return avgScore;
	}

}
