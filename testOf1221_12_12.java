package homework;

public class testOf1221_12_12 {
	public static void main(String args[]) {
		for(int i=1000;i<=9999;i++) {
			if((i/1000)==(i%10)&&(((i/100)-10*(i/1000))==((i/10)-10*(i/100)))){
				System.out.println(i);
			}
		}
	}

}
