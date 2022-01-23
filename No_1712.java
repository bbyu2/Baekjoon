package baekjoon_01;

import java.util.Scanner;

public class No_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int  a = scan.nextInt(); // 1년간 고정비용
		int  b = scan.nextInt(); // 노트북 1대 생산비용
		int  c = scan.nextInt(); // 노트북 가격
		int result;
		
			if (b>=c) {
				result = -1;
			} else{
				result = a / (c-b) + 1; // c-b는 노트북 하내 생산의 순이익
			};
		
		System.out.println(result);
	}
}
