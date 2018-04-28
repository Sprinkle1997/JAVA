package homework;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[999];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		a[0] = 1;
		for(int i = 2;i <= n;i++) {
			int jw = 0;
			for(int j = 0;j < a.length;j++) {
				int temp = a[j]*i+jw;
				a[j] = temp % 10;
				jw = temp / 10;
			}
		}
		boolean begin = false;
		for(int i = a.length;i >= 0;i--) {
			if(begin) {
				System.out.print(a[i]);
				continue; 
			}
			if(a[i-1] != 0) {
				begin = true;
			}
		}
	}
}