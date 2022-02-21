package baekjoon_01;

import java.util.Scanner;

public class No_22864 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int m = scan.nextInt();
		int w = 0;
		int p = 0;
		
		for (int i = 0; i < 24; i++) {
			if( p + a > m ){
				p = p - c;
				p = Math.max(0, p);
			}else {
				p = p + a;
				w = w + b;
			}
		}
		System.out.println(w);
		
	}
}
