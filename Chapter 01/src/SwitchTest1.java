
public class SwitchTest1 {

	public static void main(String[] args) {
		
		char grade = 'C';
		
		switch (grade) {
		case 'A' :
			System.out.println("A등급은 90~100 사이의 점수입니다.");
			break;
		case 'B' :
			System.out.println("B등급은 80~89 사이의 점수입니다.");
			break;
		case 'C' :
			System.out.println("C등급은 70~79 사이의 점수입니다.");
			break;
		case 'D' :
			System.out.println("D등급은 60~69 사이의 점수입니다.");
			break;
		default : 
			System.out.println("존재하지 않는 등급입니다.");
		}
	}

}
