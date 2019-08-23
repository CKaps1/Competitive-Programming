import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Testers {
//initialization
	//binarysearch
	//sieve is for finding num of factors
// make example
	//
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// i*i=n i = 2; if n%i ==0 return false
// return true
		// PRIME TEST
		// SIEVE
		// prime factorization
		//make boolean is prime
		//for loop i = 1, i <=n; i ++
		//for j = i; j<=n; j += i
		//fact[j] ++ (sieve code)
		// gives you n of factors
		//a:
		//cal factors (seive) 
		//make list of each n of factors and use lo and hi and use binarysearch to check 
		//once you create all of the arrays ans the q's
		//prime factorization checl up to sqr(n) and check if it is a factor if it is , divide by the factor and keep checking until you go to 1 the lgoic is onve you divide by 2, you get rid of the multples of 2 just like the example keep track of numbers you have used.
		int m = 100001, fact[] = new int[m];
		
		List<Integer> list [] = new ArrayList[m];
		for (int i =1;i < m; i ++) {
			list[i] = new ArrayList<Integer>();}

for (int i = 1; i < m; i ++) {
	for (int j = i; j < m; j += i) {
		fact[j] ++;
		}
	list[fact[i]].add(i);
}



int t = Integer.parseInt(br.readLine());

for (int i = 1; i <= t; i ++) {
	String use = br.readLine();
	StringTokenizer st = new StringTokenizer(use);
	int k = Integer.parseInt(st.nextToken());
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	int pa = Collections.binarySearch(list[k], a), pb = Collections.binarySearch(list[k], b);
	
	if (pa < 0) pa= -pa - 1;
	if (pb < 0) pb = -pb - 2;
	System.out.println(pb - pa + 1);
}
	}
}
