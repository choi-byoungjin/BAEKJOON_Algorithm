import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	    int min = 1000000;
	    int max = -1000000;
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++){
		    int n = sc.nextInt();
		    arr[i] = n;
		}
		
		for(int j = 0; j < N; j++){
		    if (arr[j] < min) {
		        min = arr[j];
		    }
		    
		    if (arr[j] > max){
		        max = arr[j];
		    }
		}
		
		System.out.println(min + " " + max);
	}
}