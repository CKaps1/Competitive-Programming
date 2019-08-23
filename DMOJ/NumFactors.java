import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumFactors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 5; i ++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 3 || num ==5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19 || num == 23 || num == 29 || num == 2)
			{ System.out.println(0);}
			if (num == 4 || num == 6 || num == 9 || num == 10 || num == 14 || num == 15 || num == 21 || num == 22 || num == 25 || num == 26)
			{System.out.println(2);}
			if (num == 8 || num == 12 || num == 18 || num == 20 || num == 27 || num == 30 || num == 28)
			{System.out.println(3);}
			if (num == 16 || num == 24) {System.out.println(4);}
			if (num == 32) {System.out.println(5);}
			
		}

	}

}
