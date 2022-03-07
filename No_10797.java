package baekjoon_01;
import java.util.Scanner;

public class No_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int carNum = sc.nextInt();
        
        int count = 0;
        
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (carNum == n) count++;
        }
        
        sc.close();
        
        System.out.println(count);
    }
}
