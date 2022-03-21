package baekjoon_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No_9237 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] tree = new Integer[N];
		int sum = 1;
		
		for (int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
		}
		sc.close();
		
		// Collections.reverseOrder() sort내림차순
		Arrays.sort(tree,Collections.reverseOrder()); 
		
		for (int i = 0; i < N; i++) {
			if (sum < i + tree[i]) {
				sum += (i+tree[i])-sum;
			}
		}
		System.out.println(sum+2);
	}

}
