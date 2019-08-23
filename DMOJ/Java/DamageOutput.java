import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class DamageOutput {
static StringTokenizer st;
static ArrayList<Integer> s = new ArrayList<>();
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		int n = readInt();
		int ans = n + 1;
		long m = readLong();
		long[] psa = new long[n+1];
		for (int i = 0; i < n; i ++) {
			psa[i] = readInt();
		}
		for (int i = 1; i < n; i++) {
			psa[i] += psa[i - 1];
		}
		int l = 1;
		int r = 1;
		while (r < n && l < n) {
			 if (psa[r] - psa[l] >= m) {ans = Math.min(ans,r-l);l++;}
			else r ++;
		}
		if (ans >n) System.out.println(-1);
		else System.out.println(ans);
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