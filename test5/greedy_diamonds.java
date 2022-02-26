
LINK:https://www.geeksforgeeks.org/maximum-number-of-diamonds-that-can-be-gained-in-k-minutes/
package test5;

public class greedy_diamonds {
    public static int greed(int a[],int k) {
    	int sum=0;
    	for(int i=0;i<k;i++) {
    		int max_val=max(a,a.length);
    		sum+=max_val;
    	}
    	return sum;
    }
    public static int max(int a[],int n) {
    	int max=Integer.MIN_VALUE;
    	int maxi=-1;
    	for(int i=0;i<n;i++) {
    		if(a[i]>max) {
    			max=a[i];
    			maxi=i;
    		}
    	}
    	a[maxi]=max/2;
    	return max;
    }
	public static void main(String[] args) {
		int a[]= {1,2,1,7,3,4};
		int k=3;
		System.out.println(greed(a,k));

	}

}
