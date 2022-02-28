package test11;
//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1#
public class Minimum_number_of_jumps_to_reach_end {
    static int minJumps(int[] arr)
    {
        int i=0;
        int n = arr.length;
        int hops=0;
        
        if(n==1) return 0;
        
        
        while(i<n-1)
        {
            if(arr[i]==0) return -1;
            
            int maxInd = i+1;
            
            if(i+arr[i]>=n-1) return hops+1;
            
            for(int j=i+1; j<n && j<=i+arr[i]; j++)
            {
                if(arr[maxInd]+maxInd<arr[j]+j) maxInd = j;
            }
            
            i = maxInd;
            
            hops++;
        }
        
        return hops;
        
    }
	public static void main(String[] args) {
		int a[]= {1, 4, 3, 2, 6, 7};
		System.out.println(minJumps(a));
 
	}

}
