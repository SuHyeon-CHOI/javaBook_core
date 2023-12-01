package school.high;

public class Student {

		
	public String name = "또치";
	public int score = 52;
	
	public Student() {
		System.out.println("===> 고등학생 생성");
	}
		
	public void printInfo() {
		System.out.println(name + "의 점수: " + score);
	}

}
