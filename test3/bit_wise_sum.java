package test3;
/*
 * Given an array of n elements, create a new array which is a rotation of given array and hamming distance between both the arrays is maximum. 
Hamming distance between two arrays or strings of equal length is the number of positions at which the corresponding character(elements) are different.
Note: There can be more than one output for the given input. 
Examples: 

Input :  1 4 1
Output :  2
Explanation:  
Maximum hamming distance = 2.
We get this hamming distance with 4 1 1 
or 1 1 4 

Input :  N = 4
         2 4 8 0
Output :  4
Explanation: 
Maximum hamming distance = 4
We get this hamming distance with 4 8 0 2.
All the places can be occupied by another digit.
Other possible solutions are 8 0 2 4 and 0 2 4 8.  
 */
public class bit_wise_sum {

	public static void main(String[] args) {
		int a[]= {5,10,15};
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				sum+=(a[i]&a[j]);
			}
		}
		System.out.println(sum);

	}

}
