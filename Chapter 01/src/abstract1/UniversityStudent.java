package abstract1;

public class UniversityStudent extends Student {
//	String name;
//	int score;
	
	UniversityStudent(String name, int score) {
//		this.name = name;
//		this.score = score;
		super(name, score);
	}
	
	void examTake() {
		System.out.println(name + "가 강의장에서 시험지를 받는다.");
	}
	
	void examSolve() {
		System.out.println(name + "가 강의장에서 문제를 푼다.");
	}
	
	void examSubmit() {
		System.out.println(name + "가 강의장에서 시험지를 제출한다.");
	}
}