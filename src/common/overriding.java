package common;

class parent{
	void eat()
	{
		System.out.println("eat strawberry");
	}
	class child extends parent
	{
		void eat()
		{
			System.out.println("eat chocklet");
		}
	}
}

public class overriding {

	public static void main(String[] args) {
		overriding obj = new overriding();
		obj.eat();

	}

}


