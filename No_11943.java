package baekjoon_01;

import java.util.Scanner;

public class No_11943 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt(); //���  a
	int b = scan.nextInt(); //������ b
	int c = scan.nextInt(); //��� c
	int d = scan.nextInt(); //������ d
	
	int min = Math.min(a+d, b+c); //java.lang.Mathg�Լ��� �Ҽ�, �� ���� �������� �������� ����
	System.out.println(min);
	
	
	
	
	
		
		
		
	}

}
