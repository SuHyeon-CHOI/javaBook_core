package abstract1;

public class HighStudent extends Student {
//	String name;
//	int score;
	
	HighStudent(String name, int score) {
//		this.name = name;
//		this.score = score;
		super(name, score);
	}
	
//	void takeExam() {
//		System.out.println(name + "가 교실에서 시험지를 받는다.");
//	}
//	
//	void solveExam() {
//		System.out.println(name + "가 교실에서 문제를 푼다.");
//	}
//	
//	void submitExam() {
//		System.out.println(name + "가 교실에서 시험지를 제출한다.");
//	}
	
	void examTake() {
		System.out.println(name + "가 교실에서 시험지를 받는다.");
	}
	
	void examSolve() {
		System.out.println(name + "가 교실에서 문제를 푼다.");
	}
	
	void examSubmit() {
		System.out.println(name + "가 교실에서 시험지를 제출한다.");
	}
}
/*
 * 부모 클래스가 추상 클래스일 때 자식 클래스는 반드시 부모의 추상 메소드를 오버라이딩해야 한다.
 * 그렇지 않으면 자식 클래스로 추상 메소드가 상속되어 자식 클래스도 추상 클래스가 되기 때문이다.
*/
