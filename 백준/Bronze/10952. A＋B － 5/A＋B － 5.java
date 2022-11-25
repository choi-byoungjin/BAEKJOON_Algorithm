import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
 
		Scanner in = new Scanner(System.in);
 
		//int T = in.nextInt();
        
		while(true) {
			int A = in.nextInt();
			int B = in.nextInt();
			if(A == 0){
			    break;
			}
            System.out.println(A+B);
		}

		in.close();
	}
}