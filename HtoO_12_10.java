package homework;

import java.util.Scanner;

public class HtoO_12_10 {
	public static void main(String []args) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入你要转换的16进制数的个数（1-10之间）：");
		int m=in.nextInt();
//		System.out.println(Integer.toHexString(100000000));
		String n=in.nextLine();
		String arr[]=new String[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=in.next();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"的八进制数为：");
			//使用integer方法嵌套
			System.out.println(Integer.toOctalString(( Integer.parseInt(arr[i],16))));
		}
		
	}

}
