package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		 
		Solution obj = new Solution();
		int n= 100;
		
		System.out.println(obj.happyNum(n));
	}
}

class Solution{
	public boolean happyNum(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int ans=0;
		while(n!=1) {
			while(n>0) {
				int digit=n%10;
				n=n/10;
				list.add(digit);
				ans= ans+ digit *digit;
			}
			if(ans==1)
				return true;
			n=ans;
			ans=0;
			
		}
		return false;
		 
    }
}

