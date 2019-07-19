import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give a number: ");
		int x = input.nextInt();
		input.close();
		
		int result = 1;
		
		for (int i = x; i >=1; i--) {
			result = result * i;
		}
		System.out.printf("The Factorial of %d is: %d", x, result);
	}
}
