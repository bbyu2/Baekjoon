package baekjoon_01;

import java.util.Scanner;

public class No_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int  a = scan.nextInt(); // 1�Ⱓ �������
		int  b = scan.nextInt(); // ��Ʈ�� 1�� ������
		int  c = scan.nextInt(); // ��Ʈ�� ����
		int result;
		
			if (b>=c) {
				result = -1;
			} else{
				result = a / (c-b) + 1; // c-b�� ��Ʈ�� �ϳ� ������ ������
			};
		
		System.out.println(result);
	}
}
