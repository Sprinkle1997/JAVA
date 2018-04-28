package homework;

import java.util.Scanner;

public class grapheme_graph_12_28 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//输入n，m，n为输出行数，m为字母串长度
		int n=sc.nextInt();int m=sc.nextInt();
		//定义一个长度为52的字符数组
		char []a=new char[51];
		//输入数组
		for(int i=0;i<26;i++) {
			a[i]=(char)(i+65);
			a[50-i]=(char)(i+65);
		}
		//每次循环完调整数组
		for(int j=0;j<n;j++) {
			for(int k=0;k<m;k++) {
				System.out.print(a[k]);
			}
			System.out.println();
			for(int l=49;l>=0;l--) {
				a[l+1]=a[l];
			}
			a[0]=a[50];
		}
	}
}
