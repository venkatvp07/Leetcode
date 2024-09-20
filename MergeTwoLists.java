package New;

import java.util.LinkedList;

public class MergeTwoLists {

	public static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {
		list1.addAll(list2);
		list1.sort(null);
		return list1;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(3);
		list2.add(4);
		
		System.out.print(mergeTwoLists(list1,  list2));
	}

}
