package Day0805;

import java.util.ArrayList;

public class List03 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(77);
		list.add(37);
		list.add(47);
		list.add(1, 99);
		list.add(0, 0);
		
		
		ArrayList list2 = new ArrayList();
		list2.add(100);
		
		list2.addAll(0,list);
		
		ArrayList list3 = (ArrayList) list2.clone();
		
		ArrayList list4 = new ArrayList();
		list4.add(31);
		list4.add(77);
		
		
		boolean result = list3.contains(77);
		//boolean result2 = list3.containsAll(list2);
		System.out.println(result);
		//System.out.println(result2);
		result = list.containsAll(list4);
		System.out.println(result);
		
		Object obj =list.get(1);
		System.out.println("list�� 1��° �ε��� : "+ obj);
		
		System.out.println(list2);
		System.out.println(list3);
		
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.print(list.get(i)+ " ");
			
		}
		/*
		 * for(Object ob : list) {
		 * System.out.println(ob)
		 * } 
		 */                      //���� ����
		System.out.println();
		int index = list.indexOf(77);
		System.out.println(index); //�ش簪�� �ε�����ȣ
		System.out.println(list.isEmpty()); //�����?
		
		
		
		
		System.out.println("---------clear---------");
		list2.clear();
		System.out.println(list2);

	}

}
