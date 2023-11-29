
public class ArrayTest2 {

	public static void main(String[] args) {
		
		int score = 83;
		int[] scoreList = new int[5];
		
		System.out.println("기본형 score: " + score);
		System.out.println("참조형 scoreList: " + scoreList);
	}

}
/*
 * 기본 타입 변수인 score에는 값 자체가 할당되는 반면, 참조 타입 변수인 scoreList에는 배열 객체의 메모리 주소가 할당됨
 */