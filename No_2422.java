package baekjoon_01;

import java.util.Scanner;

public class No_2422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for(int j = 0; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		scan.close();	
	}
}
