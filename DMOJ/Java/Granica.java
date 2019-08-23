import java.util.*;
public class Granica {
 public static void main(String[] args){
  Scanner in = new Scanner (System.in);
  int n = in.nextInt(), a[] = new int[n];
  for(int i=0; i<n; i++) a[i] = in.nextInt();
  Arrays.sort(a);
  int g = a[1]-a[0];
  for(int i=2; i<n; i++) g = gcd(g, a[i] - a[i-1]);
  for(int i=2; i<=Math.sqrt(g); i++){
   if(g % i == 0) {
    System.out.print(i + " ");
    if(i*i != g) System.out.print(g/i + " ");
   }
  }
  System.out.println(g);
 }
 static int gcd(int x, int y){
  return y==0? x: gcd(y, x%y);
 }
}