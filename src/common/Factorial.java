package common;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int n,Fact=1;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Fact=Fact*i;
		}
		System.out.println(Fact);

	}

}
