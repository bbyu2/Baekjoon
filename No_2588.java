package baekjoon_01;
import java.util.*;

public class No_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
  
        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
  
	}

}
