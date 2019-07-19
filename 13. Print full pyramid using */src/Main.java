
public class Main {
	public static void main(String[] args) {
		
		//Way Two
		String[][] x = {{" "," "," ","*"," "," "," "},
						{" "," ","*","*","*"," "," "},
						{" ","*","*","*","*","*"," "},
						{"*","*","*","*","*","*","*"}}; 
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println("");
		}
		
		
		//Way Two
		int h = 1;
		for (int i = 4; i >= 0 ; i--) {
			
			for (int b = 0; b <= i-1 ; b++) {
				System.out.print(" ");
			}
			
			for (int s = 0; s < h ; s++) {
				System.out.print("*");
				
			}
			h = h + 2;
			System.out.println("");
		}
		
		
	}
}
