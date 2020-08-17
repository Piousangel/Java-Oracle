package Day0805;

import java.util.ArrayList;

public class List02 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
	
		//System.out.println(list);
		list.add("hello");
		list.add(77);
		list.add(77);
		System.out.println(list);
		list.add(0,"kor");
		System.out.println(list);
		list.set(0, "java");
		list.remove(0);
		
		System.out.println(list);
				

	}

}
