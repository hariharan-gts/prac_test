package test11;
//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/

public class equilibrium_point {
   public static void equilirium(int a[],int n) {
	   int mid=n/2;
	   int lsum=0;
	   int rsum=0;
	   for(int i=0;i<mid;i++)
		   lsum+=a[i];
	   for(int i=n-1;i>mid;i--)
		   rsum+=a[i];
	   if(rsum>lsum) {
		   while(rsum>lsum) {
			   rsum-=a[mid+1];
			   lsum+=a[mid];
			   mid++;
		   }
	   }
	   else {
		   while(lsum>rsum) {
			   rsum+=a[mid];
			   lsum+=a[mid-1];
			   mid--;
		   }
	   }
	   if(lsum==rsum)
		   System.out.println(mid);
	   else
		   System.out.println(-1);
		   
   }
	public static void main(String[] args) {
		int a[]= {1,1,1,-1,1,1,1};
		equilirium(a,a.length);

	}

}
