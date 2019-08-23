import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Nightmareathon {
static StringTokenizer st;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static class E{
	//Attributes
	int max,cnt;
	E(int m, int c){max = m;cnt = c;}
}
static E getmax(E x, E y) {
	//Behviour
	if (x.max > y.max) return x;
	else if (x.max < y.max) return y;
	else return new E(x.max,x.cnt + y.cnt);
}

	public static void main(String[] args)throws IOException {
		int n = readInt();
		int q = readInt();
		int[] a = new int[n+1];
		for (int i = 1; i <= n; i ++) {
			a[i] = readInt();
		}
		E pre[] = new E[n + 2], suf[] = new E[n + 2];
		for (int i = 1; i <=n; i ++) {
			pre[i] = getmax(pre[i+1], new E(a[i], 1));
		}
		for (int i = n; i >=1; i --) {
			suf[i] = getmax(suf[i + 1], new E(a[i], 1));
		}
		for (int i = 1; i <= q; i ++) { 
			int x = readInt();
			int y = readInt();
			E t = getmax(pre[x-1], suf[y + 1]);
			System.out.println(t.max + " " + t.cnt);
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