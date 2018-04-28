package homework;

import java.util.Scanner;

public class Fibonacci_12_4 {
	public static void main(String[] args) {  
        Scanner cin = new Scanner(System.in);  
        int a = 1, b = 1, ans = 1;
        		int c=cin.nextInt(); 
        for (int i = 1; i <=  c- 2; i++) {  
            ans = (a + b) % 10007;  
            a = b;  
            b = ans;  
        }  
        System.out.println(ans);  
    }
}
