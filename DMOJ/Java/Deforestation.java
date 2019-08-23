import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Deforestation {
static StringTokenizer st;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		int n = readInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i ++) {
			arr[i] = readInt();
		}
		int[] p = new int[n + 1];
		p[0] = arr[0];
		for (int i = 0; i < n; i ++) {
			p[i + 1] = p[i] + arr[i];
		}
		int q = readInt();
		for (int i = 0; i < q; i ++) {
			int g = readInt();
			int h = readInt();
			System.out.println(p[h] - p[g] + arr[h]);
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