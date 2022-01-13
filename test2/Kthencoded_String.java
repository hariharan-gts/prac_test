package test2;

/*
 * Given an encoded string where repetitions of substrings are represented as substring followed by count of substrings. For example, if encrypted string is “ab2cd2” and k=4 , so output will be ‘b’ because decrypted string is “ababcdcd” and 4th character is ‘b’.
Note: Frequency of encrypted substring can be of more than one digit. For example, in “ab12c3”, ab is repeated 12 times. No leading 0 is present in frequency of substring. 
Examples: 
 

Input: "a2b2c3", k = 5
Output: c
Decrypted string is "aabbccc"

Input : "ab4c2ed3", k = 9
Output : c
Decrypted string is "ababababccededed"

Input: "ab4c12ed3", k = 21
Output: e
Decrypted string is "ababababccccccccccccededed"
 */
public class Kthencoded_String {
   static void encode(String s,int k) {
	   String temp="";
	   String exp="";
	   int frq=0;
	   for(int i=0;i<s.length();) {
		   temp="";
		   frq=0;
		   while(i<s.length()&&s.charAt(i)>='a'&&s.charAt(i)<='z') {
			   temp+=s.charAt(i);
			   i++;
		   }
		   while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9') {
			   frq=frq*10+(s.charAt(i)-'0');
			   i++;
		   }
		   for(int j=1;j<=frq;j++) {
			   exp+=temp;
		   }
	   }
	   //if string end without numbers to tackel tha case
	   if(frq==0) {
		   exp+=temp;
	   }
	   System.out.println(exp.charAt(k-1));
	   System.out.println("Decrypted String is "+"\""+exp+"\"");
   }
	public static void main(String[] args) {
		
		String str = "ab4c13ed";
        int k = 21;
        encode(str, k);
	}

}
