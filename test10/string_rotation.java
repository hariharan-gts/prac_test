package test10;

import java.util.*;

public class string_rotation {
     public static void lf(String s,int n) {
    	 System.out.println(s.substring(n)+s.substring(0,n));
     }
     public static void rg(String s,int n) {
    	lf(s,s.length()-n);
    	return;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		lf(s,n);
		rg(s,n);

	}

}
