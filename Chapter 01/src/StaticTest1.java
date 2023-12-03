import static1.Student;

public class StaticTest1 {

	public static void main(String[] args) {
//		Student kim = new Student("쌤즈 대학교", "김둘리", 83);
//		kim.printInfo();
//		
//		Student park = new Student("쌤즈 대학교", "박또치", 74);
//		kim.printInfo();
//		
//		Student choi = new Student("쌤즈 대학교", "최도우너", 100);
//		choi.printInfo();

		System.out.println(Student.schoolName + " 학생들의 시험 결과");
		Student kim = new Student("김둘리", 83);
		kim.printInfo();

//		Student park = new Student("박또치", 74);
//		park.printInfo();
//
//		Student choi = new Student("최도우너", 100);
//		choi.printInfo();
		
		Student.schoolName = "루비 대학교";
		System.out.println(Student.schoolName + " 학생들의 시험 결과");
		Student park = new Student("박또치", 74);
		park.printInfo();
		
		Student choi = new Student("최도우너", 100);
		choi.printInfo();
		
		System.out.println("전체 생성된 Student 객체의 수: " + Student.studentCount);
	}
}
/*
 * 클래스로부터 객체를 생성할 때 객체에는 멤버 변수만 포함되고 메소드는 공유된다. 따라서 세 개의 Student 객체를 생성했을 때 총 세
 * 개(schoolName, name, score)의 멤버 변수가 세 개의 객체에 각각 포함된다. Student 객체에 포함된 멤버 변수
 * 중에서 name과 score는 각 객체가 다른 값을 가지기 때문에 당연히 생성되는 객체마다 포함되는 것이 맞다. 하지만
 * schoolName은 어차피 생성된 모든 Student 객체의 학교 이름이 "쌤즈 대학교" 이므로 객체가 생성될 때마다
 * schoolName을 모든 객체에 포함시키는 것은 문제가 있다. 이때 schoolName 변수 앞에 static을 붙이면 이런 문제를
 * 효율적으로 해결할 수 있다.
 */
