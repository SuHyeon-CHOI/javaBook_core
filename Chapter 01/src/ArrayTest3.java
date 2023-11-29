
public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[] scoreList = new int[5];
		scoreList[0] = 76;
		scoreList[1] = 92;
		scoreList[2] = 49;
		
		System.out.println("scoreList[0]: " + scoreList[0]);
		System.out.println("scoreList[1]: " + scoreList[1]);
		System.out.println("scoreList[2]: " + scoreList[2]);
		System.out.println("scoreList[3]: " + scoreList[3]);
		System.out.println("scoreList[4]: " + scoreList[4]);
	}

}
/*
 * 배열 객체를 생성하면서 동시에 초기화를 처리하는 코드
 * int[] scoreList = {76, 92, 49, 83, 100};
 */