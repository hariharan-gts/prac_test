package test14;

public class perfsq_str {
        
    public static int perf(String s) {
    	int ans=-1;
    	String num="";
    	int n=s.length();
    	for(int i=1;i<(1<<n);i++) {
    		String str="";
    		for(int j=0;j<n;j++) {
    			if(((i>>j)&1)==1) {
    				str+=s.charAt(j);
    			}
    	
    		if(str.charAt(0)!='0') {
    			int temp=0;
    			for(int l=0;l<str.length();l++) {
    				temp=temp*10+(str.charAt(l)-'0');
    			}
    			int k=(int)Math.sqrt(temp);
    			if(k*k==temp) {
    				if(ans<str.length()) {
    					ans=str.length();
    					num=str;
    				}
    			}
    		}
    	}
    	
    }
    	if(ans==-1)return ans;
    	else
    		return Integer.parseInt(num);
    }
    public static void main(String args[])
    {
        System.out.println(perf("8314"));
        
    }
}