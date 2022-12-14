import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        int[] arr = new int[26];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        
        for(int i = 0; i < S.length(); i++){
            char a = S.charAt(i);
            
            if(arr[a - 97] == -1){
                arr[a - 97] = i;
            }
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
