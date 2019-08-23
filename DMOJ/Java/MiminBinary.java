import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class MiminBinary {
static int counto = 0, countz = 0;
static StringTokenizer st;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		String s = readLine();
		int[] one = new int[s.length()];
		int[] zero = new int[s.length()];
		int[] iz = new int[s.length()];
		int[] io = new int[s.length()];
		for (int i = 0; i < s.length(); i ++) {
			if (Character.getNumericValue(s.charAt(i)) == 0) {zero[i] = 0; iz[countz] = i + 1;countz ++;}
			else {one[i] = 1; io[counto] = i + 1;counto++;}
		}
		int q = readInt();
		for (int i = 0; i < q; i ++) {
			int x = readInt();
			int y = readInt();
			int z = readInt();
			// make sure index isnt greater than string length
			if (z == 0) { if (Character.getNumericValue(s.charAt(iz[0] + y - 1)) == 0) {System.out.println(iz[0] + y);} else System.out.println(-1);}
			if (z == 1) {if (Character.getNumericValue(s.charAt(io[0] + y - 1)) == 1) {System.out.println(io[0] + y);} else System.out.println(-1);}
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
	return br.readLine();
	}
}