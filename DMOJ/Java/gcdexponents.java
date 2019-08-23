import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gcdexponents {

	public static void main(String[] args)throws IOException {
		
		
	}
	
	static int gcd(int a, int b) 
	    { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    } 
	
	
	static int power(int b,int e)
	 {
	 if(e==0)
	         return 1;
	     else 
	         return (b*power(b,e-1)); 
	 }
	
	
	}
	      

	


