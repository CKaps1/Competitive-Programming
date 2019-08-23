import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Vauvau {
static StringTokenizer st;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		int a = readInt();
		int b = readInt();
		int c = readInt();
		int d = readInt();
		int p = readInt();
		int m = readInt();
		int g = readInt();
		
		int ab = a + b;
		int cd = c + d;
		
		if (p % ab <= a && p % cd <= c && p % ab != 0 && p % cd != 0) System.out.println("both");
		else if (p % ab > a  && p % cd > c || p % ab == 0 && p % cd == 0 ||p % ab > a && p % cd == 0 || p % cd > c && p % ab == 0 ) System.out.println("none");
		else  System.out.println("one");
		
		if (m % ab <= a && m % cd <= c && m % ab != 0 && m % cd != 0) System.out.println("both");
		else if (m % ab > a  && m % cd > c || m % ab == 0 && m % cd == 0 ||m % ab > a && m % cd == 0 || m % cd > c && m % ab == 0 ) System.out.println("none");
		else  System.out.println("one");
		
		if (g % ab <= a && g % cd <= c && g % ab != 0 && g % cd != 0) System.out.println("both");
		else if (g % ab > a  && g % cd > c || g % ab == 0 && g % cd == 0 ||g % ab > a && g % cd == 0 || g % cd > c && g % ab == 0 ) System.out.println("none");
		else  System.out.println("one");
		
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