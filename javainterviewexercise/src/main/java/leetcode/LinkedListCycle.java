package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode head= new ListNode(5);
		ListNode node1= new ListNode(3);
		ListNode node2= new ListNode(2);
		ListNode node3= new ListNode(1);
		head.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node1;
		SolutionLcycle obj= new SolutionLcycle();
		System.out.println(obj.hasCycle(head));
	}
}

 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
  }
 
 class SolutionLcycle {
    public boolean hasCycle(ListNode head) {
    	int pos=0;
    	Map<ListNode,Integer> map= new HashMap<ListNode,Integer>();
    	ListNode node=head;
    	while(node!=null){
    		if(!map.containsKey(node))
    			map.put(node, null);
    		else
    			return true;	
    		System.out.println(node.val);
    		node= node.next;
    		pos++;
    	}
    	return false;
    }
}
