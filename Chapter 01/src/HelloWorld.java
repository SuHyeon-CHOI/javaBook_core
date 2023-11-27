
public class HelloWorld {

	public static void main(String[] args) { // main() 메소드는 프로그램을 실행할 때 자동으로 호출되는 특수한 형태의 함수이다.
		/*=> main() 메소드가 없는 클래스는 실행할 수 없다는 의미 */
		System.out.println("Hello World^^");

	}

}

/*
 * 클래스 이름과 파일 이름은 반드시 동일해야 한다. 클래스 이름이 HelloWorld이면 파일 이름도 동일해야 한다.
 * 테스트 목적이 아닌 이상 하나의 파일에 하나의 클래스만 작성한다.
 * 클래스 이름은 대문자로 시작하고 새로운 단어가 결합될 때 첫 글자를 대문자로 처리한다.=> camel case
 * 시작 블록{()과 종료 불록()}을 이용하여 클래스의 시작과 종료를 지정한다.
 * public static void main(String[] args) 메소드가 있는 클래스만 실행할 수 있으며, 실행할 모든 코드는 main() 메소드의 블록 안에 위치해야 한다.
 * */