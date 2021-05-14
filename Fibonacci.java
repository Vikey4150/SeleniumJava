package week1.day1.homework;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=8;
		System.out.println(a);
		System.out.println(b);
		
		int d=0;
		
		for (int j=1; j <=c; j++) {
			
			d=a+b;
			System.out.println(d);
			a=b;
			b=d;
			
		}		

	}

}
