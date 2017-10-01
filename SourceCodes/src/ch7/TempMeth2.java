//Modify your solution by creating another static method that formats the output. Your new method should return a String. Call your method from within System.out.println().

package ch7;

public class TempMeth2 {

	public static void main(String[] args) {
		float c = 100;
		float f = toFahr(c);
		System.out.println(printConv(c, f));

		f = 32;
		c = toCelc(32);
		System.out.println(printConv(c, f));
		
		f = 0;
		c = toCelc(f);
		System.out.println(printConv(c, f));

		c = 0;
		f = toFahr(c);
		System.out.println(printConv(c, f));


	}

	public static float toCelc(float fahr)
	{
		float celc = (float)((fahr - 32) * 5 / 9);
		return celc;
	}
	public static float toFahr(float celc)
	{
		float fahr = (float)  (celc * 1.8 + 32);
		return fahr;
	}
	public static String printConv (float celc , float fahr)
	{
		return (celc + " degress Celcius equals " + fahr + " degrees Fahrenheit");
	}
}
