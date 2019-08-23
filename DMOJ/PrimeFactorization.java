import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> s = new ArrayList<>();
		for (int i = 0; i < n; i ++) {
			long m = Integer.parseInt(br.readLine());
			int j = 2;
			while (j <= (int) Math.sqrt(m)) {
				if (m%j == 0) {m = m/j;System.out.print(j + " ");}
				if (m%j != 0) {j ++;}
			}
			if (m != 1) {System.out.print(m);}
			System.out.println();
			
		}
			
		}
	}