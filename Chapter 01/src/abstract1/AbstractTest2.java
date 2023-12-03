package abstract1;

public class AbstractTest2 {

	public static void main(String[] args) {
		UniversityStudent kim = new UniversityStudent("김둘리", 83);
		kim.doExam();
		
		System.out.println("");
		
		UniversityStudent park = new UniversityStudent("박또치", 83);
		park.doExam();
	}

}
