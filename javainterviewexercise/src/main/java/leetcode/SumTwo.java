package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumTwo {

	public static void main(String[] args) {
		SolutionTwoSum obj = new SolutionTwoSum();
		int[] res=obj.twoSum(new int[] {3,2,4}, 6);
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
class SolutionTwoSum {
	Map<Integer,Integer> IndexMap = new HashMap<Integer, Integer>();
    public int[] twoSum(int[] nums, int target) {
        putInMap(nums);
        for(int i=0; i<nums.length; i++) {
        	int complement = target- nums[i];
        	if(IndexMap.containsKey(complement)) {
        		if(IndexMap.get(complement)!= i) {
        			return new int[] {i,IndexMap.get(complement) };
        		}
        	}
        }
    	return new int[] {};
    }

	private void putInMap(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			IndexMap.put(nums[i], i);
		}
		
	}
    
}
