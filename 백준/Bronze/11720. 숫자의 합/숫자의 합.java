import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    
        String a = sc.next();
        
        String[] arr = a.split("");
        
        int sum = 0;
        
	    for(int i = 0; i < N; i++){
	        sum = sum + a.charAt(i)-'0';
	    }
	    
	    System.out.println(sum);
	}
}
