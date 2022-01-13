package test5;

import java.util.Scanner;

public class arya_whitewalkers {
    public static int no_stabs(int n) {
    	int sum=0;
    	while(n>0) {
    		sum+=n&1;
    		n>>=1;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			System.out.println(no_stabs(n));
		}

	}

}
