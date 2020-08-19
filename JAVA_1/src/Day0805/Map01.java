package Day0805;

import java.util.*;

public class Map01 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("java", "111");
		map.put("C", "123");
		
		System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�����ϰ���� value > ");
		String input = scan.nextLine();
		map.put("R", input);
		
		System.out.println(map);
		
	}

}

//�Ű����� ������ ���׸� ���ʸ��̶� ��.
//key�� �ߺ��� ������� �ʱ� ������ �����Ⱑ �˴ϴ�.