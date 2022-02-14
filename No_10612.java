package baekjoon_01;

import java.util.Scanner;

public class No_10612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();

		if(t >= 300){
			a = t/300;
			t = t - a*300;
		}
		
		if(t >= 60) {
			b = t/60;
			t = t - b*60;
		}
		
		if(t%10 != 0) {
			System.out.println(-1);
			System.exit(0);
		} else {
			c = t/10;
		}
		
		System.out.println(a + " " + b + " " + c);
		scan.close();
	}

}
