import static1.Student;

public class StaticTest2 {

	public static void main(String[] args) {
		
		System.out.println(Student.schoolName + "학생들의 시험 결과");
		Student kim = new Student("김둘리", 83);
		kim.printInfo();
		
		Student.schoolName = "루비 대학교";
		System.out.println(Student.schoolName + " 학생들의 시험 결과");
		Student park = new Student("박또치", 74);
		park.printInfo();
		
		Student choi = new Student("최도우너", 100);
		choi.printInfo();
		Student.schoolInfo();
	}

}
