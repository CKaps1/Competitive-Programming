import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Guru {
static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
static StringTokenizer st;
static long accumulatorA, accumulatorB;
	public static void main(String[] args) throws IOException {
		String a = readLine();
		String b = readLine();
		String ap = a.toLowerCase();
		String bp = b.toLowerCase();
		
		for (int i = 0; i < a.length(); i ++) {
			accumulatorA += mypow((int) ap.charAt(i) - 96, i + 1, 10)% 10;
		}
		for (int i = 0; i < b.length(); i ++) {
			accumulatorB += mypow((int) bp.charAt(i) - 96, i + 1, 10)% 10;
		}
		
		if (accumulatorA % 10 == 0 && accumulatorB % 10 == 0) System.out.println(20);
		else if (accumulatorA % 10 == 0) System.out.println(10 + accumulatorB % 10);
		else if (accumulatorB % 10 == 0) System.out.println(10 + accumulatorA % 10);
		else System.out.println(accumulatorA % 10 + accumulatorB % 10);
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
			static int mypow(int base, int exp, int mod){
				if(exp==1) return base;
				int t = mypow(base, exp/2, mod);
				if(exp % 2 != 0 ) return t*t*base%mod;
				else return t*t%mod;
			}
}
