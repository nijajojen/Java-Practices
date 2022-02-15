package javabasics;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class CollectionBasics {

	public static void main(String[] args) {
		
		//HashMap
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("Name", "bear");
		map.put("color", "black");
		for(String key: map.keySet()) {
			System.out.println("value: "+map.get(key));
		}
//		System.out.println(map);
//		System.out.println(map.get("Name"));
//		System.out.println(map.remove("Name"));
//		System.out.println(map);
//		map.clear();
//		System.out.println(map);
//		System.out.println(map.size());
		
		//ArrayList
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("green");
		arrayList.add("red");
		arrayList.set(0,"yellow");
		arrayList.add("blue");
		for(String i: arrayList) {
			System.out.println("Iteration using for loop"+i);
		}
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		//System.out.println(arrayList.get(2));
		arrayList.remove(0);
		System.out.println(arrayList);
		System.out.println("Size:"+arrayList.size());
		arrayList.clear();
		System.out.println(arrayList);
	}

}
