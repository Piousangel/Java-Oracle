package Day0805;

import java.util.*;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10); 
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));                       //5,4,2,0,1,3 insert in order
															
		ArrayList list2 = new ArrayList(list1.subList(1,4)); //1��~3�� copy & substitute in list2
		
		print(list1, list2);                             //call print method
		Collections.sort(list1);	                     //sort in ascending order
		Collections.sort(list2);						 //sort in ascending order
		print(list1, list2);                             //call print method
		System.out.println(list1.containsAll(list2));    //print boolean --> true 
		list2.add("B");                                  //insert B
		list2.add("C");									 //insert C
		list2.add(3, "A");                               //insert A in index  3
		print(list1, list2);							 //call print method
		list2.set(3, "AA");                              //replace "AA" to 'index 3 element'
		print(list1, list2);                             //call print method

		System.out.println(list1.retainAll(list2));	     //retain is same as contain??
														 //������ �÷��ǿ� ���Եǰ� �ִ� ��Ҹ��� ����Ʈ���� ���Եǰ��� 
		print(list1, list2);                             //call print method
		System.out.println(list1.size());                //print size of list1
		System.out.println(list2.size());				 //print size of list2 
	
		for(int i= 5; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);                         // while rotating, remove overlap elements
		}												 //  1,2
		print(list1, list2);                             //call print method
	} 

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		

	}

}
