package homework;

import java.util.Scanner;

/** *Created By lushichen on 2018年3月31日 下午5:50:45
	*E-mail:lu_shi_chen@163.com 
	*Copyright 2018 lushichen
	*All right reserved.

 *                #####################################################  
 *                #                                                   #  
 *                #                       _oo0oo_                     #  
 *                #                      o8888888o                    #  
 *                #                      88" . "88                    #  
 *                #                      (| -_- |)                    #  
 *                #                      0\  =  /0                    #  
 *                #                    ___/`---'\___                  #  
 *                #                  .' \\|     |# '.                 #  
 *                #                 / \\|||  :  |||# \                #  
 *                #                / _||||| -:- |||||- \              #  
 *                #               |   | \\\  -  #/ |   |              #  
 *                #               | \_|  ''\---/''  |_/ |             #  
 *                #               \  .-\__  '-'  ___/-. /             #  
 *                #             ___'. .'  /--.--\  `. .'___           #  
 *                #          ."" '<  `.___\_<|>_/___.' >' "".         #  
 *                #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #  
 *                #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #  
 *                #     =====`-.____`.___ \_____/___.-`___.-'=====    #  
 *                #                       `=---='                     #  
 *                #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #  
 *                #                                                   #  
 *                #               佛祖保佑         永无BUG              #  
 *                #                                                   #  
 *                #####################################################  
 */
/**
 * @author lushichen
 *
 */
public class huiXingQuShu_01_24 {
	static String string="";
	static int arr[][],m,n;
	static boolean bool[][];
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		m=scanner.nextInt();
		n=scanner.nextInt();
		arr=new int[m][n];
		bool=new boolean[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=scanner.nextInt();
			}
		}
		judge(0,0,0);
	}
	public static boolean Check(int s,int d)
	{
		if(s>=m||d>=n||s<0||d<0)
		{
			return false;
		}
		if(bool[s][d]==false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void judge(int a,int b,int c)
	{
		while(true)
		{
			while(Check(b, c))		//口 左向下
			{
				string=string+arr[b][c]+"  ";
				bool[b][c]=true;
				b++;
				a++;
			}
			if(b==m)
			{
				b--;
			}
			c++;
			while(Check(b, c))		//口 下向右
			{
				string=string+arr[b][c]+"  ";
				bool[b][c]=true;
				c++;
				a++;
			}
			if(c==n)
			{
				c--;
			}
			b--;
			while(Check(b, c))		//口 右向上
			{
				string=string+arr[b][c]+"  ";
				bool[b][c]=true;
				b--;
				a++;
			}
			if(b==-1)
			{
				b=0;
			}
			c--;
			while(Check(b, c))		//口 上向左
			{
				string=string+arr[b][c]+"  ";
				bool[b][c]=true;
				c--;
				a++;
			}
			b++;c++;
			if(a==m*n)
				break;
		}
		System.out.println(string);
	}

}
