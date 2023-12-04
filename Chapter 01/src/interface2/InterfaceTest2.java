package interface2;

public class InterfaceTest2 {

	public static void main(String[] args) {
		Student kim = new UniversityStudent("김둘리", 83, "컴퓨터 공학");
		kim.takeExam();
		kim.solveExam();
		kim.submitExam();
		
		System.out.println("");
		
		Student park = new HighStudent("박또치", 100, 6);
		park.takeExam();
		park.solveExam();
		park.submitExam();
	}

}
