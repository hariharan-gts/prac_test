package level_1;

import java.util.*;

public class len_of_last_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a[]=s.split(" ");
		int n=a.length;
		System.out.println(a[n-1].length());

	}

}
