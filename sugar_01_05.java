package homework;
/** *Created By lushichen on 2018年3月19日 上午9:47:47
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

import java.util.Scanner;


public class sugar_01_05 {
	public static void main(String []args) {
	int n,min=1000,max=2,count=0;
	Scanner scanner=new Scanner(System.in);
	n=scanner.nextInt();
	int []a=new int [n];
	for(int i=0;i<n;i++) {
		a[i]=scanner.nextInt(); 
	}
	while(min!=max) {		//判断是否全部相等
		 min=1000;
		 max=2;
		for(int j=0;j<n;j++) {		//确定最大最小值
			if(min>a[j]) {
				min=a[j];
			}
			if(max<a[j]) {
				max=a[j];
			}
		}
//		System.out.println("min="+min);
//		System.out.println("max="+max);

//		for(int i=0;i<n;i++) {
//			if(a[i]!=a[0]) {
//				break;
//			}
//		}
		int m=a[n-1]/2;					//将糖果给左边的人
		for(int i=n-1;i>=0;i--) {
			if(i==0) {
				a[i]=a[i]/2+m;
			}
			else {
				a[i]=a[i]/2+a[i-1]/2;
			}
		}
		for(int i=0;i<n;i++) {			//判断手上糖果是否为偶数，否  则+1
			if(a[i]%2!=0)
			{
				a[i]=a[i]+1;
				count++;
			}
			else {}
		}
//	
//		for(int l=0;l<n;l++) {
//			System.out.print(a[l]+"   ");
//		}
//		System.out.println();
//		if(max==min)
//		{
//			break;
//		}
//		else
//		{
//			continue;
//		}
		}
	System.out.println("count="+count);
	}
	

}
