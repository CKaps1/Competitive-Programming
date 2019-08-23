import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Electrical {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args)throws IOException {
		int x1 = Integer.parseInt(next());
		int y1 = Integer.parseInt(next());
		int x2 = Integer.parseInt(next());
		int y2 = Integer.parseInt(next());
		int f = readInt();
		
		int l = Math.abs(y2-y1) + Math.abs(x2 - x1);
		if (l%2 ==0) {
			if (f%2 != 0 || f < l) System.out.println('N');
			if (f % 2 == 0 && f >= l) System.out.println('Y');
		}
		if (l % 2 != 0) {
			if (f%2 != 0 && f >= l) System.out.println('Y');
			if (f%2 ==0 || f < l) System.out.println('N');
		}
	}
	static String next () throws IOException {
		  while (st == null || !st.hasMoreTokens())
		   st = new StringTokenizer(br.readLine().trim());
		  return st.nextToken();
		 }
		 static long readLong () throws IOException {
		  return Long.parseLong(next());
		 }
		 static int readInt () throws IOException {
		  return Integer.parseInt(next());
		 }
		 static double readDouble () throws IOException {
		  return Double.parseDouble(next());
		 }
		 static char readCharacter () throws IOException {
		  return next().charAt(0);
		 }
		 static String readLine () throws IOException {
		  return br.readLine().trim();
		 }
		 
		 
	}



