package leetcode;
import java.util.*;

public class TwoSumSoln {


	public static void main(String[] args) {
		String[] arr= new String[] {"a","bb", "acd","ace"};
		System.out.println(findSubSequence("abcde", arr));
	}
	
	static Integer findSubSequence(String target, String[] words){
		//char[] target= s.toCharArray();
		int count=0;
		boolean atleastOnce=false;
		int wordIndex=0;
		int targetIndex=0;
		for(int i=0;i<words.length;i++) {
			 wordIndex=0;
			 targetIndex=0;
			 atleastOnce=false;
			while(wordIndex<words[i].length()){
				if(targetIndex==target.length()) {
					break;
				}
				if(words[i].charAt(wordIndex)== target.charAt(targetIndex)) {
					atleastOnce=true;
					wordIndex++;
					targetIndex++;
				}
				else {
					atleastOnce=false;
					targetIndex++;
				}
			}
			if(atleastOnce== true)
				count++;
		}
		
		atleastOnce=false;
		return count;
	}

	
	
	
}
