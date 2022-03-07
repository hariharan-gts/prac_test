package test12;

import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1#
public class min_window_string {
	public static String smallestWindow(String s, String p)
    {
        int n = s.length();
        int m = p.length();
        char[] ch = s.toCharArray();
        int i,j;
        
        HashMap<Character, Integer> hs = new HashMap<>();
        
        for(i=0;i<m;i++){
            if(!hs.containsKey(p.charAt(i)))
                hs.put(p.charAt(i),1);
            else
                hs.put(p.charAt(i), hs.get(p.charAt(i))+1);
        }
        
        int count = hs.size();
        String res = "-1";
        int max = Integer.MAX_VALUE;
        i=0;
        j=0;
        while(j<n){
            if(hs.containsKey(ch[j]))
           {
                hs.put(ch[j],hs.get(ch[j])-1);
                
                if(hs.get(ch[j])==0)
                count--;
           }
           while(count==0){
               int num=j-i+1;
               if(max>num){
                   max=num;
                   res=s.substring(i,j+1);
               }
           if(hs.containsKey(ch[i]))
           {
                hs.put(ch[i],hs.get(ch[i])+1);
                
                if(hs.get(ch[i])>0)
                count++;
           }
           i++;
           }
            j++;
        }
        
        return res;
    }
	public static void main(String[] args) {
		String s = "ADOBECODEBANC", t = "ABC";
		System.out.println(smallestWindow(s,t));
	}

}
