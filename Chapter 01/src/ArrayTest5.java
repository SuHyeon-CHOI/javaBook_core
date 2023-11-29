
public class ArrayTest5 {

	public static void main(String[] args) {
		
		int[] scoreList = {76, 92, 49, 83, 100};
		
//		for(int i=0; i<=5; i++) {
//			System.out.println("scoreList[" + i + "]: " + scoreList[i]);
//		}
		
		System.out.println(scoreList.length + "개의 점수 현황");
		for(int i=0; i<scoreList.length; i++) {
			System.out.println("scoreList[" + i + "]: " + scoreList[i]);
		}
	}

}
/*
 * 첫 번째 주석으로 처리된 부분은 에러가 나는 코드이다.
 * 에러의 원인은 존재하지 않는 배열 인덱스(5) 에 접근하고 있기 때문이다. => ArrayIndexOutOfBoundsException
 
 *참고로 배열은 생성되는 순간 크기가 결정되기 때문에 배열에 저장하는 데이터의 개수를 늘리려면 새로운 배열을 생성하고 기존의 값들을 복사해야 한다.
 */
