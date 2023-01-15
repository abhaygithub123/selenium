package common;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Reverse Array Element are");
		for(int i =a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
