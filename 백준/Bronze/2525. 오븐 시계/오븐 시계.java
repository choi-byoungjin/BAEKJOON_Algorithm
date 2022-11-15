import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		int D = (B + C) / 60;

		A = A + D;
		B = (B + C) % 60;

		if(A >= 24){
			A = A - 24;
		}

		System.out.println(A + " " + B);

		sc.close();
	}
}
