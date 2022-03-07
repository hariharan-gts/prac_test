package test12;

public class string_rotation {
   public static void lf(String s,int d) {
	   System.out.println(s.substring(d)+s.substring(0,d));
   }
   public static void rg(String s,int d) {
	   lf(s,s.length()-d);
	   return;
   }
	public static void main(String[] args) {
		String s="HariharanGTS";
		lf(s,3);
		rg(s,3);

	}

}
