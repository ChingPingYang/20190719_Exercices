public class Main {

	public static void main(String[] args) {
		
		//Way One
		String star = "*****";
		
		for (int i = 5; i >= 0; i--) {
			star = star.substring(0,i);
			System.out.println(star);
		}
		
		
		// Way Two
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
