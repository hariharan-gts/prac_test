package test15;

import java.util.*;

public class sort_by_freq_dec {

	public static void main(String[] args) {
	int arr[]= {1,1,2,2,2,-1,-1,-1,-1};
	int size=arr.length;
	HashMap<Integer, Integer> freqMap
    = new HashMap<Integer, Integer>();

for (int i=0;i<size;i++) {
    if (freqMap.containsKey(arr[i])) {
        freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
    }
    else {
        freqMap.put(arr[i], 1);
    }
} 
     int cnt=0;
      int b[][]=new int[freqMap.size()][2];
      for(Map.Entry<Integer,Integer>e:freqMap.entrySet()) {
    	  b[cnt][0]=e.getKey();
    	  b[cnt][1]=e.getValue();
    	  cnt++;
      }
     Arrays.sort(b,new Comparator<int []>(){

		@Override
		public int compare(final int[] o1, final int[] o2) {
			if(o1[1]<o2[1])
				return 1;
			else
				return -1;
		}
		
	});
	
	for(int j=0;j<b.length;j++) {
		System.out.println(b[j][0]+"\t"+b[j][1]);
	}
	ArrayList<Integer>li=new ArrayList<Integer>();
	li.add(4);
	li.add(5);
	li.add(5);

	li.add(5);

	li.add(4);
	li.add(9);
	System.out.println(Collections.frequency(li, 5));
	
	}

	}


