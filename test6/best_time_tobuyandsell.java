package test6;

public class best_time_tobuyandsell {
    public static int max_prof(int a[]) {
    	int max=0;
    	int min=Integer.MAX_VALUE;
    	int smin=Integer.MAX_VALUE;
    	int smax=0;
    	for(int i=0;i<a.length;i++) {
    		min=Math.min(a[i],min);
    		max=Math.max(max, a[i]-min);
    		smin=Math.min(smin, a[i]-max );
    		smax=Math.max(smax, a[i]-smin);
    	}
    	return smax;
    }
	public static void main(String[] args) {
	int a[]= {10,20,25,15,40 };	
    System.out.println(max_prof(a));
	}

}
