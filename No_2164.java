package baekjoon_01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	//  LinkedList<Integer> q = new LinkedList<>();
	Queue<Integer> q = new LinkedList<>();
	
	int n = sc.nextInt();
	
	// 1. 맨 앞의 수 삭제(poll)
	// 2. 그 다음에 있는 앞의 수를 삭제(poll) 
	// 3. 삭제한 수를 맨 뒤에 삽입(offer)
	
	while(q.size() > 1) {
		q.poll();
		q.offer(q.poll());
	}
	
	System.out.println(q.poll());
	
	}
}
