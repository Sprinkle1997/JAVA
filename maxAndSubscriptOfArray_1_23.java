package homework;

import java.util.Scanner;

/** *Created By lushichen on 2018年3月27日 上午11:37:59
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
public class maxAndSubscriptOfArray_1_23 {
	public static void main(String []args) {
		int max,subscript;
		Scanner scanner=new Scanner(System.in);
		int n=(new Scanner(System.in)).nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{	
			num[i]=scanner.nextInt();
		}
		max=num[0];
		subscript=0;
		//求得最大值和下标
		for(int i=0;i<n;i++)
		{
			if(max<num[i])
			{
				subscript=i;
				max=num[i];
			}
		}
		System.out.println("max:"+max+";      subscript:"+subscript);
	}
}
