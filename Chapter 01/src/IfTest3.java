
public class IfTest3 {

	public static void main(String[] args) {
		
		int javaScore = 89;
		
		if(javaScore >= 90) {
			System.out.println(javaScore + "점은 A등급 입니다.");
		} else if(javaScore >= 80) {
			System.out.println(javaScore + "점은 B등급 입니다.");
		} else if(javaScore >= 70) {
			System.out.println(javaScore + "점은 C등급 입니다.");
		} else if(javaScore >= 80) {
			System.out.println(javaScore + "점은 D등급 입니다.");
		} else {
			System.out.println(javaScore + "점은 F등급 입니다.");
		}
	}

}
