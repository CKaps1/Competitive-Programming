import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FujoNeko {

	public static void main(String[] args) throws IOException{
		try {
			//setup
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String use = br.readLine();
		StringTokenizer st = new StringTokenizer(use);
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		boolean[] trackc = new boolean[c];
		boolean[] trackr = new boolean[r];
		char[][] g = new char[r][c];
			//graph
		for (int i = 0; i < r; i ++) {
			String use1 = br.readLine();
			for (int j = 0; j < c; j ++) {
				if (use1.charAt(j) == 'X') {trackr[i] = true;trackc[j] = true;}
				g[i][j] = use1.charAt(j);
			}
		}
		boolean xf = false;
		boolean yf = false;
		int q = Integer.parseInt(br.readLine());
		//check r,c and output
		for (int i = 0; i < q; i ++) {
			xf = false;
			yf = false;
			String use2 = br.readLine();
			StringTokenizer st1 = new StringTokenizer(use2);
			int x = Integer.parseInt(st1.nextToken());
			int y = Integer.parseInt(st1.nextToken());
			
			if (trackr[y - 1] == true) {System.out.println('Y');continue;}
			if (trackc[x-1] == true) {System.out.println('Y');continue;}
			else System.out.println('N');
		}
		}
		catch (NumberFormatException e) {}
	}
}
