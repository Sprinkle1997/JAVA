package homework;

import java.util.Scanner;

public class sort_12_8 {
	public static void main(String [] args) {
		System.out.print("请输入数组的长度：");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a<1||a>200) {
			System.out.print("输入错误，应输入1-200之间的数，请重新输入：");
			a=in.nextInt();
		}
		int []arr=new int[a];
		int temp=-1;
		System.out.print("请输入"+arr.length+"个数字：");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
		}
		System.out.print("排序后为：");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+"   ");
		}
		
		
		
	}
}
