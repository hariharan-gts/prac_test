package level_1;

public class excel {
   
	public static void find(int n) {
		StringBuilder s=new StringBuilder();
	    while(n>0) {
	    	int rem=n%26;
	    	if(rem==0) {
	    		s.append("Z");
	    		n=(n/26)-1;
	    	}else {
	    		s.append((char)((rem-1)+'A'));
	    		n/=26;
	    	}
	    }
	    System.out.println(s.reverse());
	}
	public static int find2(String a) {
	int res=0;
	for(int i=0;i<a.length();i++) {
		res=res*26+(a.charAt(i)-'A'+1);
	}
	return res;
	}
	public static void main(String[] args) {
	 int n=705;
	 find(n);
	 System.out.println(find2("AAC"));
	 

	}

}
