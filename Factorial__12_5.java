package homework;

import java.util.Scanner;

public class Factorial__12_5 {
	public static void main(String[] args) {
		 System.out.print("请输入一个数字：");
		 Scanner cin = new Scanner(System.in);
		 int c=cin.nextInt();
		 while(c<0 || c>1000) {
			 System.out.println("输入错误，请输入0-1000的数");
			 System.out.print("请输入一个数字：");
			 c=cin.nextInt();
		 }
		 int num[]=new int[10000];
		 num[0]=1;
		 int S=1;
		 for(int i=2;i<=c;i++) {
			 int jw=0;
			 for(int j=0;j<num.length-1;j++) {
				 int temp=num[j]*i+jw;
				 num[j]=temp%10;
				 jw=temp/10;
			 }
		 }
		 boolean begin = false;
			for(int i = num.length-1;i >=0;i--) {
				if(begin) {
					System.out.print(num[i]);
					continue;
				}
				if(num[i-1]!=0){
					begin=true;
				}
				
			}
		}
}
