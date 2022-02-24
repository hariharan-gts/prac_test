package test10;

import java.util.*;

public class all_comb_parenthesis {
   public static void printcomb(int n) {
	   ArrayList<String>li=new ArrayList<>();
	   backtrack(li,"",0,0,n);
	   Collections.reverse(li);
	   System.out.println(li);
   }
   public static void backtrack(ArrayList<String>li,String str,int op,int cl,int max) {
	   if(str.length()==max*2) {
		   li.add(str);
		   return;
	   }
	   if(op<max) {
		   backtrack(li, str+"(", op+1, cl, max);
	   }
	   if(cl<op)
		   backtrack(li, str+")", op, cl+1, max);
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printcomb(n);
	}

}
