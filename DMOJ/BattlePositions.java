import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BattlePositions {
static int cnt = 0;
static StringTokenizer st;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		//difference of O(N^2) -> O(N + Q) ***
		int s = readInt();
		int[] d = new int[s];
		for (int i = 0; i < s; i ++) {
			d[i] = 0;
		}
		int m = readInt();
		int j = readInt();
		for (int i = 0; i < j; i ++) {
			int xi = readInt(), xf  = readInt(), n = readInt();
			d[xi] += n;
			d[xf + 1] -= n;
			}
		if (d[0] < m) cnt ++;
		for (int i = 1; i < s; i ++) {
			d[i] += d[i - 1];
			if (d[i] < m) cnt ++;
		}
		System.out.println(cnt);
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
