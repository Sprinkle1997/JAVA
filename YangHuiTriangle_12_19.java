package homework;

import java.util.Scanner;

public class YangHuiTriangle_12_19 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入整数n：");
		int n = s.nextInt();
		
		int[][] num = new int[n][];
		for(int i = 0; i < n; i++){
			num[i] = new int[i + 1];
		}
		
		for(int i = 0; i < n; i++){
			num[i][0] = 1;
			num[i][i] = 1;
		}
		
		for(int i = 2; i < n; i++){
			for(int j = 1; j < i; j++){
				num[i][j] = num[i - 1][j] + num[i - 1][j - 1];
			}
		}
		
		for(int i = 0; i < num.length; i++){
			for(int j = 0; j < num[i].length; j++){
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
