import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class Veci {
static char t;
static int count;
static String use, keep;
static ArrayList<Integer> d = new ArrayList<>();
static ArrayList<Integer> p = new ArrayList<>();
static ArrayList<Integer> f = new ArrayList<>();
static ArrayList<Integer> low = new ArrayList<>();
static StringTokenizer st;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)throws IOException {
		int a = readInt();
		String b = Integer.toString(a);
		for (int i = 0; i < b.length(); i ++) {
			p.add(Character.getNumericValue(b.charAt(i)));
			f.add(Character.getNumericValue(b.charAt(i)));
		}
		Collections.sort(p);
		Collections.reverse(p);
		if (f.equals(p)) System.out.println(0);
		
		else {
		 for (int i = b.length() - 1 ; i - 1 >= 0; i --) {
			if (Character.getNumericValue(b.charAt(i)) <= Character.getNumericValue(b.charAt(i - 1))) continue;
			else {
				count = i - 1;
				break;
			}
		}
		t = b.charAt(count);
		use = b.substring(count + 1);
		keep = b.substring(0,count);
		for (int j = 0; j < use.length(); j ++) { if (Character.getNumericValue(use.charAt(j)) > Character.getNumericValue(t)) d.add(Character.getNumericValue(use.charAt(j)));
		else low.add(Character.getNumericValue(use.charAt(j)));
		}
		int r = Collections.min(d); 
		System.out.print(keep + String.valueOf(r));
		for (int i = 0; i < d.size(); i ++) {
			if (d.get(i) == r) {d.remove(i);break;}
		}
		d.add(Character.getNumericValue(t));
		for (int g : low) d.add(g);
		Collections.sort(d);
		for (int k : d) System.out.print(k);
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