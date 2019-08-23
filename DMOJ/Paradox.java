import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
public class Paradox {
static HashSet<Boolean> set = new HashSet<>();
static LinkedHashSet<Boolean> ls = new LinkedHashSet<>();
static StringTokenizer st;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		int c = readInt();
		for (int i = 0; i < c; i++) {
		String s = readLine();
		if (s.length() > 1) {int k = Character.getNumericValue(s.charAt(0));boolean use = Boolean.valueOf(s.substring(2));
		if (k == 1) {System.out.println(set.add(use));ls.add(use);}
		else if (k == 2) {System.out.println(set.remove(use));ls.remove(use);}
		else if (k == 3) {if (ls.contains(use)) {int j = 0;for (boolean t : ls) { if (t == use) {System.out.println(j);break;}j++; }  } else System.out.println(-1); }
		}
		else {for (boolean j : set) {System.out.print(j + " ");} System.out.println();}
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
static boolean readBoolean () throws IOException {
	return Boolean.parseBoolean(readLine());
}
}