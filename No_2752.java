package baekjoon_01;

import java.util.Scanner;

public class No_2752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	if(a > b && a > c){
		if(b > c){
			System.out.println(c + " " + b + " " + a);
		}else{
			System.out.println(b + " " + c + " " + a);
		}
	} 
	else if(b > a && b > c){
		if(a > c){
			System.out.println(c + " " + a + " " + b);
		}else{
			System.out.println(a + " " + c + " " + b);
		}
	}else {
		if(a > b) {
			System.out.println(b + " " + a + " " + c);
		}else {
			System.out.println(a + " " + b + " " + c);
		}
	}
	scan.close();
}
}
