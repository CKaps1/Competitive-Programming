import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Flipper {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String num = br.readLine();
		
		int tracker = 0;
		int countV = 0;
		int countH = 0;
		
		while (tracker < num.length()) {
			if (num.charAt(tracker) == 'H') {countH += 1;}
			if (num.charAt(tracker) == 'V') {countV += 1;}
			
			tracker += 1;
		}
		
		if (countV % 2 == 0 && countH % 2 == 0)
		{System.out.println("1 2"); System.out.println("3 4");}
		
		if (countV % 2 != 0 && countH % 2 != 0)
		{System.out.println("4 3"); System.out.println("2 1");}
		
		if (countV % 2 == 0 && countH % 2 != 0)
		{System.out.println("3 4");System.out.println("1 2");}
		
		if (countV % 2 != 0 && countH % 2 == 0)
		{System.out.println("2 1");System.out.println("4 3");}
		

	}

}
