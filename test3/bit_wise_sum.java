package test3;

public class bit_wise_sum {

	public static void main(String[] args) {
		int a[]= {5,10,15};
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				sum+=(a[i]&a[j]);
			}
		}
		System.out.println(sum);
        System.out.println(10&15);
	}

}
