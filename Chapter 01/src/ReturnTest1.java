
public class ReturnTest1 {

	public static void main(String[] args) {
		
		System.out.println("main() 시작");
		otherMethod(); // 메소드 호출 
		System.out.println("main() 종료");
	}
	
	private static void otherMethod() {
		System.out.println("otherMethod() 시작");
		for (int i=1; i<=10; i++) {
			if (i==5) {
				return; // return을 만나면 메소드의 수행은 중단되고 해당 메소드가 호출된 곳으로 이동한다.
			}
		}
		System.out.println("otherMethod() 종료");
	}

}