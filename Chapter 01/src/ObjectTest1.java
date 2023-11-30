
public class ObjectTest1 {

	public static void main(String[] args) {
		
		Student kim = new Student();
		kim.score = 83;
		System.out.println("kim 점수: " + kim.score);
		
		
		// 객체의 주소 복사
		Student copyKim = kim;
		
		copyKim.score = 65;
		System.out.println("copyKim 점수: " + copyKim.score);
		System.out.println("kim 점수: " + kim.score);
	}

}
