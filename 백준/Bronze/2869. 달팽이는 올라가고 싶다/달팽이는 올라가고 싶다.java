import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] ABV = br.readLine().split(" ");
		
		double A = Integer.parseInt(ABV[0]); 
		double B = Integer.parseInt(ABV[1]);
		double V = Integer.parseInt(ABV[2]); 
		
		int X = (int) Math.ceil((V - B) / (A - B)); 
		
		bw.write(String.valueOf(X));
		
		br.close();
		bw.flush();
		bw.close();
	}
}