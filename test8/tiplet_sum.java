package test8;

import java.util.Arrays;

public class tiplet_sum {
	//o(n^3) approach
    public static int sum(int a[],int n) {
    	for(int i=0;i<n-2;i++) {
    		for(int j=i+1;j<n-1;j++) {
    			for(int k=j+1;k<n;k++) {
    				if(a[i]+a[j]+a[k]==0) {
    					return 1;
    				}
    			}
    		}
    	}
    	return 0;
    }
    
    //o(n^2) approach
    public static int sum1(int a[],int n) {
    	Arrays.sort(a);
    	for(int i=0;i<n-1;i++) {
    		int l=i+1;
    		int r=n-1;
    		int x=a[i];
    		while(l<r) {
    			if(x+a[l]+a[r]==0)
    			return 1;
    		else if(x+a[l]+a[r]<0) 
    			l++;
    		else
    			r--;
    		}
    	}
    	
    	return  0;
    }
	public static void main(String[] args) {
		int a[]= {0,-1,2,-3,1};
		System.out.println(sum1(a,a.length));

	}

}
