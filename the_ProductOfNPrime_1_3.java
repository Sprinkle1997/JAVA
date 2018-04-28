package homework;

import java.math.BigInteger;
import java.util.Scanner;

/** *Created By lushichen on 2018年3月11日 下午7:41:00
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
public class the_ProductOfNPrime_1_3 {
	public static void main(String []args) {
//		BigInteger product=BigInteger.valueOf(0);
		long product=1;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入素数的个数：");
		n=scanner.nextInt();
		for(int i=0,l=2;i<n;l++){
			if(isprime(l)==true)
			{
				product*=l;
				product%=50000;
				i++;
			}
		}
		System.out.println(product);
	}
	public static boolean isprime(int k) {
		if(k==2)
		{
			return true;
		}
		for(int i=2;i<Math.sqrt(k)+1;i++) {
			if(k%i==0) 
			{
				return false;
			}
		}
		return true;
	}

}
