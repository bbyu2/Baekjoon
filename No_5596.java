package baekjoon_01;

import java.util.Scanner;

public class No_5596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0; 
		int t; //입력받을 데이터
		
		for (int i = 0; i < 4; i++) {
			t = scan.nextInt();
			a = a+t; //민국이 점수 합산
		}
		for (int i = 0; i < 4; i++) {
			t = scan.nextInt();
			b = b+t; //만세 점수 합산
		}
		// math.max()함수는 입력값으로 받은 0개이상의 숫자 중 가장 큰 숫자를 반환한다.
		System.out.println(Math.max(a, b)); 
		
		
		
		
	}

}
