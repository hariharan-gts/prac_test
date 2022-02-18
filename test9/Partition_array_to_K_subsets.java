package test9;

public class Partition_array_to_K_subsets {
	 public static boolean isKrec(int a[],int subset[],boolean visit[],int k,int n,int subsum,int cur,int end){
	        if(subset[cur]==subsum){
	            if(cur==k-2)
	            return true;
	            
	            return isKrec(a,subset,visit,k,n,subsum,cur+1,n-1);
	        }
	        for(int i=end;i>=0;i--){
	            if(visit[i])
	            continue;
	            
	            int temp=a[i]+subset[cur];
	            
	            if(temp<=subsum){
	                visit[i]=true;
	                subset[cur]+=a[i];
	                boolean nxt=isKrec(a,subset,visit,k,n,subsum,cur,i-1);
	                
	                 visit[i]=false;
	                subset[cur]-=a[i];
	                if(nxt)
	                return true;
	            }
	        }
	        return false;
	    }
	    public static boolean isKPartitionPossible(int a[], int n, int k)
	    {
	      if(k==1)
	      return true;
	      if(k>n)
	      return false;
	      
	      int sum=0;
	      
	      for(int i=0;i<n;i++)
	      sum+=a[i];
	      
	      if(sum%k!=0)
	      return false;
	      
	      int subsum=sum/k;
	      int subset[]=new int[k];
	      boolean visit[]=new boolean[n];
	      
	      subset[k-1]=a[n-1];
	      visit[n-1]=true;
	      
	      return isKrec(a,subset,visit,k,n,subsum,0,n-1);
	    }
	
	public static void main(String[] args) {
		int a[]= {2,1,4,5,6};
		
		System.out.println(isKPartitionPossible(a,5,3));

	}

}
