package leetcode;

public class multiplySTrings {

	public static void main(String[] args) {
		
		
		String num1 = "123", num2 = "456";
		SlnMul ob = new SlnMul();
		System.out.println(ob.multiply(num1, num2));
	}

}
class SlnMul{
    public String multiply(String num1, String num2) {
    	char[] charArray1= num1.toCharArray();
    	char[] charArray2= num2.toCharArray();
    	
    	int lengthArray1= charArray1.length;
    	int lengthArray2= charArray2.length;
    	int i1=0,i2=0;
    	Double ansNum1=0d,ansNum2=0d;
    	
    	while(i1<lengthArray1 || i2<lengthArray2) {
    		if(i1<lengthArray1) {
    			int ascVal1= charArray1[i1];
    			int actualNumFrmAscVal1= ascVal1-48;
    			ansNum1=ansNum1*10 +actualNumFrmAscVal1;
    			i1++;
    		}
    		if(i2<lengthArray2) {
    			int ascVal2= charArray2[i2];
    			int actualNumFrmAscVal2= ascVal2-48;
    			ansNum2=ansNum2*10 +actualNumFrmAscVal2;
    			i2++;
    		}
    	}
    	
    	Double finalInt= ansNum1*ansNum2;
    	String rounded = String.format("%.0d", finalInt);
    	
    	return rounded;
    	
//    	System.out.println("ansString "+ ansString);
//    	System.out.println("from: "+ascVal1+" to "+actualNumFrmAscVal1+"= "+ascVal1+"-"+48);
//		System.out.println("from: "+ascVal2+" to "+actualNumFrmAscVal2+"= "+ascVal2+"-"+48);
    	
        
    }
}