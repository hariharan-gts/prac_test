package test6;

import java.util.HashSet;

public class nextHappyNumber {
	 public static boolean ishappy(int n) {
		 HashSet<Integer>hs=new HashSet<Integer>();
		 int index=0,val=0;
		 while(true) {
			 val=0;
			 while(n>0) {
				 index=n%10;
				 val+=index*index;
				 n/=10;
			 }
			 if(val==1||val==7) {
				 return true;
			 }
			 else if(hs.contains(val)) {
				 return false;
			 }
			 hs.add(val);
			 n=val;
		 }
		 
	 }
	public static int nextint(int n) {
		n++;
		while(ishappy(n)!=true) {
			n++;
		}
		return n;
	}
	public static void main(String[] args) {
	int a[]= {8,3,0,10};
	for(int i=0;i<a.length;i++) {
		System.out.println(nextint(a[i]));
	}
	}

}
