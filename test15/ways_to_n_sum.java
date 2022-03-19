package test15;

import java.util.Arrays;

public class ways_to_n_sum {

	public static void main(String[] args) {
		int n=5;
		int t[]=new int[n+1];
		Arrays.fill(t, 0);
		t[0]=1;
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n;j++) {
				t[j]+=t[j-i];
			}
		}
		System.out.println(t[n]);

	}

}
