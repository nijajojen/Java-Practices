package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class DeviceMemory {

	public static void main(String[] args) {
		
		List<List<Integer>> foregroundAppList = new ArrayList<>();
		foregroundAppList.add(Arrays.asList(1,2));
		foregroundAppList.add(Arrays.asList(2,4));
		foregroundAppList.add(Arrays.asList(3,6));
		
		List<List<Integer>> backgroundAppList = new ArrayList<>();
		backgroundAppList.add(Arrays.asList(1,2));

		List<List<Integer>> applList = applicationPairs(7,foregroundAppList,backgroundAppList);

		applList.forEach(item-> System.out.println(item.get(0) + ":" + item.get(1)));
	}
	
	public static List<List<Integer>> applicationPairs(int deviceCapacity, List<List<Integer>> foregroundAppList, List<List<Integer>> backgroundAppList) {
		
		TreeMap<Integer,List<List<Integer>>> optimizedDevices= new TreeMap<>();
		
		for(List<Integer> foreground :foregroundAppList) {
			for(List<Integer> background:backgroundAppList ) {
				int memoryUsage= foreground.get(1)+background.get(1);
					if(memoryUsage<=deviceCapacity) {
						List<List<Integer>> devices= optimizedDevices.get(memoryUsage);
						if(devices==null) {
							devices= new ArrayList<>();
						}
						List<Integer> device= new ArrayList<>();
						device.add(foreground.get(0));
						device.add(background.get(0));
						devices.add(device);
						optimizedDevices.put(memoryUsage, devices);
					}
				
				}
		}
		if(optimizedDevices.size()==0) {
			return new ArrayList<>();
		}
		return optimizedDevices.lastEntry().getValue();
		
 }
	
}


