package SorterInterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student( 1, "A" ,  25));
		al.add(new Student( 20, "C" ,  31));
		al.add(new Student( 8, "D" ,  30));
		al.add(new Student( 10, "B" ,  40));
		
		System.out.println("unsorted..");
		al.stream().forEach(listItem->{System.out.println(listItem);});
		
		System.out.println("SortByRollno..");
		Collections.sort(al, new SortByRollno());
		al.stream().forEach(item-> {
			System.out.println(item.age + " "+item.name+" "+ item.rollno);
			});
		
		System.out.println("SortByName..");
		Collections.sort(al, new Sortbyname());
		al.stream().forEach(listItem->{System.out.println(listItem);});
		
	}

}
