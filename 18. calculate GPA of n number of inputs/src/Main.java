import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of input: ");
		float num = input.nextInt();
		float total = 0;
		float result = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.println("No." + i + ": ");
			float numi = input.nextInt();
			total += numi;
		}
		result = total / num;
		System.out.println("The GPA is: " + result);
		
	}
}
