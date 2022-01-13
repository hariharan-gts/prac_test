package test2;

/*
 * Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2. 
Let the input array be arr[] and size of the array be size.
 */
public class Array_leaders {
    public static void leader(int a[],int n) {
    	for(int i=0;i<n;i++) {
    		int j;
    		for(j=i+1;j<n;j++) {
    			if(a[i]<a[j]) {
    				break;
    			}
    		}
    		if(j==n) {
    			System.out.print(a[i]+" ");
    		}
    	}
    }
    
    //optimised solution
    public static void leader1(int a[],int n) {
    	int max_r=a[n-1];
    	System.out.print(max_r+" ");
    	for(int i=n-2;i>=0;i--) {
    		if(max_r<a[i]) {
    			System.out.print(a[i]+" ");
    			max_r=a[i];
    		}
    	}
    }
	public static void main(String[] args) {
		int a[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = a.length;
        leader1(a,n);

	}

}
