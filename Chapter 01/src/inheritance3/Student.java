package inheritance3;

public class Student {
	static final String schoolName = "쌤즈 대학교";
	String name;
	
	Student(String name) {
		System.out.println("===> Student(String name) 생성자 호출");
		this.name = name;
	}
	
	String printInfo() {
		return "학생 이름: " + name;
	}
}
