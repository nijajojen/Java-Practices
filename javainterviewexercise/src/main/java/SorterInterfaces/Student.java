package SorterInterfaces;
import java.util.Comparator;
import java.lang.Comparable;

public class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name , int age){
		this.rollno= rollno;
		this.name= name;
		this.age= age;
	}
	
}

 class SortByRollno implements Comparator<Student>{
	@Override
	public int compare(Student a , Student b) {
		// TODO Auto-generated method stub
		return a.rollno-b.rollno;
	}
}
 
 class Sortbyname implements Comparator<Student> {
	    public int compare(Student a, Student b)
	    {
	        return a.name.compareTo(b.name);
	    }
	}
 
 

















