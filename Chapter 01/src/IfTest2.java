
public class IfTest2 {

	public static void main(String[] args) {
		
		int javaScore = 20;
		
		if(javaScore >= 60) {
			System.out.println(javaScore + "점은 합격입니다.");
		} else {
			if(javaScore <= 30) {
				System.out.println(javaScore + "점은 페널티 대상입니다.");
			} else { 
				System.out.println(javaScore + "점은 불합격입니다.");
			}
		} 
	}

}
