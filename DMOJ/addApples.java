import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class addApples {
static StringTokenizer st;
static int count = 0, n;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		 n = readInt();
		for (int i = 1; i <=n/2; i ++) {
			fun(i, i, n + "=" + i);
		}
		System.out.println("total=" + count);
	}
	static void fun(int pre, int sum, String ans) {
		if (sum == n) {
			count ++;
			System.out.println(ans);
			 return;
		}
			 for (int i = pre; i <=n - sum; i ++) {
				 fun(i,sum +i, ans+"+"+i);
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