import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Marathon {
static StringTokenizer st;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		int n = readInt(), cnt = 1;
		char b[][] = new char[n][n];
		if (n <3) System.out.println("ongoing");
		else {
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = readCharacter();
			}
		}
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j++) {
				char c = b[i][j];
				int down = i;
				int side = j;
				//right
				while (i < n && i > 0 && j < n && j > 0) {
//					if (side == n -1 && cnt < 3) {side = j;cnt = 0;break;}
					if (b[i][side + 1] == c) {cnt ++; side ++;continue;}
					if (b[i][side + 1] != c) {cnt = 1; side = j; break;}
					if (cnt == 3) {System.out.println(b[i][side]);side = j;break;}
					}
				//left
				while (i < n && i > 0 && j < n && j > 0) {
//					if (side == 0 && cnt < 3) {side = j;cnt = 0;break;}
					if (b[i][side - 1] == c) {cnt ++; side --;continue;}
					if (b[i][side - 1] != c) {cnt = 1; side = j; break;}
					if (cnt == 3) {System.out.println(b[i][side]); side = j; break;}
					
					}
				//down
				while (i < n && i > 0 && j < n && j > 0) {
//					if (down == n - 1 && cnt < 3) {down = i;cnt = 0;break;}
					if (b[down + 1][j] == c) {cnt ++;  down++;continue;}
					if (b[down + 1][j] != c) {cnt = 1; down = i; break;}
					if (cnt == 3) {System.out.println(b[down][j]); down = i; break;}
					}
				//up
				while (i < n && i > 0 && j < n && j > 0) {
//					if (down == 0 && cnt < 3) {down = i;cnt = 0;break;}
					if (b[down - 1][j] == c) {cnt ++;  down--;continue;}
					if (b[down - 1][j] != c) {cnt = 1; down = i; break;}
					if (cnt == 3) {System.out.println(b[down][j]); down = i; break;}
					}
				}
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