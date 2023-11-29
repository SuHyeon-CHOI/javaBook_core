
public class NullTest1 {

	public static void main(String[] args) {
		
		int[] scoreList = {83, 76, 99, 100, 68};
		System.out.println(scoreList);
		scoreList = null;
		System.out.println(scoreList);
		
		String name = "김둘리";
		System.out.println(name);
		name = null;
		System.out.println(name);
	}

}
/*
 * 위 소스에서 scoreList 변수는 처음에는 배열 객체의 주소를 가지고 배열 객체를 참조하다가 null이 할당되면서 주소 정보가 사라지는 null 상태가 되었다.
 * name도 마찬가지이다. 처음에는 "김둘리"라는 문자열 객체의 주소를 가지고 있다가 이후에 null이 할당되면서 참조하고 있던 주소 정보가 사라진 것이다.
 * 참조 변수에 null이 할당된 이후에 메모리에 있는 배열 객체와 문자열("김둘리") 객체는 JVM에 의해 자동으로 메모리에서 제거되는데, 이것을 가비지 컬렉션(garbage collection)이라고 한다.
 * 이처럼 가비지 컬렉션은 참조되지 않는 객체들을 메모리에서 제거함으로써 메모리의 여유 공간을 늘리는 작업을 말한다.
 */
 