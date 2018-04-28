package homework;

import java.util.Arrays;
import java.util.Scanner;

/** *Created By lushichen on 2018年3月27日 上午9:25:27
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
public class min_ProductOfArray_1_18 {
	public static void main(String []args) {
		int n,sumOfProduct=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int l=n-1;
		//定义数组
		int num_one[]=new int[n];
		int num_two[]=new int[n];
		//输入数组
		for(int i=0;i<n;i++)
		{
			num_one[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			num_two[i]=sc.nextInt();
		}
		//数组排序
		Arrays.sort(num_one);
		Arrays.sort(num_two);
		//对应下标乘积和
		for(int i=0;i<n;i++)
		{
			sumOfProduct+=num_one[i]*num_two[l];
			l--;
		}
		System.out.println(sumOfProduct);
	}
}
