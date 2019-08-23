import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class SumGame {
static int accumulator;
static int count;
	public static void main(String[] args)throws IOException{
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> indices = new ArrayList<>();
		int[] swifts = new int[n];
		int[] semaphores = new int[n];
		
		String use = br.readLine();
		StringTokenizer st = new StringTokenizer(use);
		for (int i = 0; i < n; i ++) {
			swifts[i] = Integer.parseInt(st.nextToken());
		}
	
		String use1 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(use1);
			for (int i = 0; i < n; i ++) {
			semaphores[i] = Integer.parseInt(st1.nextToken());
		}
					
		for (int i = 0; i < n; i ++) {
			accumulator += swifts[i];
			count += semaphores[i];
			if (count == accumulator) {indices.add(i + 1);}
		}
		
		if (indices.size() == 0) {System.out.println(0);}
		if (indices.size() == 1) {System.out.println(indices.get(0));}
		if (indices.size() > 1) {System.out.println(Collections.max(indices));}
		
		
		
		}
		catch (NumberFormatException e) {}
	}

}