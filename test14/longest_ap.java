package test14;

import java.util.Arrays;

public class longest_ap {
	public static int ap(int a[]) {
		int ans=2;
		int n=a.length;
		if(n<=2)
			return n;
		int lap[]=new int[n];
		Arrays.sort(a);
		Arrays.fill(lap, 2);
		for(int j=n-2;j>=0;j--) {
			int i=j-1;
			int k=j+1;
			while(i>=0&&k<n) {
				if(a[i]+a[k]==2*a[j]) {
					lap[j]=Math.max(lap[j], 1+lap[k]);
					ans=Math.max(ans, lap[j]);
					i-=1;
					k+=1;
				}
				else if(a[i]+a[k]<2*a[j])
					k+=1;
				else
					i-=1;
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
	    int []a = { 1, 7, 10, 13, 14, 19 };
	   System.out.println(ap(a));
	}
}
