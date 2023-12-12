
public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
		
			System.out.println("나누기 결과: " + (number1 / number2));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("반드시 2개의 정수를 입력하세요.");
		}
	}

}
