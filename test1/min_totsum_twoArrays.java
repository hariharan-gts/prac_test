package test1;
import java.util.*;

public class min_totsum_twoArrays {
    public static int min_sum(int a1[],int a2[]) {
    	int sum=0;
    	Arrays.sort(a1);
    	Arrays.sort(a2);
    	for(int i=0;i<a1.length;i++) {
    		sum+=a1[i]+a2[a1.length-i-1];
    	}
    	
    	return sum;
    }
	public static void main(String[] args) {
		int arr1[] = { 7, 6, 18, 6, 16,
                18, 1, 17, 17 };

        int arr2[] = { 6, 9, 3, 10, 9,
                1, 10, 1, 5 };
        
        System.out.println(min_sum(arr1,arr2));;

	}

}
