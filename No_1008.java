package baekjoon_01;

import java.util.Scanner;

public class No_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Q. 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		
// 입 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 출 : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
		
		System.out.println("두 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		System.out.println("입력한 두 수를 나눈 값은" + a/b + "입니다.");
		
		
	
	}

}
