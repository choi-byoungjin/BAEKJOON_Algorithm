/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int i = in.nextInt();
	    final int z = i;
	    int o = 1;
	    while(true){
    		int a; // 10의자리수
    		int b; // 1의자리수
    		if(i % 10 == i){
    		    a = 0;
    		    b = i;
    		} else {
    		    a = (i / 10) % 10;
    		    b = i % 10;
    		}
    		int c = b;
    		int d = a + b;
    		if(d % 10 != d){
    		    d = d % 10;
    		}
    		String nt = "" + c + d;
    		int ne = Integer.parseInt(nt);
    		if(ne == z){
    		    break;
    		} else {
    		    i = ne;
    		}
    		o++;
	    }
	    System.out.println(o);
	}
}
