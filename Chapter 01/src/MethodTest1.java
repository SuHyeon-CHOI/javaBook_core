
public class MethodTest1 {

	public static void main(String[] args) {

		System.out.println("===> main() start");
		methodA();
		System.out.println("===> main() end");
		
	}
		
	private static void methodA() {
			System.out.println("---> methodA() start");
			methodB();
			System.out.println("---> methodA() end");
		
	}	
		private static void methodB() {
			System.out.println("methodB() 실행");
		
	}

}
