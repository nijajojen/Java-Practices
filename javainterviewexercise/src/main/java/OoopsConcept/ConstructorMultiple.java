package OoopsConcept;

public class ConstructorMultiple {

	ConstructorMultiple(){
		this(0);
		System.out.println("Exit no arg constrctr");
	}
	ConstructorMultiple(int x){
		this(0,0);
		System.out.println("Exit 1 arg constrctr");
	}
	ConstructorMultiple(int x, int y){
		System.out.println("Exit 2 arg constrctr");
	}
	public static void main(String[] args) {
		System.out.println("in Main");
		ConstructorMultiple obj = new ConstructorMultiple();
		System.out.println("exit Main");

	}

}









