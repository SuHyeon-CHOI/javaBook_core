
public class BreakTest3 {

	public static void main(String[] args) {
		
		outer: for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (j>i) {
					break outer;
				}
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
