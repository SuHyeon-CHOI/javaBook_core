
public class WhileTest2 {

	public static void main(String[] args) {
		
		int dan = 2;
		while (dan <= 9) {
			
			System.out.println("== " + dan + "단 ==");
			int i = 1;
			while (i <= 9) {
				System.out.println(dan + " X " + i + " = " + (dan * i));
				i++;
			}
			
			dan++;
			System.out.println("======================");
		}
	}

}
