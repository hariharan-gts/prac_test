LINK:https://www.geeksforgeeks.org/print-characters-frequencies-order-occurrence/
package test4;

import java.util.HashMap;

public class frequency {

	public static void main(String[] args) {
		String s="welcometomyworld";
		HashMap<Character,Integer>mp=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(mp.get(c)!=null) {
				mp.put(c, mp.get(c)+1);
			}else {
				mp.put(c, 1);
			}
		}
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(mp.get(c)!=-1) {
				System.out.print(c);
				System.out.print(mp.get(c));
				System.out.print(" ");
				mp.put(c, -1);
			}
			
		}

	}

}
