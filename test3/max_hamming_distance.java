LINK:https://www.geeksforgeeks.org/find-a-rotation-with-maximum-hamming-distance-set-2/

package test3;

public class max_hamming_distance {
	
    public static int max_ham(int a[],int n) {
    	int max_ham=0;
    	int b[]=new int[2*n+1];
    	for(int i=0;i<a.length;i++) {
    		b[i]=a[i];
    	}
    	for(int i=0;i<a.length;i++) {
    		b[n+i]=a[i];
    	}
    	
    	for(int i=1;i<n;i++) {
    		int c_ham=0;
    		for(int j=i,k=0;j<(n+i);j++,k++) {
    			if(a[k]!=b[j])
    				c_ham++;
    		    
    			if(c_ham==n)
    				return n;
    		  max_ham=Math.max(c_ham, max_ham);
    		
    		}
    	}
    	return max_ham;
    }
	public static void main(String[] args) {
		int a[]= {2,4,6,8};
		System.out.println(max_ham(a,a.length));

	}

}
