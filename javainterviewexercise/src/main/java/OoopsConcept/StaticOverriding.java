package OoopsConcept;


 class Parent{
	 Parent(){
		 System.out.println("In Parent Constructor");
	 }
	public static void display() {
		System.out.println("Parent=static method or class method from the Base class");
		
	}
	public void print() {
		System.out.println("Parent=instance method or Non-static method from the Base class");
	}
}
 
 class Child extends Parent{
	 Child(){
		 System.out.println("In Child Constructor");
	 }
	 public static void display() {
			System.out.println("Child-static method or class method from the Derived class");
			
		}
	 public void print() {
			System.out.println("Child-instance method or Non-static method from the Derived class");
		}
 }
 
 
public class StaticOverriding {

	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		parent.display();
		child.display();
		
		parent.print();
		child.print();
		
		
		
		
		
		
	}

}
