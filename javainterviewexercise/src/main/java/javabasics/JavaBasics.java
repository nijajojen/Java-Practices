package javabasics;

public class JavaBasics {

	public static void main(String[] args) {
		
		System.out.println("String, String Builder, String Buffer");
		String str= "dicruz";
		String strObj = new String("dicruz");
		strObj.concat("Hi");
		StringBuilder strbuldr = new StringBuilder("Dicruzz");
		StringBuffer strbuffr = new StringBuffer("Dicruz");
		System.out.println("String without new "+str.concat("umma"));
		System.out.println("String with new obj "+strObj);
		System.out.println("StringBuilder"+strbuldr.append("umma"));
		System.out.println("StringBuffer"+strbuffr.append("umma"));
		
		//finalize()
		JavaBasics ex1= new JavaBasics();
		JavaBasics ex2= new JavaBasics();
		ex1= null;
		//ex2= null;
		System.gc();
		
		//final
		final int valFinal = 100;
		//valFinal=1000;
		
		//boxingunboxing
		int iPrimitive= 10;
		Integer iref= new Integer(iPrimitive);//boxing
		int jPrimitive= iref.intValue();//unboxing:extracting value from object
		
		Integer kref= iPrimitive; //autoboxing
		int kprimitive= kref; //autounboxing
		
	}
	public void finalize() {
		System.out.println("finalize() method called");
	}
	
	
}
protected class ClasName{
	
}
