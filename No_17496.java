package baekjoon_01;

import java.util.Scanner;

public class No_17496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //������ ���ӵǴ� ��¥
		int t = scan.nextInt(); //���� ���� �� �ڶ�� ��¥
		int c = scan.nextInt(); //������ ���� �� �ִ� C��
		int p = scan.nextInt(); //��Ÿ�ĸ��� �ǸŰ���		
		
		
		System.out.println((n-1)/t*c*p); // ���� 1�Ϻ��� ����
		
		
	
	}

}
