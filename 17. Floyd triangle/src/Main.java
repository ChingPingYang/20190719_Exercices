
public class Main {

	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				num ++;
				System.out.printf("%2d ", num);
			}
			System.out.println("");
		}

	}

}
