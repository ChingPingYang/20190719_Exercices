
public class Main {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		for(int i = 1; i <= 10; i++) {
			num = i;
			result = i * num;
			System.out.printf("%2d x %2d = %3d\n", i, num, result);	
		}
	}
}
