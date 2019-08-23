import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problemA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < lines; i ++) {
			String info = br.readLine();
			StringTokenizer st = new StringTokenizer(info);
			String one = st.nextToken();
			String two = st.nextToken();
			String three = st.nextToken();
			
			
			if (one.equals(two) && two.equals(three)) {System.out.println(three);}
			if (one.equals(two) && !two.equals(three) && !three.equals(one)) {System.out.println(one);}
			if (two.equals(three) && !one.equals(three) && !two.equals(one)) {System.out.println(two);}
			if (one.equals(three) && !two.equals(three) && !one.equals(two)) {System.out.println(three);}
			if(!one.equals(two) && !two.equals(three) && !one.equals(three)) {System.out.println("???");}
		
			
		}
		
		

	

	}
}
	

