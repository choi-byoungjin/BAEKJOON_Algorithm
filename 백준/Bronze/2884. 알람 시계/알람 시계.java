import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();

		if(M - 45 < 0) {
			H--;
			M = 60 + M - 45;
			if(H < 0){
				H = 23;
			} 
			System.out.print(H + " " + M);
		} else {
			System.out.print(H + " " + (M - 45));
		}
		sc.close();
	}
}
