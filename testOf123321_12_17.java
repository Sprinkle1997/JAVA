package homework;

import java.util.Scanner;

public class testOf123321_12_17 {  
	  
    public static void main(String[] args) {  
    	 Scanner sc = new Scanner(System.in);  
         System.out.println("请输入一个整数：");  
         int n = sc.nextInt();  
  
    	for(int i=10000;i<=999999;i++) {
        String str1 = i + "";  
        // String str1 = Integer.toString(num);  
        // String str1 = String.valueOf(num);  
        StringBuilder str2 = new StringBuilder(str1);  
        str2.reverse();  
        int count = 0;  
        for (int j = 0; j< str1.length(); j++) {  
            if (str1.charAt(j) != str2.charAt(j)) {  
                break;  
            } else {  
                count++;  
            }  
        }  
        if (count == str1.length()) {  
        		int t=i,sum=0;
//        		System.out.println(t);
        		while(t!=0) {
        			sum+=t%10;
        			t/=10;
        		}
        		if(sum==n) {
        			System.out.println(i);
        		}
        }  
    }  
    }
  
}  