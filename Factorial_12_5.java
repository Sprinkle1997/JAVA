package homework;
import java.util.Scanner;

public class Factorial_12_5 {
	public static void main(String[] args) {
	 	 	 System.out.print("请输入一个数字：");
			 Scanner cin = new Scanner(System.in);
			 int c=cin.nextInt();
			 while(c<0 || c>1000) {
				 System.out.println("输入错误，请输入0-1000的数");
				 System.out.print("请输入一个数字：");
				 c=cin.nextInt();
			 }
			 int B=0;
			 int D=c;
			 int count=0;
			 long F=1;
			 if(D==0){
				 count=1;
			 }else {
				 while(D!=0) {
					 count++;
					 D=D/10;
			 		}
			 }
			 System.out.println("该数字有"+count+"位数");
			 int A[]=new int[count];
			 for(int i=0;i<count;i++) {
			 A[i]=((int) ((c%(Math.pow(10, i+1)))/(Math.pow(10, i))));
			 }
			 System.out.print("该数组为：");
			 for(int i=0;i<count;i++) {
				 System.out.print(A[i]+"  ");
			 }
			 System.out.println();
			 for(int i=0;i<count;i++) {
				 B+=(int)A[i]*(Math.pow(10, i));
			 }
			 if(B==0) {
				 F=0;
			 }else {
				 while(B>0) {
					 F=F*B;
					 B--;
				 }
			 }
			System.out.println(c+"的阶乘为："+F);
	}
}
	
