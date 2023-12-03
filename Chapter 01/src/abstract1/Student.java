package abstract1;


// 추상 클래스 선언
public abstract class Student {
	String name;
	int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
//	void examTake() {
//		System.out.println("시험지를 받는다.");
//	}
//	
//	void examSolve() {
//		System.out.println("문제를 푼다.");
//	}
//	
//	void examSubmit() {
//		System.out.println("시험지를 제출한다.");
//	}
	
	// 추상 메소드 선언
	abstract void examTake();
	abstract void examSolve();
	abstract void examSubmit();
	
	// 알고리즘을 제공하는 일반 메소드
	final void doExam() {
		examTake();
		
		// 5개의 문제를 푼다.
		for (int i=0; i<5; i++) {
			examSolve();
		}
		examSubmit();
	}
}
