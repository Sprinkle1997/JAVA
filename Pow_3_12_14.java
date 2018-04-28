package homework;

public class Pow_3_12_14 {
	public static void main(String args[]) {
		int count=0;
		for(int i=1;i<10000;i++) {
			int num=(int)Math.pow(i, 3);
			int temp=0;
			while(num!=0) {
				temp+=num%10;
				num/=10;
			}
		if(temp==i) {
			System.out.println(i);
			count++;
			}
		}
		System.out.println("这样的数共有："+count+"个");
	}
}
