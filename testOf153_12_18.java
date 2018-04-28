package homework;

public class testOf153_12_18 {
	public static void main(String []args) {
		for(int i=100;i<999;i++) {
			int temp;
			temp=(int)Math.pow(i/100, 3)+(int)Math.pow((int)(i%100)/10, 3)+(int)Math.pow(i%10, 3);
			if(temp==i) {
				System.out.println(i);
			}
		}
	}

}
