
public class SortTest2 {

	public static void main(String[] args) {
		
		int[] rotto = {7, 44, 16, 32, 1, 22};
		
		int temp=0;
		for (int i=0; i<rotto.length; i++) {
			// 한 번 반복할 때마다 그다음 반복 횟수를 하나씩 줄인다.
			for (int j=0; j<rotto.length-(i+1); j++) {
				// 자리바꿈
				if (rotto[j]>rotto[j+1]) {
					temp = rotto[j];
					rotto[j] = rotto[j+1];
					rotto[j+1] = temp;
				}
			}
		}
		
		System.out.println("로또 번호 정렬 결과");
		for (int number : rotto) {
			System.out.print(number + ", ");
		}
	}

}
