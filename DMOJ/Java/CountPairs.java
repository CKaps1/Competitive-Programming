import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CountPairs {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String use = br.readLine();
		StringTokenizer st = new StringTokenizer(use);
		int num = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		int[] store = new int[num];
		long count = 0;
		int low = 0;
		int high = num - 1;
		String use2 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(use2);
		for (int i1 = 0; i1 < num; i1 ++) {
			store[i1] = Integer.parseInt(st1.nextToken());
			}
		Arrays.sort(store);
		while (low < high) {
			if (store[low] + store[high] <= max) {count += (high - low);low ++;}
			if (store[low] + store[high] > max) high --;
		}
		
		System.out.print(count);
	
		
	
	}

}
