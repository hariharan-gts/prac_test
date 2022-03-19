package test15;

public class small_in_large {

	public static void main(String[] args) {
		
     int b[][]= {{4,5,9},{1,3,5},{8,2,4}};
     int s[][] ={{4,5},{1,3}};
     int n=b.length;
     int m=s.length;
     int x=0,y=0,flag=0,cnt=0;
     for(int i=0;i<n;i++) {
    	 for(int j=0;j<n;j++) {
    		 if(b[i][j]==s[x][y]) {
    			 cnt++;
    			 if(y<m) {
    				 y++;
          
    			 }
    			 if(y>=m) {
    				 x++;
    				 y=0;
    			 }
    			 if(cnt==m*m) {
    				 flag=1;
    			 }
    		 }
    	 }
     }
     System.out.println(flag==1?true:false);
//     System.out.println(Integer.toBinaryString(6));
//     System.out.println(Integer.parseInt(String.valueOf(110) ,2));
//     int val=6;
//     int ans=0;
//     int fac=1;
//     while(val>0) {
//    	
//    	 ans+=val%2*fac;
//    	 fac*=10;
//    	 val/=2;
//     }
//     int val1=110;
//     fac=1;
//     ans=0;
//     String s1=String.valueOf(val1);
//     for(int i=s1.length()-1;i>=0;i--) {
//    	 ans+=(s1.charAt(i)-'0')*fac;
//    	 fac*=2;
//     }
//     System.out.println(ans);
     
	}

}
