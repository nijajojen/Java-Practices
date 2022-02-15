package javabasics;

public class BuilderBufferPerfomnce {

	public static void main(String[] args) {
		int count= 9999999;
		long time;
		
		StringBuilder builder = new StringBuilder();
		time= System.currentTimeMillis();
		for(int i=count;i>0;i--) {
			builder.append("");
		}
		long timeAfterExec = System.currentTimeMillis();
		System.out.println("Builder exec time: ");
		System.out.println(timeAfterExec-time);
		
		StringBuffer buffer = new StringBuffer();
		time= System.currentTimeMillis();
		for(int i=count;i>0;i--) {
			buffer.append("");
		}
		long timeExec = System.currentTimeMillis();
		System.out.println("Buffer exec time: ");
		System.out.println(timeExec-time);
		

	}

}
