import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.lang.Math;

public class problemB {
	public static void main(String[] args) throws IOException, NumberFormatException {
		
		try {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int count = 0;
		int houses = Integer.parseInt(st.nextToken());
		int numloop = Integer.parseInt(st.nextToken());
		double[] use = new double[houses];
		
		for (int i = 0; i < houses; i ++) {
			String location = br.readLine();
			StringTokenizer st1 = new StringTokenizer(location);
			
			double distance = Math.sqrt(Math.pow(Integer.parseInt(st1.nextToken()),2) + Math.pow(Integer.parseInt(st1.nextToken()),2));
			use[i] = distance;
		}
		int pos = -1;
		int beg = 0;
		int end = use.length - 1;
		int mid = (beg + end)/2;
		
		Arrays.sort(use);
		for (int i = 0; i < numloop; i ++) {
			int range = Integer.parseInt(br.readLine());
			System.out.println(binarySearch(use, range, pos, beg, end, mid));
			pos = -1;
			beg = 0;
			end = use.length - 1;
			mid = (beg + end)/2;
		}
		}
		catch (NumberFormatException e) {}
	}
	
	public static int binarySearch(double[] use, int range, int pos, int beg, int end, int mid) {
		if (end >= beg){
			mid = (beg + end)/2;
//equal to or all or none
		if (use[mid] == range ) {pos = mid + 1; return (pos);}
		if (range > use[use.length - 1]) {return (use.length);}
		if (range < use[0]) {return 0;}
//mid > val
		if (use[mid] > range && use[mid - 1] < range) {pos = mid; return (pos);}
		if (use[mid] > range && use[mid - 1] > range) {return binarySearch(use, range, pos, beg, end = mid - 1, mid);}
//mid < val
		if (use[mid] < range && use[mid + 1] > range) {pos = mid + 1; return (pos);}
		if (use[mid] < range && use[mid + 1] < range) {return binarySearch(use, range, pos, beg = mid + 1, end, mid);}
		}
		return 0;
		}
	
	}