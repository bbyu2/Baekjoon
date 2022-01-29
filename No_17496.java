package baekjoon_01;

import java.util.Scanner;

public class No_17496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //여름이 지속되는 날짜
		int t = scan.nextInt(); //씨앗 심은 후 자라는 날짜
		int c = scan.nextInt(); //씨앗을 심을 수 있는 C개
		int p = scan.nextInt(); //스타후르츠 판매가격		
		
		
		System.out.println((n-1)/t*c*p); // 여름 1일부터 시작
		
		
	
	}

}
