package week1.day2.activities;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int input = 123;
		
		int sum=0;
		
		while (input > 0) {
			
			
		int a = input % 10;
		
		sum = sum + a;
		
		input = input / 10;
		
			
		}
		
		System.out.println(sum);
		

	}

}
