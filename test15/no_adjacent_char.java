package test15;

import java.util.Arrays;

public class no_adjacent_char {
    public static int[]get_max(int c[]){
    	int ans[]=new int[2];
    	int max=0;
    	int a=0;
    	for(int i=0;i<26;i++) {
    		if(c[i]>max) {
    			max=c[i];
    			a=i;
    		}
    	}
    	ans[0]=max;
    	ans[1]=a;
    	
    	return ans;
    }
    public static String reaarange(String s) {
    	
    	int n=s.length();
    	if(s.length()==0)
    		return "false";
    	int c[]=new int[26];
    	Arrays.fill(c, 0);
    	for(char l:s.toCharArray()) {
    		c[l-'a']+=1;
    	}
    	int max[]=get_max(c);
    	int maxcnt=max[0];
    	char maxc=(char)(max[1]+'a');
    	
    	if(maxcnt>(n+1)/2)
    		return "false";
    	
    	char ans[]=new char[n];
    	int ind=0;
    	int i=0;
    	while(i<maxcnt) {
    		ans[ind]=maxc;
    		ind+=2;
            i++;
    	}
    	c[((int)maxc)-'a']=0;
    	i=0;
    	for(i=0;i<26;i++) {
    		while(c[i]>0) {
    			if(ind>=n) {
    				ind=1;
    			}
    			ans[ind]=(char)(i+'a');
    			ind+=2;
    			c[i]-=1;
    		}
    	}
    	return String.valueOf(ans);
    }
	public static void main(String[] args) {
	String a="bbbaa";
	System.out.println(reaarange(a));

	}

}
