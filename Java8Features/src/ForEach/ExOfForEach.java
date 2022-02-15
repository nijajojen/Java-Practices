package ForEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import java.lang.Integer;

public class ExOfForEach {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			myList.add(i);
		
		//Traversing through Iterator
		Iterator<Integer> it= myList.iterator();
		while(it.hasNext()) {
			Integer i= it.next();
			System.out.println(i);
		}
		
		//Traversing through forEach method of iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anonymous class value:"+t);
			}
		});
		
		//traversing with consumer interface implementation
		MyConsumer action= new MyConsumer();
		myList.forEach(action);

	}
	
	class MyConsumer implements Consumer<Integer>{
		public void accept(Integer t) {
			System.out.println(t);
		}
	}

}
