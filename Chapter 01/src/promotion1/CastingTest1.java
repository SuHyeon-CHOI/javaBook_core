package promotion1;

public class CastingTest1 {

	public static void main(String[] args) {
		// UniversityStudent park = (UniversityStudent) new Student();
		
		Student student = new Student();
		UniversityStudent park = (UniversityStudent) student;
		
		System.out.println(park.major);
	}

}
