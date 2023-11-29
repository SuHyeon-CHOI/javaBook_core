
public class ArrayTest11 {

	public static void main(String[] args) {

		int [][] scoreList = {	{76, 92, 49, 78, 83},
								{88, 69},
								{99, 92, 89}};
		
//		for (int i=0; i<scoreList.length; i++) {
//			for (int j=0; j<scoreList[i].length; j++) {
//				System.out.println("[" + i + "][" + j + "](" + scoreList[i][j] + ") ");
//			}
//			System.out.println("");
//		}
		
		// 향상된 for문
		for (int[] array : scoreList) {
			for (int score : array) {
				System.out.print(score + " ");
			}
			System.out.println("");
		}
	}

}
