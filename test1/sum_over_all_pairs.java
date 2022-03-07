package test1;
/*
 * If |a[j]-a[i]| > 1
   f(a[i], a[j]) = a[j] - a[i] 
Else // if |a[j]-a[i]| <= 1
   f(a[i], a[j]) = 0
 */
public class sum_over_all_pairs {
  public static void main(String args[]) {
	  int a[]= {1,2,3,1,3};
	  int sum=0;
	  for(int i=0;i<a.length;i++) {
		  for(int j=i+1;j<a.length;j++) {
			  if(Math.abs(a[j]-a[i])>1) {
				  sum+=(a[j]-a[i]);
			  }
			  else if(Math.abs(a[j]-a[i])<=1) {
				  sum+=0;
			  }
		  }
	  }
	  System.out.println(sum);
  }
}
