import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a,b,c,d,e,f;
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    d = sc.nextInt();
	    e = sc.nextInt();
	    f = sc.nextInt();
	    
	    int king = 1 - a;
	    int queen = 1 - b;
	    int rook = 2 - c;
	    int Bishop = 2 - d;
	    int knite = 2 - e;
	    int pawn = 8 - f;
	    
		System.out.print(king + " " + queen + " " + rook + " " + Bishop + " " + knite + " " + pawn);
    }
}
