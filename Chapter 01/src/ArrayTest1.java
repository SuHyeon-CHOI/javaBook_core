
public class ArrayTest1 {

	public static void main(String[] args) {
		
		int kimScore = 76;
		int parkScore = 92;
		int leeScore = 49;
		int choiScore = 78;
		int pyoScore = 83;
		
		int sum = kimScore + parkScore + leeScore + choiScore + pyoScore;
		double avg = (double) sum/5;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
/*
 * 배열 객체 생성 문법 => new 데이터타입 [배열크기];
 * 배열 객체를 위한 참조 변수 선언 문법 => 데이터타입[] 참조변수;
 * 데이터 타입: 배열에 저장되는 데이터의 종류를 결정한다.
 * []: 배열 첨자라고 읽으며 현재 변수가 배열 변수임을 의미한다. 이 첨자의 개수에 따라 배열의 차원이 결정된다. 
 * 참조 변수: 배열 객체의 주소가 할당될 참조 변수의 이름이다.
 * 참조 변수에 실제로 배열 객체의 주소를 할당하기 위해 필요한 과정 => 참조변수 = new 데이터타입[배열크기]
 * 배열 변수의 선언과 객체 할당 => 데이터타입[] 참조변수 = new 데이터타입[배열크기];
 */