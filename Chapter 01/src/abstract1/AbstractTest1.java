package abstract1;

public class AbstractTest1 {

	public static void main(String[] args) {
		UniversityStudent kim = new UniversityStudent("김둘리", 83);
		kim.examTake();
		kim.examSolve();
		kim.examSubmit();
		
//		HighStudent kim = new HighStudent("김둘리", 83);
//		kim.takeExam();
//		kim.solveExam();
//		kim.submitExam();
		
		System.out.println("");
		
//		UniversityStudent park = new UniversityStudent("박또치", 100);
//		park.examTake();
//		park.examSolve();
//		park.examSubmit();
		
		HighStudent park = new HighStudent("박또치", 100);
//		park.takeExam();
//		park.solveExam();
//		park.submitExam();
		park.examTake();
		park.examSolve();
		park.examSubmit();
	}

}
/*
 * 문법적으로 하나 이상의 추상 메소드를 가진 클래스를 추상 클래스라고 한다.
 * 추상 메소드는 로직을 가지지 않기 때문에 일반 메소드처럼 호출되어서는 안 된다.
 * 따라서 자바는 추상 메소드를 포함하는 추상 클래스의 객체 생성을 문법적으로 허용하지 않는 것이다.
 * 
*/