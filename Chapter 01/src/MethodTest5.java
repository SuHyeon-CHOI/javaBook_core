
public class MethodTest5 {

	public static void main(String[] args) {
		
		int firstScore = 99;
		int secondScore = 33;
		
		System.out.println("before(fitstScore): " + firstScore);
		System.out.println("before(secondScore): " + secondScore);
		
		swapScore(firstScore, secondScore);
		
		System.out.println("after(firstScore): " + firstScore);
		System.out.println("after(secondScore): " + secondScore);
		
	}
	
	private static void swapScore(int score1, int score2) {
		int temp = score1;
		score1 = score2;
		score2 = temp;
		System.out.println("swapScore() 에서 score1: " + score1);
		System.out.println("swapScore() 에서 score2: " + score2);
	}

}
