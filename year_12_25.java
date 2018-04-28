package homework;

import java.util.Scanner;

public class year_12_25 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入要判断的年份：");
		int n =sc.nextInt();
		if(n%4==0 && n%100!=0) {
			System.out.println("yes");
		}else if(n%400==0){
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
