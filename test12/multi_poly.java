package test12;

import java.util.Arrays;

public class multi_poly {
   
	 public static int[]multiply(int A[],int B[],int m,int n){
		   int ans[]=new int[m+n-1];
		   for(int i=0;i<m;i++) {
			   for(int j=0;j<n;j++) {
				   ans[i+j]+=A[i]*B[j];
			   }
		   }
		   return ans;
	   }
	 public static void print(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
			if(i!=0) {
				System.out.print("x^"+i);
			}
			if(i!=n-1) {
				System.out.print("+");
			}
		}
	 }
		public static void main(String[] args) {
			int A[] = {5, 0, 10, 6};
	      
	        int B[] = {1, 2, 4};
	        int m = A.length;
	        int n = B.length;
	       print( multiply(A, B, m, n));
	      
		}

}
