package c1;

import java.util.Scanner;

public class WayTooLong {

	public static void main(String[] args) {
	
		System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String[] str = new String[n];
	
	for(int i = 0; i<n; i++)
	{
		System.out.print("Enter the String");
		str[i] = sc.nextLine();
	}
	
	longString(str, n);

	}
	
	public static void longString(String[] str, int n)
	{
		for(int i =0; i<n; i++)
		{
			if(str.length<11)
				System.out.println(str[i]);
			else
			{
				String s = str[i];
				int c =s.length();
				
				System.out.print(s.charAt(0)+""+(c-2)+""+s.charAt(c-1));
			}
		}
	}

}
