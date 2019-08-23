import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rankings {
static StringTokenizer st1;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String use = br.readLine();
		StringTokenizer st = new StringTokenizer(use);
		int c = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		String[] names = new String[c];
		int[] accumulator = new int[c];
		int count = 3;
		
		for (int i = 0; i < c; i ++) {
			accumulator[i] = 0;
		}
		// store names
		for (int i = 0; i < c; i ++) {
			names[i] = br.readLine();
		}
		//store powerpoint hw times
		String counts = "3.";
		int[][] hw = new int[r][c];
		
		for (int i = 0; i < r; i ++) {
			for (int j = 0; j < c; j ++) {
				int a = Integer.parseInt(st1.nextToken());
				hw[r][c] = a;
				accumulator[j] = a;
				
			}
		}
		//output && testing
		for (int i = 0; i < c; i ++) {
			System.out.println(accumulator[i]);
		}
		
		
		
		
		
	}
}
