
public class ArrayTest8 {

	public static void main(String[] args) {
		
//		System.out.println(args.length + "개의 데이터가 전달되었습니댜.");
//		
//		for (int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		
		System.out.println(args.length + "명의 평균 점수: " + (double) sum/args.length);
	}

}

/*
 * 프로그램을 실행할 때 외부로부터 전달된 데이터는 main() 메소드에서 받아주는데, 이때 사용되는 것이 main() 메소드에 선언된 String[] 타입의 args라는 매개변수이다.
 * => 명령행 매개변수로 전달된 데이터는 자동으로 문자열 배열 형태로 전달되는 것이다.
*/
