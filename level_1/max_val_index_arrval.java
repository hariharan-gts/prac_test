package level_1;

import java.util.*;

public class max_val_index_arrval {
    public static void swap(int a[],int i,int j) {
    	while(i<j) {
    		int temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		i++;
    		j--;
    	}
    }
    public static void lf(int a[],int n,int d) {
    	swap(a,0,n-1);
    	swap(a,0,d-1);
    	swap(a,d,n-1);
    }
    public static int max(int a[],int n) {
    	int max=Integer.MIN_VALUE;
    	int ans=0;
    	for(int i=0;i<n;i++) {
    		lf(a,n,i);
    		for(int j=0;j<n;j++) {
    			ans+=(j*a[j]);
    		}
    		max=Math.max(max,ans);
    		ans=0;
    	}
    	return max;
    }
	public static void main(String[] args) {
	int a[]= {0,3,5,7,9};
	System.out.println(max(a,a.length));

	}

}
