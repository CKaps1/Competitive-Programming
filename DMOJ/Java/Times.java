import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Times {
static long accumulator = 0;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;	
public static void main(String[] args) throws IOException {
		long d = readLong();
		int[] s = new int[31];
		s[0] = 34;
		s[1] = 71;
		s[2] = 83;
		s[3] = 95;
		s[4] = 107;
		s[5] = 119;
		s[6] = 130;
		s[7] = 142;
		s[8] = 154;
		s[9] = 166;
		s[10] = 178;
		s[11] = 201;
 		s[12] = 213;
		s[13] = 225;
		s[14] = 237;
		s[15] = 260;
		s[16] = 272;
		s[17] = 284;
		s[18] = 296;
		s[19] = 331;
		s[20] = 343;
		s[21] = 355;
		s[22] = 390;
		s[23] = 402;
		s[24] = 414;
		s[25] = 461;
		s[26] = 473;
		s[27] = 520;
		s[28] = 532;
		s[29] = 591;
		s[30] = 671;

		if (d >= 720) {
			while (d >= 720) {
				accumulator += 31;
				d -= 720;
				if (d < 720) break;
			}
			for (int i = 0; i < s.length; i++) {
				if (d == s[i]) {System.out.println(accumulator + (i + 1)); break;}
				if (d < s[i]) {System.out.println(accumulator + (i)); break;}
			}
		}
		else {
			for (int i = 0; i < s.length; i++) {
				if (d == s[i]) {System.out.println(i + 1); break;}
				if (d < s[i]) {System.out.println(i); break;}
				
			}
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
