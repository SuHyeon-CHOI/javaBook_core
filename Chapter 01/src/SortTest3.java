
public class SortTest3 {

	public static void main(String[] args) {
		
		 int[] rotto = {7, 44, 16, 32, 1, 22};
		 
		 java.util.Arrays.sort(rotto); // 배열 변수 구문을 사용하면 배열 변수가 참조하는 배열 객체의 숫자가 자동으로 오름차순 정렬된다. 
		 
		 System.out.println("로또 번호");
		 for (int number : rotto) {
			 System.out.print(number + ", ");
		 }
	}

}
