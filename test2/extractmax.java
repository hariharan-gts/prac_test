package test2;

/*
 * Input : 100klh564abc365bg
Output : 564
Maximum numeric value among 100, 564 
and 365 is 564.
 */

public class extractmax {
	 static int maxVal(String s) {
	    	int num=0,res=0;
	    	for(int i=0;i<s.length();i++) {
	    		if(Character.isDigit(s.charAt(i))) {
	    			num=num*10+(s.charAt(i)-'0');
	    		}else {
	    			res=Math.max(res,num);
	    			num=0;
	    		}
	    	}
	    	return Math.max(num, res);
	    }
	 
	public static void main(String[] args) {
		String str = "1000klh564abc365bg";
		System.out.println(maxVal(str));
	}

}

