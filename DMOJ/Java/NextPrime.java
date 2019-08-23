import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPrime {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		System.out.println(findPrime(n));	
	}
	public static long findPrime(long n) {
		boolean find = false;
		if (n == 1) {return 2;}
		if (n == 2) {return 2;}
		if (n == 3) {return 3;}
		for (int i = 2; i*i <= n; i ++) {
			if (n % i != 0) {find = true;}
			else {find = false; break;}
		}
		if (find == false) {return findPrime(n += 1);}
		else return n;	
	}

}
