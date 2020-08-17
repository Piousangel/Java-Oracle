package Day0805;

import java.util.*; 
class ScannerEx1 { 
      public static void main(String[] args) { 
            Scanner scan = new Scanner(System.in); // Scanner(InputStream source)
            String input = ""; 
            do { 
                  System.out.print("���ϴ� ���� �Է��ϼ���. �Է��� ��ġ���� Q�� �Է��ϼ���.->"); 
                  // �Է��� ���� ���� ������ �о� �´�. 
                  input = scan.nextLine(); 
                  System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�."); 
            } while(!input.equalsIgnoreCase("Q")); 

            System.out.println("���α׷��� �����մϴ�."); 
      } 
} 