package test8;

public class Trans_one_str_to_other_min_op {
    public static int count(String s1,String s2) {
    	int res=0;
    	int c[]=new int[256];
    	if(s1.length()!=s2.length())
    		return -1;
    	for(int i=0;i<s1.length();i++) {
    		c[s1.charAt(i)]++;
    		c[s2.charAt(i)]--;
    	}
    	for(int i=0;i<256;i++) {
    		if(c[i]!=0) {
    			return -1;
    		}
    	}
    	int i=s1.length()-1;
    	int j=s2.length()-1;
    	while(i>=0) {
    		if(s1.charAt(i)!=s2.charAt(j))
    		res++;
    		else
    		j--;
    		
    		i--;
    	}
    	return res;
    }
	public static void main(String[] args) {
		String s1="EACBD";
		String s2="EABCD";
		System.out.println(count(s1,s2));

	}

}
