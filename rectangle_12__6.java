package homework;


import java.math.BigDecimal;  
import java.math.BigInteger;  
import java.math.MathContext;  
import java.math.RoundingMode;  
import java.util.Scanner;  
  
public class rectangle_12__6 {  
      
      
    public static void main(String[] args) {  
        //想看那个方法就直接调用哪个  
        FangFaOne();  
    }  
      
      
    public static void  FangFaOne(){  
        Scanner in = new Scanner(System.in);  
        while(in.hasNext()){  
            int x = in.nextInt();  
            int y = in.nextInt();  
            //用boolean二维数组储存矩阵,从[1][1]开始  
            boolean[][] grap = new boolean[x+1][y+1];  
            for(int i=1;i <= x;i++){  
                for(int j=1;j<=y;j++){  
                    //全部的置为正面  
                    grap[i][j]=true;  
                }  
            }  
            int num=1;  
            //有几枚硬币就循环几次  
            while(num<=x*y){  
                //取x_num,表示在第几行,y_num表示第几列  
                int x_num = num/y+1;  
                int y_num = num%y;  
                //在行末的时候需要格外处理,例如num=3,表示第三枚硬币在1行3列  
                if(num%y == 0)  
                {  
                    x_num =num/y;  
                    y_num = y;  
                }  
                  
                //Q操作  
                for(int i = 1;i * x_num <= x;i++){  
                    for(int j= 1;j *y_num <= y;j++){  
                        grap[i * x_num][j *y_num]=!grap[i * x_num][j *y_num];  
                    }  
                }  
                //处理下一枚硬币  
                num+=1;  
            }  
  
            //统计false(反面)的数量  
            int sum = 0;  
            for(int i=1;i <= x;i++){  
                for(int j=1;j<=y;j++){  
                    if(!grap[i][j]){  
                        sum+=1;  
                    }  
                }  
            }  
            System.out.println(sum);  
        }  
    }  
      
      
    
}  


