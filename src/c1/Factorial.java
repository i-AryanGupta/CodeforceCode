package c1;

public class Factorial {

	public static void main(String[] args) {
		
		int n =4;
		System.out.println("Hello");
		int fact =1;
		
		for(int i =1; i<=n; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorail of number "+n +" is "+fact);
	}
}
