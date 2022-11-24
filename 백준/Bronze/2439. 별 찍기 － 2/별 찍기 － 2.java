import java.util.*;
public class Main 
{
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt(); //5
		for (int j = 1; j <= T; j++){
			for (int i = 0; i < T-j; i++) {
				System.out.print(" ");
			}
			for (int i = T; i > T-j; i--){
			    System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}