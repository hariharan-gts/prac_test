package test7;

import java.util.*;

public class ArrayLeader {
   //approach 1 o(n^2)
	public static void leader1(int a[]) {
		int j=0;
		for(int i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]<=a[j]) {
					break;
				}
			}
			if(j==a.length) {
				System.out.print(a[i]+" ");
			}
		}
	}
	//aproach 2 o(n)
	public static void leader2(int a[]) {
		ArrayList<Integer>li=new ArrayList<>();
		li.add(a[a.length-1]);
		int temp=a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			if(temp<a[i]) {
				li.add(a[i]);
				temp=a[i];
			}
		}
		Collections.reverse(li);
		System.out.println(Arrays.toString(li.toArray()));
		
	}
	public static void main(String[] args) {
		int a[]= {16,17,4,3,5,2};
		leader1(a);
		System.out.println();
		leader2(a);

	}

}
