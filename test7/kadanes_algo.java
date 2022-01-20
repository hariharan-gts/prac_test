package test7;

public class kadanes_algo {
   public static int kadane(int a[]) {
	   int max_so_far=a[0];
	   int max_end=0;
	   for(int i=0;i<a.length;i++) {
		   max_end+=a[i];
		   if(max_so_far<max_end)
			   max_so_far=max_end;
		   if(max_end<0)
			   max_end=0;
	   }
	   return max_so_far;
   }
	public static void main(String[] args) {
		int a[]= {1,2,3,-2,5};
		System.out.println(kadane(a));
	}

}
