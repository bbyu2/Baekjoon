package baekjoon_01;

import java.util.Scanner;

public class No_11943 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt(); //사과  a
	int b = scan.nextInt(); //오렌지 b
	int c = scan.nextInt(); //사과 c
	int d = scan.nextInt(); //오렌지 d
	
	int min = Math.min(a+d, b+c); //java.lang.Mathg함수에 소속, 두 개의 데이터중 작은값을 리턴
	System.out.println(min);
	
	
	
	
	
		
		
		
	}

}
