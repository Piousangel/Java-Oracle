package Day0805;

import java.util.*;

public class Set01 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		for(int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) +1;
			
			set.add(new Integer(num));
			
		}
		
		System.out.println(set);
		System.out.println(set.size());
		
		
		
		
		
		
		
		
		

	}

}

//������� X , �ߺ� X , NULL�� �ϳ���.