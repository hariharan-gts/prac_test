//GFG LINK : https://www.geeksforgeeks.org/hamming-distance-between-two-integers/

package test3;

public class hamming_distance {
  public static int hamming_distance(int n1,int n2) {
	  int x=n1^n2;
	  int set_bit=0;
	  while(x>0) {
		  set_bit+=x&1;
		  x>>=1;
	  }
	  return set_bit;
  }
	public static void main(String[] args) {
		System.out.println(hamming_distance(7,5));

	}

}
