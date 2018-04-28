package homework;

import java.awt.Checkbox;
import java.io.ObjectOutputStream.PutField;
import java.nio.charset.MalformedInputException;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.BlockingDeque;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/** *Created By lushichen on 2018年2月28日 上午11:20:12
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
public class huffuman_tree_1_1 {
	static int n,count=0;
	static int map[][];
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		map=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		put(0,2);
		System.out.println(count);
	}
	public static void put(int t,int s) {
		if(t==n) 
		{
			if(s==2)
			{
				put(0, 3);
			}
			else
			{
				count++;
			}
			return ;
		}
		for(int i=0;i<n;i++) {
			if(map[t][i]!=1)
			{
				continue;
			}
			if(Check(t,i,s)) 
			{
				map[i][s]=s;
			}
			else
			{
				continue;
			}
			put(t+1, s);
			map[t][i]=1;
		}
		return;
		
	}
	public static boolean Check(int t,int i,int s) {
		for(int q=t-1;q>=0;q--) {
			if(map[q][i]==s)
			{
				return false;
			}
		}
		for(int q=t-1,w=i-1;q>=0&&w>=0;q--,w--) {
			if(map[q][w]==s)
			{
				return false;
			}
		}
		for(int q=t-1,w=i+1;q>=0&&w<=n-1;q--,w++) {
			if(map[q][w]==s)
			{
				return false;
			}
		}
		return true;
	}
}
