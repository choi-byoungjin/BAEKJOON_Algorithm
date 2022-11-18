import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for(int i = n; i > 0; i--){
			a = a + i;
		}
		System.out.println(a);
		sc.close();
	}

}
