import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Voronoi {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] villages = new int[n];
		double[] distance = new double[n-1];
		double[] ans = new double[n - 2];
		
		for (int i = 0; i < n; i ++) {
			villages[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(villages);
		for (int i = 0; i < n - 1; i ++) {
			distance[i] = (double) (villages[i + 1] - villages[i])/2;
		}
		for (int i = 0; i < n - 2; i ++) {
			ans[i] = distance[i] + distance[i + 1];
		}
		Arrays.sort(ans);
		System.out.printf("%.1f", ans[0]);
		

	}
}
