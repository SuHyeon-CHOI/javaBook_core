package interface3;

public class InterfaceTest3 {

	public static void main(String[] args) {
		
		// Calculable[] memberList = new Calculable[3];
		// memberList[0] = new UniversityStudent();
		// memberList[1] = new HighStudent();
		// memberList[2] = new RPGGamer();
		
		Calculable[] memberList = {new UniversityStudent(), new HighStudent(), new RPGGamer()};
		
		for (int i=0; i<memberList.length; i++) {
			memberList[i].calculate();
		}
	}

}
