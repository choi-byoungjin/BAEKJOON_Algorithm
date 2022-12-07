import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arrClass = new int[sc.nextInt()];
		
		for(int i = 0; i < arrClass.length; i++) {
		    
		    int[] arrStd = new int[sc.nextInt()];
		    
		    int sum = 0;
		    int count = 0;
		    double avg = 0;
		    
		    for(int j = 0; j < arrStd.length; j++){
		        arrStd[j] = sc.nextInt();
		        sum += arrStd[j];
		    }
		    
		    for(int j = 0; j < arrStd.length; j++){
		        if(sum / arrStd.length < arrStd[j]){
		            count++;
		        }
		    }
		    avg = ((double)count/arrStd.length) * 100;
		    
		    System.out.printf("%.3f",avg);
		    System.out.println("%");
		}
        
        sc.close();
		
	}
}