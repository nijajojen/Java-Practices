package OoopsConcept;


class A{
	static int i=100;
	static {
		System.out.println("parent- static block");
		System.out.println(i);
		i= i-- - --i;
		System.out.println("i-- - --i"+i);
		System.out.println("first - "+ i);
	}
	{
		System.out.println("parent- anonymous block");
		System.out.println(i);
		i= i++ + ++i;
		System.out.println("i++ + ++i"+ i);
		System.out.println("Second"+i);
	}
}
 
 class B extends A{
	 
	 static {
		 System.out.println("Child- static block");
			System.out.println(i);
			i= --i - i--;
			System.out.println("--i - i--"+i);
			System.out.println("third"+ i);
		}
		{
			System.out.println("child- anonymous block");
			System.out.println(i);
			i= ++i + i++;
			System.out.println("++i + i++"+i);
			System.out.println("fourth"+i);
		}
 }
 
 
public class StaticBlockEx {
	static int i=100;
	static {
		
		System.out.println("parent- static block");
		System.out.println(i);
		i= i-- - --i;
		System.out.println("i-- - --i"+i);
		System.out.println("first - "+ i);
	}
	{
		System.out.println("parent- anonymous block");
		System.out.println(i);
		i= i++ + ++i;
		System.out.println("i++ + ++i"+ i);
		System.out.println("Second"+i);
	}
	public static void main(String[] args) {
		System.out.println("before creating instance "+i);
		StaticBlockEx obj1 = new StaticBlockEx();
		System.out.println("After creating instance: ");
		
		StaticBlockEx obj2 = new StaticBlockEx();
		System.out.println("After creating instance: ");
	}

}
