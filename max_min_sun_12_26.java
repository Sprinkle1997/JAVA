package homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class max_min_sun_12_26 {
	public static void main(String []args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入要输入的数的个数：");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("请输入"+n+"个数：");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int l=0;l<a.length;l++) {
			sum=sum+a[l];
		}
		Arrays.sort(a);
		System.out.println("max:"+a[n-1]);
		System.out.println("min:"+a[0]);
		System.out.println("sum:"+sum);
	}

}
