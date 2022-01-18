package test6;

public class best_time_tobuyandsell {
    public static int max_prof(int a[]) {
    	int max=0;
    	int min=Integer.MAX_VALUE;
    	for(int i=0;i<a.length;i++) {
    		min=Math.min(a[i],min);
    		max=Math.max(max, a[i]-min);
    	}
    	return max;
    }
	public static void main(String[] args) {
	int a[]= {5,4,3,2,7};	
    System.out.println(max_prof(a));
	}

}
