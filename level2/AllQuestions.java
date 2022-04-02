package level2;

public class AllQuestions {

	 public static boolean check(String s1,String s2) {
	    	int n=s1.length();
	    	int m=s2.length();
	    	for(int i=0;i<=n-m;i++) {
	    		int j;
	    		for(j=0;j<m;j++) {
	    			if(s1.charAt(i+j)!=s2.charAt(j))
	    				break;
	    		}
	    		if(j==m)
	    			return true;
	    	}
	    	
	    	return false;
	    }
	    public static void swap(int a,int b) {
	    	System.out.println(a+" "+b);
	    	a=a+b;
	    	b=a-b;
	    	a=a-b;
	    	System.out.println(a+" "+b);
	    }
	    public static boolean palidrome(String s) {
	    	int n=s.length();
	    	int i=0;
	    	while(i<n/2) {
	    		if(s.charAt(i)!=s.charAt(n-i-1))
	    		   return false;
	    		i++;
	    	}
	    	return true;
	    }
	    public static void pattern(int n) {
	    	for(int i=1;i<=n;i++) {
	    		for(int j=1;j<=i;j++) {
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}
	    }
	    public static int large(int a,int b) {
	    	return a*((a/b)>0?1:0)+b*((b/a)>0?1:0);
	    }
	    public static String reverse(String s) {
	    	String a[]=s.split(" ");
	    	int n=a.length;
	    	int i=0;
	    	while(i<n/2) {
	    		String t=a[i];
	    		a[i]=a[n-i-1];
	    		a[n-i-1]=t;
	    		i++;
	    		
	    	}
	    	String ans="";
	    	for(int j=0;j<a.length;j++) {
	    		ans+=a[j]+" ";
	    	}
	    	return ans;
	    }
		public static void main(String[] args) {
			String s1="geeksforgeeks";
			String s2="geek";
			System.out.println(check(s1,s2));//check substring contains or not without inbuilt
			swap(5,4);//swap without temp
			System.out.println(palidrome("opo"));//pallidrome or not
			pattern(5);//pattern
			System.out.println(large(121,124));//without airthmetic opearators
			String s="Hi there! How are you?";
			System.out.println(reverse(s));//reverse string
		}

}
