import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ToweringTowers {
static int tracker;
static int count2;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] houses = new int[num];
		int count = 0;
		
		String values = br.readLine();
		StringTokenizer st = new StringTokenizer(values);
		
		while (count < num) {
			houses[count] = Integer.parseInt(st.nextToken());
			count ++;
		}
		int[] V = new int[num];
		V[0] = 0;
		for (int i = 1; i < num; i ++) {
		int k = i - 1;
		while(k >= 0) {
			if (houses[k] > houses[i] || k==0) {V[i] = i - k; break;}
			
			k -= V[k];
		}
		
		}
		
	for (int i = 0; i < V.length; i ++) {
		System.out.print(V[i] + " ");
	}
		
	}
}