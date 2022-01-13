package test1;

public class pattern {
   public static void main(String args[]) {
	   int n=5;
	   for(int i=0;i<n;i++) {
		   int spc=n-i-1;
		   for(int j=0;j<spc;j++) {
			   System.out.print(" ");
		   }
		   for(int j=0;j<=i;j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
}
