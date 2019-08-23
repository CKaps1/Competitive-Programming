import java.util.*;
import java.io.*;
public class SumofPrimes {
 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 static StringTokenizer st;
 public static void main(String[] args) throws IOException {
  int mv = (int)1e7; boolean f[] = new boolean[mv+1];
  f[0] = f[1] = f[2] = true;
  for(int i=2; i<=mv; i++) {
   if(!f[i]) {
    for(int j = 2*i; j<=mv; j+=i) f[j] = true;
   }
  }
  for(int k=1; k<=5; k++) {
   int x = readInt();
   if(!f[x]) System.out.println(x + " = " + x);
   else if(x % 2 == 0) {
    for(int a = x/2; a>=3; a--) {
     if(!f[a] && !f[x-a]) {
      System.out.println(x + " = " + a + " + " + (x-a)); break;
     }
    }
   }else {
    int a = x/3; boolean flag = false;
    for( ; a >= 3 && !flag; a--) {
     if(f[a]) continue;
     int y = x - a;
     for(int b = y/2; b>=a && !flag; b--) {
      if(!f[b] && !f[y-b]) {
       System.out.println(x + " = " + a + " + " + b + " + " + (y-b)); 
       flag = true;
      }
     }
    }
   }
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