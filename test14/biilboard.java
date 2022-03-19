package test14;

import java.util.Arrays;

public class biilboard {
	 
	
	static int max(int m,int x[],int r[],int n,int t) {
		int rev[]=new int[m+1];
		Arrays.fill(rev, 0);
		
		int nxt=0;
		for(int i=1;i<=m;i++) {
			if(nxt<n) {
				if(x[nxt]!=i)
					rev[i]=rev[i-1];
				else {
					if(i<=t)
						rev[i]=Math.max(rev[i-1],r[nxt]);
					else
						rev[i]=Math.max(rev[i-1], r[nxt]+rev[i-t-i]);
					
					
				}
				nxt++;
			}
			else
				rev[i]=rev[i-1];
		}
		
		return rev[m];
	}
	// Driver Code
	public static void main(String []args)
	{
		
		
	    int m = 20;
	    int[] x = new int[]{6, 7, 12, 13, 14};
	    int[] revenue = new int[]{5, 6, 5, 3, 1};
	    int n = x.length;
	    int t = 5;
	    System.out.println(max(m, x, revenue, n, t));
	}
}
