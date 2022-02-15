package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Reastaurents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Result {

    /*
     * Complete the 'findRestaurants' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY allLocations
     *  2. INTEGER numRestaurants
     */

    public static List<List<Integer>> findRestaurants(List<List<Integer>> allLocations, int numRestaurants) {
    	Map<Double,List<Integer>> distanceSorted = new TreeMap<>();
    	allLocations.forEach(item->{
    		int x=item.get(0);
    		int y= item.get(1);
    		double distance= Math.sqrt((x*x )+(y*y));
    		distanceSorted.put(distance,item);
    	});
    	
    	List<List<Integer>> nearByLocations= new ArrayList<>();
    	int counter=0;
    	for(Map.Entry<Double,List<Integer>> entrySet :distanceSorted.entrySet() ) {
    		if(counter< numRestaurants) {
    			nearByLocations.add(entrySet.getValue());
    			counter++;
    		} else {
    			break;
    		}
    	}
    	return nearByLocations;
    }

}
