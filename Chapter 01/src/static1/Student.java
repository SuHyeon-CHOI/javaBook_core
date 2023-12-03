package static1;

/*
 * 특정 클래스로부터 생성되는 모든 객체들이 동일한 값을 가지는 멤버 변수가 있는 경우, 해당 멤버 변수를 static으로 선언한다.
 * 클래스에 선언된 멤버 변수는 클래스로부터 객체가 생성될 때 객체에 포함되지만, static이 붙은 멤버 변수는 객체에 포함되지 않고 별도의 메모리 공간에 올라간다.
*/
public class Student {
	public static String schoolName = "쌤즈 대학교";
	public static int studentCount;
	String name;
	int score;
	public static Student studentInstance;
	
	static {
		if(studentInstance == null) {
			studentInstance = new Student("고길동", 100);
		}
	}

	public Student(String name, int score) {
		// this.schoolName = schoolName;
		studentCount++;
		this.name = name;
		this.score = score;
	}

	public void printInfo() {
		System.out.println(name + " (" +  schoolName + ")의 점수: " + score);
	}

/*
 * static 예약어가 붙은 schoolName 변수는 Student 객체가 생성될 때 객체에 포함되지 않고 static 코드만을 위한
 * 별도의 메모리 공간에 올라간다. 정확하게는 static 변수는 Student.class 파일이 로딩되는 시점에 메모리에 올라간다.
 * 
 * static 메모리 영역에 있는 static 변수에 접근하는 방법은 두 가지가 있다. 첫 번째는 기존과 동일하게 참조 변수를 사용하는
 * 것이며, 두 번째는 클래스 이름을 통해 직접 접근하는 것이다.
 */

/*
 * static 예약어는 멤버 변수뿐만 아니라 메소드 앞에서도 설정이 가능하다. 
 * static 메소드 역시 static 변수와 마찬가지로 객체를 생성하지 않고 클래스 이름으로 직접 호출할 수 있다.
 * 따라서 자주 사용하는 메소드이지만 그 메소드를 호출하기 위해 메소드가 속해 있는 객체를 생성하기에는 뭔가 부담스러운 경우에 static 메소드로 선언한다.
 */
 
/*
 * 객체를 생성하고 참조 변수를 통해서만 접근할 수 있는 일반 멤버 변수는 static 메소드에서 사용할 수 없다.
 * => 멤버 변수와 static 메소드가 같은 클래스 안에 존재하더라도 물과 기름이라고 생각하면 된다.
 * 결론은 static 메소드에서는 같은 메모리 공간에 있는 static 변수만 사용할 수 있다는 것이다.
 */
	
	public static void schoolInfo() {
		System.out.println(Student.schoolName + "학생 수: " + Student.studentCount);
	}
}

/*
 * 생성자가 private으로 막혀 있기 때문에 생성자를 호출하여 Student 객페를 생성할 수는 없다.
 * 다만 static 블록이 있어서 static 블록에서 Student 객체를 생성하여 static 변수인 studentInstance에 할당하고 있다.*/