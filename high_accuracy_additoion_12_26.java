package homework;

import java.util.Scanner;

/** *Created By lushichen on 2018年1月29日 下午10:07:47
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
public class high_accuracy_additoion_12_26 {
	
		public static void main(String[] args) 
	    {
	        Scanner cin=new Scanner(System.in);
	        int[] a=new int[101];
	        int[] b=new int[101];
	        int[] result=new int[101];
	        for (int i = 0; i <101; i++) 
	        {
	            a[i]=b[i]=result[i]=0;
	        }
	        String line1=cin.nextLine();
	        String line2=cin.nextLine();

	        for (int i = 0; i < line1.length(); i++) 
	            a[i]=(int)line1.charAt(line1.length()-1-i)-48;  
	        for (int i = 0; i < line2.length(); i++) 
	            b[i]=(int)line2.charAt(line2.length()-1-i)-48;

//	        int max=line1.length()>line2.length()?line1.length():line2.length();

//	        int jinwei=0;
	        int r=0;
	        for (int i = 0; i < 101; i++)
	        {
	            result[i]=a[i]+b[i]+r;
	            r=result[i]/10;
	            result[i]%=10;
	        }
	        int flag=100;
	        for (int i = 100; i>-1; i--) {
	            if (result[i]!=0) {
	                flag=i;
	                break;
	            }
	        }
	        for (int i = flag; i >-1; i--) {
	            System.out.print(result[i]);
	        }System.out.println();

	    }
	
}
