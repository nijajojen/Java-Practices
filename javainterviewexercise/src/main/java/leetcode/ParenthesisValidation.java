package leetcode;

public class ParenthesisValidation {

	public static void main(String[] args) {
		solnValid obj = new solnValid();
		boolean res= obj.findValid("({}[]{})");
		System.out.println(res);
		
	}

}

class solnValid{
	boolean res;
	public boolean findValid(String str) {
		char[] charArray = str.toCharArray();
		int length = charArray.length-1;
		int mid = length/2;
		if(mid%2!=0) {
			 res=findAns(charArray,mid,mid+1);
		}
		else {
			 res=findAns(charArray, mid,mid);
		}
		return res;
	}

	private boolean findAns(char[] charArray, int lo, int hi) {
		if(lo == hi) {
			lo--;hi++;
		}
		while(lo>=0 && hi<= charArray.length-1) {
			
			if((charArray[lo]=='(' && charArray[hi]==')')|| (charArray[lo]=='{'&& charArray[hi]=='}') || (charArray[lo]=='[' && charArray[hi]==']') ) {
				
			}
			else
				return false;
			lo--;
			hi++;
		}
		return true;
	}

}