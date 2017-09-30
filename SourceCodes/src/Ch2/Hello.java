package Ch2;

public class Hello {

	public static void main(String[] args)
	{
		System.out.print("Hello, ");
		if (args.length==0)
			System.out.println("World!");
		else
		{
			for (int i = 0 ; i < args.length ; i++ )
			System.out.print(args[i] + " ");
		}
	}
}
