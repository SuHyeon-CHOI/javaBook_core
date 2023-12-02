package school.high;

public class Student {

		
	public String name = "또치";
	public int score = 52;
	public int firstScore;
	public int secondScore;
	
	public Student() {
		System.out.println("===> 고등학생 생성");
	}
		
	public void printInfo() {
		System.out.println(name + "의 점수: " + score);
	}
	
	public int printAvg(double javaScore, double pythonScore) {
		System.out.println("printAvg(int, int) 호출");
		int sumScore = (int) (javaScore + pythonScore);
		int avgScore = sumScore/2;
		return avgScore;
	}
//	
//	public int printAvg(int javaScore, int pythonScore, int sqlScore) {
//		System.out.println("printAvg(int, int, int) 호출");
//		int sumScore = javaScore + pythonScore + sqlScore;
//		int avgScore = sumScore/3;
//		return avgScore;
//	}
//	
//	public int printAvg(double javaScore, int pythonScore) {
//		System.out.println("printAvg(double, int) 호출");
//		int sumScore = (int) javaScore + pythonScore;
//		int avgScore = sumScore/2;
//		return avgScore;
//	}

}
