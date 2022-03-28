package baekjoon_01;

import java.util.Scanner;

public class No_1543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String txt = scan.nextLine();
		String fd = scan.nextLine();
		
		int cnt = 0;
		
		txt = txt.replace(fd, "1");
		
		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(i) == '1') {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}
