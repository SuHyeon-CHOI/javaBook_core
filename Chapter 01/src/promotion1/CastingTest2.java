package promotion1;

public class CastingTest2 {

	public static void main(String[] args) {
		// 묵시적 타입 변환
		Student student = new UniversityStudent();
		
		// 명시적 타입 변환
		UniversityStudent park = (UniversityStudent) student;
		System.out.println(park.major);
	}

}
/*
 * 자바는 묵시적 타입 변환됐던 객체를 원래 자신의 타입으로 되돌리는 형태의 명시적 타입 변환만 허용한다.
*/