import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Collections;

public class Perket {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static HashSet<Long> h = new HashSet<>();
static long accumulatorS;
static long accumulatorB;
	public static void main(String[] args)throws IOException {
		int n = readInt();
		long[] s = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i ++) {
			s[i] = Integer.parseInt(next());
			b[i] = Integer.parseInt(next());
		}
		for (int i = 0; i < n; i ++) {
			accumulatorS = s[i];
			accumulatorB = b[i];
			for (int j = 0; j < n; j ++) {
				 h.add(Math.abs(accumulatorS - accumulatorB));
				 if (i != j) {
				accumulatorS *= s[j]; accumulatorB += b[j];
				h.add(Math.abs(accumulatorS-accumulatorB));}
			}
		}
		System.out.println(Collections.min(h));
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
