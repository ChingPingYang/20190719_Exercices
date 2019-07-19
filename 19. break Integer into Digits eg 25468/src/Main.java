import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give a number: ");
		int remain = input.nextInt();
		input.close();
		
		while(remain != 0) {
		System.out.println(remain % 10);
		remain = remain / 10;
		}
	}

}
