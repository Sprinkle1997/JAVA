package homework;

import java.util.Scanner;

public class DtoH_12_21 {
	 public static String IntToHex(int n){  
	        char[] ch = new char[20];  
	        int nIndex = 0;  
	        while ( true ){  
	            int m = n/16;  
	            int k = n%16;  
	            if ( k == 15 )  
	                ch[nIndex] = 'F';  
	            else if ( k == 14 )  
	                ch[nIndex] = 'E';  
	            else if ( k == 13 )  
	                ch[nIndex] = 'D';  
	            else if ( k == 12 )  
	                ch[nIndex] = 'C';  
	            else if ( k == 11 )  
	                ch[nIndex] = 'B';  
	            else if ( k == 10 )  
	                ch[nIndex] = 'A';  
	            else   
	                ch[nIndex] = (char)('0' + k);  
	            nIndex++;  
	            if ( m == 0 )  
	                break;  
	            n = m;  
	        }  
	        StringBuffer sb = new StringBuffer();  
	        sb.append(ch, 0, nIndex);  
	        sb.reverse();  
	        String strHex = new String("");  
	        strHex += sb.toString();  
	        return strHex;  
	    }  
	public static void main(String []args) {
		System.out.print("请输入要转换成16进制的10进制数：");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(IntToHex(n));
	}

}
