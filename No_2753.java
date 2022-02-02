package baekjoon_01;

import java.util.Scanner;

public class No_2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		
		if((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
			System.out.println(1);	
		}else {
			System.out.println(0);
		}
		
		
		
		
		

	}

}
