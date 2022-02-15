package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Array;


public class ThreeSum {

	public static void main(String[] args) {
		
		solutionThreeSum sln = new solutionThreeSum();
		List<List<Integer>> list= sln.findAns(new int[] {-1,0,1,2,-1,-4});
		System.out.println(list);
		
	}

}

class solutionThreeSum{
	
	Map<Integer,Boolean> arrCopy = new HashMap<Integer, Boolean>();
	Map<Integer,Integer> trackIndexMap = new HashMap<Integer, Integer>();
	List<List<Integer>> soltnList= new ArrayList<List<Integer>>();
	
	List<List<Integer>> findAns(int[] nums){
		copyArray(nums);
		for(int i= 0; i<nums.length; i++) {
			
			for(int j=i+1; j< nums.length; j++) {
				if( arrCopy.get(nums[j])==false) {
					int val=  -(nums[i]+ nums[j]);
					if(arrCopy.containsKey(val ) && arrCopy.get(val)== false &&(i!=j)&& (i!=trackIndexMap.get(val))&&(j!= trackIndexMap.get(val))){
						
						System.out.println(nums[i]+ " "+nums[j] + " "+-(nums[i]+ nums[j]));
						List list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(val);
						soltnList.add(list);
						arrCopy.replace(val, true);
						
					}
				}
			}
			
			arrCopy.replace(nums[i], true);
			System.out.println(arrCopy);
		}
		return soltnList;
	}

	private void copyArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arrCopy.put(arr[i], false);
			trackIndexMap.put(arr[i], i);
		}
		System.out.println(arrCopy);
	}
}
