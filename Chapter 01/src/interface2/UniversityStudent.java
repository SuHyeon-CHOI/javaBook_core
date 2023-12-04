package interface2;

public class UniversityStudent implements Student {
	String name;
	int score;
	String major;
	
	UniversityStudent(String name, int score, String major) {
		this.name = name;
		this.score = score;
		this.major = major;
	}
	
	public void takeExam() {
		System.out.println(name + "가 강의장에서 시험지를 받는다.");
	}
	
	public void solveExam() {
		System.out.println(name + "가 강의장에서 문제를 푼다.");
	}
	
	public void submitExam() {
		System.out.println(name + "가 강의장에서 시험지를 제출한다.");
	}
}
