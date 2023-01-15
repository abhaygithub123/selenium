package common;

import java.sql.Array;

public class sortingletter {

	public static void main(String[] args) {
		
		String[]input = {"geeks for geeks","abhay","pritam","rohan"};
		for(int i=0;i<input.length;i++)
		{
			Array.sort(input);
			for(int i=0;i<input.length;i++)
			{
				System.out.println(input[i]);
			}
		}

	}

}
