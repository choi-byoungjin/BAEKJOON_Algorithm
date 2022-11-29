import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
		    int n = sc.nextInt();
		    arr[i] = n;
		}
		int v = sc.nextInt();
		int o = 0;
		for(int j = 0; j < N; j++){
		    if (arr[j] == v) {
		        o++;
		    }
		}
		System.out.println(o);
	}
}