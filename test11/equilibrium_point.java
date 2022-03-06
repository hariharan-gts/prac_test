package test11;
//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/

public class equilibrium_point {
   public static void equilirium(int a[],int n) {
	  int lsum=0,rsum=0;
    for(int i=0;i<n;i++){
        lsum+=a[i];
    }
    for(int i=0;i<n;i++){
        lsum-=a[i];
        if(lsum==rsum)
        {
            System.out.println(i);
            return;
        }
        rsum+=a[i];

    }
    System.out.println(-1);
		   
   }
	public static void main(String[] args) {
		int a[]= {1,1,1,-1,1,1,1};
		equilirium(a,a.length);

	}

}
