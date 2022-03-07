package baekjoon_01;
import java.util.Scanner;

public class No_1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���ڿ��� �Է� ����
		String str = sc.nextLine();
		
		//9�� 6���� ��ü
		str = str.replace('9', '6');
		
		//0~8���� 9���� int�迭�� ����
		int[] intArr = new int[9];
		
		//�ִ� ������ ������ int�� ���� ���� �� �ʱ�ȭ
		int max = 0;
		
		//���ڿ� �ش��ϴ� �迭 �ε����� ���� ++��
		for(int i = 0; i < str.length() ; i++) {
			int num = (int)(str.charAt(i)-48);
			intArr[num]++;
		}
		
		//6�� ��� 9�� �����ϹǷ� 2�� ������, �ݿø��� �Ͽ� �ε��� 6�� ���� �ٲ�
		if(intArr[6]!=0)
			intArr[6]=Math.round(intArr[6]/2.0f);
		
		//int�迭�� Ž���ϸ鼭 �ִ밪�� ����
		for(int i = 0; i < intArr.length; i++) {
			max = Math.max(intArr[i], max);
		}

		//�ִ��� ���
		System.out.println(max);
	}
}