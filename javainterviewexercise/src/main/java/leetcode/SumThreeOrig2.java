package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumThreeOrig2 {

	public static void main(String[] args) {
		soln obj = new soln();
		List<List<Integer>> res=obj.threeSum(new int[] {-1,0,1,2,-1,-4});
		System.out.println(res);
	}

}

class soln{
	List<List<Integer>> result = new LinkedList<>();
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-2; i++) {
			
			
			if(i==0 ||(i>0 && (nums[i]!= nums[i-1]))) {
				int lo= i+1;
				int hi= nums.length-1;
				int sum = 0- nums[i];
				while (lo<hi) {
					if(nums[lo]+nums[hi]==sum) {
						//System.out.println(nums[i]+nums[lo]+nums[hi]);
						result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
						while(lo<hi && nums[lo]== nums[lo+1])lo++;
						while(lo<hi && nums[hi]==nums[hi-1])hi++;
						lo++;
						hi--;
					}
					else if(nums[lo]+nums[hi] < sum)lo++;
					else
						hi--;
				}
			}
		}
			
	
			return result;
		
	}
}
