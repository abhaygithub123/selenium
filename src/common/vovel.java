package common;

import java.util.Scanner;

public class vovel {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any character");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vovel");
		}
		else
		{
			System.out.println("Not vovel");
		}

	}

}
