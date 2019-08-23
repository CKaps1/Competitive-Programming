import java.util.*;
import java.io.*;
public class Homework {
 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 static StringTokenizer st;
 public static void main(String[] args) throws IOException {
  int mv = (int)1e7, f[] = new int[mv+1];
  for(int i=2; i<=mv; i++) {
   if(f[i] == 0) {
    for(int j = i; j<=mv; j+=i) f[j]++;
   }
  }
  int T = readInt();
  for(int t=1; t<=T; t++) {
   System.out.print("Case #"+t+": ");
   int a = readInt(), b = readInt(), k = readInt(), count = 0;
   if(k > 8) { System.out.println(0); continue; } 
   for(int i=a; i<=b; i++)
    if(f[i] == k) count++;
   System.out.println(count);
  }
 }
 static String next () throws IOException {
  while (st == null || !st.hasMoreTokens())
   st = new StringTokenizer(br.readLine().trim());
  return st.nextToken();
 }
 static long readLong () throws IOException {
  return Long.parseLong(next());
 }
 static int readInt () throws IOException {
  return Integer.parseInt(next());
 }
 static double readDouble () throws IOException {
  return Double.parseDouble(next());
 }
 static char readCharacter () throws IOException {
  return next().charAt(0);
 }
 static String readLine () throws IOException {
  return br.readLine().trim();
 }
}