package week1.day1.homework;

public class Prime {

	public static void main(String[] args) {
		
		int i=17;
		
		int c=0;
		
		for (int j=1; j<=i; j++){
			
			if(i % j ==0) {
				
				c=c+1;
			}
			
		}
		
		if(c == 2) {
		
			System.out.println("The given number is prime number");
		}
		
		else {
			System.out.println("The given number is not a prime number");
		}
	}

}
