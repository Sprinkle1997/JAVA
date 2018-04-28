package homework;

import java.util.Scanner;

public class testOf_12_20 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入数组的长度");
		int n=sc.nextInt();
		int [] num=new int[n];
		System.out.print("请输入数组，每个数不得大于10000:");
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.print("请输入要查找的数：");
		int m=sc.nextInt();
		for(int i=0;i<num.length;i++) {
			if(m==num[i]) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
