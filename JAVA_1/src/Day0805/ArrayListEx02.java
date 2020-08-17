package Day0805;

import java.util.*;

public class ArrayListEx02 {

	public static void main(String[] args) {
		
		final int LIMIT = 10;	//final.int
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length(); 
		List list = new ArrayList(length/LIMIT + 10);    // plus 10 while i < length
		for(int i=0; i < length; i+=LIMIT) {   
			if(i+LIMIT < length ) 						 // 0,10,20+ limit < length
				list.add(source.substring(i, i+LIMIT));  // memorize 0~9->[0], 10~ 19->[1], 20~29
			else 
				list.add(source.substring(i));           //else-> [3]
		} 

		for(int i=0; i < list.size(); i++) {      		 //loop list.size
			System.out.println(list.get(i));             //pr1ntf.. list
		} 

	}

}
