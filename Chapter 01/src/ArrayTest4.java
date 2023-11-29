
public class ArrayTest4 {

	public static void main(String[] args) {
		
		int[] scoreList = {76, 92, 49, 83, 100};
		
//		for (int i=0; i<5; i++) {
//			System.out.println("scoreList[" + i + "]: " + scoreList[i]);
//		}
		
		//향상된 for문
		for (int score: scoreList) {
			System.out.println("score: " + score);
		}
	}

}
