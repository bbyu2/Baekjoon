package baekjoon_01;

import java.util.Scanner;

public class No_5596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0; 
		int t; //�Է¹��� ������
		
		for (int i = 0; i < 4; i++) {
			t = scan.nextInt();
			a = a+t; //�α��� ���� �ջ�
		}
		for (int i = 0; i < 4; i++) {
			t = scan.nextInt();
			b = b+t; //���� ���� �ջ�
		}
		// math.max()�Լ��� �Է°����� ���� 0���̻��� ���� �� ���� ū ���ڸ� ��ȯ�Ѵ�.
		System.out.println(Math.max(a, b)); 
		
		
		
		
	}

}
