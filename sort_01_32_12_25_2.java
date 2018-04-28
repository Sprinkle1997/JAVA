package homework;

public class sort_01_32_12_25_2 {
	public static void main(String []args) {
		int []a=new int[5];
		for(int i=0;i<32;i++) {
			int n=i,j=0;
			while(n!=0) {
				a[j]=n%2;
				j++;
				n/=2;
			}
			for(int l=4;l>=0;l--) {
				System.out.print(a[l]);
			}
			System.out.println();
		}
	}	 

}
