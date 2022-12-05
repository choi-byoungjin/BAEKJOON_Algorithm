import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double TOT = 0;
		
		double[] arr = new double[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < N; i++) {
			arr[i] = arr[i] / arr[N-1] * 100;
			TOT += arr[i];
		}
		System.out.println(TOT/N);
		sc.close();
	}
}