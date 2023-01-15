package common;

public class swapingwords {

	public static void main(String[] args) {
		
		String s1 = "Abhay Bhatnate";
		String s2 = " ";
		String a[]=s1.split(" ");
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("  ");
		for(int i=a.length-1;i>=0;i--)
		{
			s2 = s2+a[i]+" ";
		}
		System.out.println(s2);

	}

}
