package baekjoon_01;

import java.util.Scanner;

public class No_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); // ���� ��
		int b = scan.nextInt(); // ���� ��
		int c = scan.nextInt(); // �丮�ϴµ� �ɸ��� �ð�
	
		
		if (b+c > 60) {
			a = a + 1;
			b = (b+c)-60;
		} else if (b+c == 100) {
			a = a + 1;
			b = 0;
		} else {
			b = b + c;
		}
		
		
		System.out.println(a +" "+ b);
		
		
		
	}

}
