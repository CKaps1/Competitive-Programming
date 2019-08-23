import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class mail {
	
static int beg;
static String mail;
static int position;
static String splice;
static String splice1;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		HashSet<String> emails = new HashSet();
		int count = 1;
		int tracker = 0;
		
		try {
			for (int i = 0; i < 10; i ++) {
				int num = Integer.parseInt(br.readLine());
			
				for (int y = 0; y < num; y ++) {
					mail = br.readLine();
					//decrypt String
					position = mail.indexOf('@');
					
					//without "+" sign
					if (mail.indexOf('+') == -1) {splice1 = mail.substring(0,position);
					while (splice1.indexOf('.') != - 1) {
						String use1 = Character.toString(splice1.charAt(splice1.indexOf('.')));
						splice1 = splice1.replace(use1,"");
					}
					mail = splice1 + mail.substring(position,mail.length());
					}
					
					//with "+" sign
					if (mail.indexOf('+') != - 1) {
						beg = mail.indexOf('+');
						splice = mail.substring(0,beg);

					while (splice.indexOf('.') != -1){
						String use = Character.toString(splice.charAt(splice.indexOf('.')));
						splice = splice.replace(use, "");
						}
					mail = splice + mail.substring(position, mail.length());
					}
				mail = mail.toLowerCase();
				emails.add(mail);
				
			}
				System.out.println(emails.size());
				emails.clear();
				
			}
		}
		catch (IOException e) {}
 	}
}