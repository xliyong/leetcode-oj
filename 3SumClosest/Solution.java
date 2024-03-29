//Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//
//    For example, given array S = {-1 2 1 -4}, and target = 1.
//
//    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//
import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] num, int target) {
		Arrays.sort(num);
		int res = num[0] + num[num.length - 1] + num[1];
		for(int i = 0; i < num.length-2; i++){
			int j = i+1; 
			int k = num.length -1;
			while(j<k){
				int temp = num[i] + num[j] + num[k];
				if(temp == target) return target;
				if(Math.abs(temp - target) < Math.abs(res - target)){
					res = temp;
				}
				if(temp > target) k--; // should not use "res" here for comparison
				else j++;
			}	
		}
		return res;
	}

}