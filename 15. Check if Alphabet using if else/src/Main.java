import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Put a letter: ");
		String x = input.nextLine().toLowerCase();
		input.close();
		
		
		if (x.equals("a") || x.equals("b") || x.equals("c") || x.equals("d") ||
			x.equals("e") || x.equals("f") || x.equals("g") || x.equals("h") ||
			x.equals("i") || x.equals("j") || x.equals("k") || x.equals("l") ||
			x.equals("m") || x.equals("n") || x.equals("o") || x.equals("p") ||
			x.equals("q") || x.equals("r") || x.equals("s") || x.equals("t") ||
			x.equals("u") || x.equals("z") || x.equals("w") || x.equals("x") ||
			x.equals("y") || x.equals("z")) {
			System.out.println("It's an Alphabet.");
		} else {
			System.out.println("It's not.");
		}
		
		
		

	}

}
