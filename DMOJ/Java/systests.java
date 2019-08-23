import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class systests{
	//two pointer approach
	static int lo,hi,ri,ti,accumulator;
	static boolean find;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] rangelo = new int[n];
		int[] rangehi = new int[n];
		int[] points = new int[n];
		for (int i = 0; i < n; i ++) {
			String use = br.readLine();
			StringTokenizer st = new StringTokenizer(use);
			rangelo[i] = Integer.parseInt(st.nextToken());
			rangehi[i] = Integer.parseInt(st.nextToken());	
			points[i] = Integer.parseInt(st.nextToken());
			}
		int f = Integer.parseInt(br.readLine());
		int[] testcases = new int[f];
		for (int i = 0; i < f; i ++) {
			testcases[i] = Integer.parseInt(br.readLine());
		}
		ri = 0;
		for (int i = 0; i < n; i ++) {
			lowerbound(lo,rangelo,rangehi,ri,ti,testcases);
			higherbound(hi,rangelo,rangehi,ri,ti,testcases);
			twopointer(hi,lo,rangehi,rangelo,points,testcases,ri,find,accumulator);
			ri += 1;
			ti += 1;
		}	
		System.out.print(accumulator);
	}
	public static int lowerbound(int lo,int[] rangelo, int[] rangehi,int ri,int ti, int[] testcases) {
		ti = 0;
		lo = 0;
		
			while(testcases[ti] < rangelo[ri])
			{
				if (testcases[ti] >= rangelo[ri]) {break;}
				ti += 1;
			}
		
		lo = ti;
		return lo;
	}
	public static int higherbound(int hi,int[] rangelo, int[] rangehi,int ri,int ti, int[] testcases) {
		hi = 0;
		ti = 0;
			while (testcases[ti] < rangehi[ri]) {
				if (testcases[ti] >= rangehi[ri]) {break;}
				ti += 1;
			}
		
		hi = ti;
		return hi;
	}
	public static int twopointer(int hi, int lo,int[] rangelo,int[] rangehi, int[] points, int[] testcases, int ri,boolean find, int accumulator) {
		
		if (hi >= lo) {
			if (testcases[lo] < rangelo[ri]) {return twopointer(hi,lo += 1,rangelo,rangehi,points,testcases,ri,find = false,accumulator);}
			if (testcases[hi] > rangehi[ri]) {return twopointer(hi -= 1,lo,rangelo,rangehi,points,testcases,ri,find = false,accumulator);}
			else find = true; return accumulator;
		}
		if (find == false) {return accumulator += points[ri];}
		
		return accumulator;
	}
}