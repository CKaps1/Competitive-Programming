import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class dressingUp {

	public static void main(String[] args)throws IOException {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Character> use = new ArrayList<>();
		char s = ' ';
		char a = '*';
		int oddl = 1, countl = 0, h = 0, countr = 0, oddr = 1, hc = 0, max = n*2*((n-1)/2) - (n*2), iq = n*2*((n-1)/2), idk = 0;
		while (h < (n+1)/2) {
		
		//left
		while (countl < oddl) {
			System.out.print(a);
			use.add(a);
			
			countl ++;
		}
		oddl += 2;
		for (int i = 0; i < n-countl; i ++) {
			System.out.print(s);
			use.add(s);
		}
		//right
		for (int i = 0; i < n-countl; i ++) {
			System.out.print(s);
			use.add(s);
		}
		while(countr < oddr) {
			System.out.print(a);
			use.add(a);
			countr ++;
		}
		oddr += 2;
		countl = 0;
		countr = 0;
	System.out.println();
	h += 1;
		}
		while (max <= iq && max >= 0){
		
			if (max == iq) {idk = 0; iq -= n*2; max -= n*2*2;System.out.println();}
			System.out.print(use.get(max));
			max += 1;
		}
		}
		catch (ArrayIndexOutOfBoundsException e) {}
	}

}
