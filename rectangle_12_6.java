package homework;

import java.math.BigDecimal;  
import java.math.BigInteger;  
import java.math.MathContext;  
import java.math.RoundingMode;  
import java.util.Scanner;  
  
public class rectangle_12_6 {  
      
      
    public static void main(String[] args) {  
        //想看那个方法就直接调用哪个  
        FangFaOne();  
        //FangFaTwo();  
    }  
      
      
    //方法一:拼命算,最笨的方法,但是当数据过大时会,没法储存  
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
      
      
      
    //方法二:将1的规律总结,用大数处理  
//    public static void  FangFaTwo() {  
//        Scanner in = new Scanner(System.in);  
//        while(in.hasNext()){  
//            //因为开方涉及小数,所以采用BigDecimal,BIG小数  
//            BigDecimal x = in.nextBigDecimal();  
//            BigDecimal y = in.nextBigDecimal();  
//            BigDecimal dealX = deal(x);  
//            BigDecimal dealY = deal(y);  
//            //大数乘操作  
//            System.out.println(dealX.multiply(dealY));  
//        }  
//    }  
//      
//    public static BigDecimal deal(BigDecimal x){  
//        //+1操作  
//        x = x.add(BigDecimal.valueOf(1));  
//        //开方操作,太大需要重新定义大数的格式  
//        MathContext mc = new MathContext(1000,RoundingMode.HALF_DOWN);  
//        x = new BigDecimal(Math.sqrt(x.doubleValue()),mc);  
//        //-1操作  
//        x = x.add(BigDecimal.valueOf(-1));  
//        //进一法取整,0表示小数有零位,  
//        //BigDecimal.ROUND_UP表示取整类型,是进一法(向上进)  
//        //BigDecimal.ROUND_DOWN表示取整类型,是去一法(向下进)  
//        x = x.setScale(0, BigDecimal.ROUND_UP);  
//        return x;  
//    }  
}  

