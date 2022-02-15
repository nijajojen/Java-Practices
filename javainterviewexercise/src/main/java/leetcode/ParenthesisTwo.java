package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ParenthesisTwo {
	public static void main(String[] args) {
		SolutionParen obj = new SolutionParen();
		System.out.println(obj.isValid("{[]}"));
	}
}
class SolutionParen {
    public boolean isValid(String s) {
    	Map<Character,Character> hashMap= new HashMap<Character,Character>();
    	hashMap.put('}', '{');
    	hashMap.put(')', '(');
    	hashMap.put(']', '[');
    	StringBuilder sb = new StringBuilder(s);
    	int i=0;
    	boolean delete= false;
    	while( i<sb.length()) {
    		if(i==0) {
    			i++;
    			continue;
    		}
    		boolean closedValue=hashMap.containsKey(sb.charAt(i));
	    	if( closedValue &&(sb.charAt(i-1) != hashMap.get(sb.charAt(i)))) {
	    		return false;
	    	}
	    	else if(closedValue &&(sb.charAt(i-1) == hashMap.get(sb.charAt(i)))) {
	    		sb.deleteCharAt(i);
	    		sb.deleteCharAt(i-1);
	    		System.out.println(sb.toString());
	    		System.out.println("length "+sb.length());
	    		System.out.println("i "+i);
	    		delete=true;
	    	}
	    	if(!delete)
	    		i++;
	    	else
	    		i-=1;
	    	delete=false;
	    	
    	}
    	if(sb.length()==0)
    		return true;
    	else
    		return false;
        
       
    }
}
