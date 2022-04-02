package test14;

public class maginumber {
    public static int mag(int n) {
    	int pow=1,ans=0;
    	while(n!=0) {
    		pow*=5;
    		if((n&1)==1) {
    			ans+=pow;
    		}
    		n>>=1;
    	}
    	return ans;
    }
	public static void main(String[] args) {
		System.out.println(mag(5));

	}

}
