package baekjoon_01;

import java.util.Scanner;

public class No_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Q. �� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
// �� : ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
// �� : ù° �ٿ� A/B�� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-9 �����̸� �����̴�.
		
		System.out.println("�� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		System.out.println("�Է��� �� ���� ���� ����" + a/b + "�Դϴ�.");
		
		
	
	}

}
