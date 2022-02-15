package OoopsConcept;

public class InterfaceAbstractBasics {

	public static void main(String[] args) {
		Shape s;
		/*s= new Shape();
		s.draw();*/
		
		//overiding the darw() from shape
		Circle c= new Circle();
		c.draw();
		//Runtime Polymorphism
		s = new Circle();
		s.draw();
		s= new Rectangle();
		s.draw();
		
		
		
	}

}

abstract class Shape{
	Shape(){
		System.out.println("constructor called during runtime");
	}
	abstract void draw();
}

/*class Shape{
	void draw() {
		System.out.println("drawing a shape");
	}
}*/
/*Inheritance using keyword "extends" and overrides draw()
method in the parent class*/
class Rectangle extends Shape{
	public Rectangle() {
		System.out.println("Inside rectngle constructor");
	}
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Circle extends Shape{
	public Circle() {
		System.out.println("Inside circle constructor");
	}
	void draw() {
		System.out.println("Drawing a Circle");
	}
}
