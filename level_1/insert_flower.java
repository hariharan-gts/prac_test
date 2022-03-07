package level_1;

import java.util.*;

public class insert_flower {
    public static boolean insert(int a[],int n,int k) {
    	if(n==0)
    		return true;
    	int next=0,prev=0;
    	for(int i=0;i<n;i++) {
    		
    		if(can(a,i)) {
    			a[i]=1;
    			k--;
    		}
    		if(k==0) {
    			return true;
    		}
    	}
    	return false;
    }
    public static boolean can(int a[],int i) {
    	int prev=i==0?i:i-1;
		int next=i==a.length-1?i:i+1;
		return a[i]==0&&a[next]==0&&a[prev]==0;
    }
	public static void main(String[] args) {
		int a[]= {1,0,0,0,1};
		System.out.println(insert(a,a.length,3));
	}

}
