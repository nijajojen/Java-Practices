package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
		list2.addAll(Arrays.asList(6, 9, 10));
		System.out.println(mergeArrays(list1, list2));
	}

	static List<Integer> mergeArrays(List<Integer> list1, List<Integer> list2) {
		List<Integer> mergedList = new ArrayList<>();
		int l1Id = 0, l2Id = 0;
		while (l1Id < list1.size() && l2Id < list2.size()) {
			if (list1.get(l1Id) < list2.get(l2Id)) {
				mergedList.add(list1.get(l1Id));
				l1Id++;
			} else if (list2.get(l2Id) < list1.get(l1Id)) {
				mergedList.add(list2.get(l2Id));
				l2Id++;
			} else {
				mergedList.add(list1.get(l1Id));
				mergedList.add(list2.get(l2Id));
				l1Id++;
				l2Id++;
			}
		}

		while (l1Id < list1.size()) {
			mergedList.add(list1.get(l1Id));
			l1Id++;
		}
		while (l2Id < list2.size()) {
			mergedList.add(list2.get(l2Id));
			l2Id++;
		}

		return mergedList;
	}

}
