package leetcode;

public class IntegerTlRoman {

	
	public static void main(String[] args) {
		NumSplitter obj = new NumSplitter();
		System.out.println(obj.findPreciseVal());
	}

}
class NumSplitter{
	IntegerTlRomanSoln resolver = new IntegerTlRomanSoln();
	public String findPreciseVal(){
		int num =20;
		int sum=0;
		int q=0;
		int tens=10;
		int numCopy=num;
		int remainingNum=0;
		int i=0;
		int unit =0;
		System.out.println("original num: "+num);
		String roman ="";
		if(num%10==0) {
			roman=resolver.findRange(num,-1);
		}
		while(numCopy%10 > 0) {
			i++;
			unit++;
			q=(numCopy/10);
			numCopy =numCopy%10;
			System.out.println("the remainder: "+numCopy);
			System.out.println("the current exact quotient: "+q);
			
			String rmn=resolver.findRange(numCopy,unit);
			numCopy =q;
			System.out.println(rmn);
			System.out.println("---------------------");
			roman = rmn+roman;
			
		}
		return roman;
	}
	
}
