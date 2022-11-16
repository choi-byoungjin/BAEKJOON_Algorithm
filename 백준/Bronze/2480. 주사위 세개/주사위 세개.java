import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		int price = 0;
		int top = 0;

		if(A == B && A == C && B == C){
			price = 10000 + A * 1000;
		} else if(A == B && A != C){
			price = 1000 + A * 100;
		} else if(A == C && A != B){
			price = 1000 + A * 100;
		} else if(B == C && A != B){
			price = 1000 + B * 100;
		} else if(A != B && A != C && B != C){
			if(A > B && A > C){
				top = A;
			} else if (B > A && B > C){
				top = B;
			} else if (C > A && C > B){
				top = C;
			}
			price = top * 100;
		}
		System.out.println(price);

		sc.close();
	}
}
