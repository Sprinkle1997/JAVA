package homework;

import java.math.BigInteger;
import java.util.Scanner;

import javax.sql.rowset.FilteredRowSet;

/** *Created By lushichen on 2018年3月27日 上午10:47:13
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
public class sumToN_1_21 {
	public static void main(String []args) {
		//大数类等差数列求和做法
		BigInteger n=(new Scanner(System.in)).nextBigInteger();
		BigInteger sumOfN=(n.add(BigInteger.valueOf(1))).multiply(n).divide(BigInteger.valueOf(2));
		//for循环做法
//		BigInteger sum=BigInteger.valueOf(0);
//		int m=(new Scanner(System.in)).nextInt();
//		System.out.println(n);
//		for(int i=1;i<=m;i++)
//		{
//			sum=sum.add(BigInteger.valueOf(i));
//		}
//		System.out.println(sum);
		System.out.println(sumOfN);
	}

}
