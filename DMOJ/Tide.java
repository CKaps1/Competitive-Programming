import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Tide {

	public static void main(String[] args) throws IOException{
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> tide = new ArrayList<>();
		ArrayList<Integer> high = new ArrayList<>();
		ArrayList<Integer> low = new ArrayList<>();
		
		String recordings = br.readLine();
		StringTokenizer st = new StringTokenizer(recordings);
		for (int i = 0; i < n; i ++) {
			tide.add(Integer.parseInt(st.nextToken()));
		}
		if (n % 2 == 0)
		{
			Collections.sort(tide);
			for (int i = 0; i < n/2; i ++) {
				low.add(tide.get(i));
			}
			for (int i = n/2; i < n; i ++) {
				high.add(tide.get(i));
			}
			Collections.sort(high);
			Collections.sort(low);
			Collections.reverse(low);
			
			for (int i = 0; i < n/2; i ++) {
				System.out.print(low.get(i) + " ");
				System.out.print(high.get(i) + " ");
			}
		}
		
		if (n % 2 != 0)
		{	
			Collections.sort(tide);
			
			for (int i = 0; i < (tide.size()/2) + 1; i ++) {
				low.add(tide.get(i));
			}
			for (int i = (tide.size()/2) + 1; i < tide.size(); i ++) {
				high.add(tide.get(i));
			}
				
			Collections.sort(high);
			Collections.sort(low);
			Collections.reverse(low);
			//output issue
			System.out.print(low.get(0) + " ");
			low.remove(0);
			
			for (int i = 0; i < n/2; i ++) {
				System.out.print(high.get(i) + " ");	
				System.out.print(low.get(i) + " ");
				
			}
			
			}
		}
		catch (NumberFormatException e) {}
	}

}