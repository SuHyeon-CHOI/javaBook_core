package promotion1;

public class Student extends Human {
	int score = 100;
}
/*
 * UnoversityStudent 타입의 kim이라는 참조 변수에는 UniversityStudent 타입의 객체가 할당되어 있고,
 * kim이라는 참조 변수를 이용하면 부모로부터 상속된 score와 자신이 확장한 major 변수를 모두 사용할 수 있다.
 * 그리고 실제 kim 변수가 참조하는 UniversityStudent 객체 역시 두 개의 멤버 변수를 가지고 있기 때문에 kim을 통해 두 개의 변수(score, major)를 모두 사용할 수 있다.
 */

/*
 * 참조 변수가 자신이 선언된 타입보다 더 많은 멤버 변수를 가진 객체를 참조하는 것을 묵시적 타입 변환이라고 한다. 
 * 참조 변수를 통해 실제 사용할 수 있는 멤버 변수는 참조 변수가 선언된 클래스에 속한 변수 (score) 뿐이다. 
 * kim이라는 참조 변수 입장에서는 사용할 수 있는 변수가 score 하나뿐이더라도 선언 자체가 Student 타입이기 때문에 kim 입장에서는 전혀 손해가 아닌 것이다.
 */