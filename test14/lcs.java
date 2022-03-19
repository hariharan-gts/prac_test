package test14;

public class lcs {
    public static int LCS(char c1[],int n,char c2[],int m) {
    	if(n==0||m==0)
    		return 0;
    	if(c1[n-1]==c2[m-1])
    		return 1+LCS(c1,n-1,c2,m-1);
    	
    	return Math.max(LCS(c1,n-1,c2,m), LCS(c1,n,c2,m-1));
    }
	public static void main(String[] args) {
		 String s1 = "AGGTAB";
		 String s2 = "GXTXAYB";
		 
		 char c1[]=s1.toCharArray();
		 char c2[]=s2.toCharArray();
		 int n=c1.length;
		 int m=c2.length;
		 
		 System.out.println(LCS(c1,n,c2,m));
	}

}
