
public class ArrayTest6 {

	public static void main(String[] args) {
		
		double[] scoreList = {76, 92.4, 49, 78.3, 83.7};
		
		System.out.println(scoreList.length + "개의 점수 현황");
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.println("scoreList[" + i + "]: " + scoreList[i]);
		}
	}

}
/*
 * 생성된 배열 객체는 double 타입이지만 int 타입의 데이터가 double 타입으로 변환될 수 있기 때문에 double 타입의 배열에 등록될 수 있는 것이다.
*/