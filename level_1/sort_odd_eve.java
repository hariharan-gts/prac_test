package level_1;

import java.util.*;

public class sort_odd_eve {
    public static void convert(int a[],int n) {
    	ArrayList<Integer>eve=new ArrayList<>();
    	ArrayList<Integer>odd=new ArrayList<>();
    	for(int i=0;i<n;i++) {
    		if(i%2!=1) {
    			eve.add(a[i]);
    		}else {
    			odd.add(a[i]);
    		}
    	}
    	Collections.sort(eve);
    	
    	Collections.sort(odd);
    	Collections.reverse(odd);
    	int i=0,j=0;
    	for(int k=0;k<n&&i<eve.size();k+=2) {
    		a[k]=eve.get(i);
    		i++;
    	}
    	for(int k=1;k<n&&j<odd.size();k+=2) {
    		a[k]=odd.get(j);
    		j++;
    	}
    	System.out.println(Arrays.toString(a));
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2,3,4,5,6,7,8 };
        int n = arr.length;
        convert(arr, n);
	}

}
