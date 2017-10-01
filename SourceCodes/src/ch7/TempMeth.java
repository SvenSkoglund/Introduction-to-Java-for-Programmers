//Write a program with a class that has a main() and two other methods. One of the methods should
//accept a temperature in Fahrenheit as a float and return the corresponding temperature in Celsius, also as a float. The other method should accept a Celsius temperature and return a Fahrenheit. Give your methods and their parameters appropriate names. Declare them as static so that you can test them directly from main(). In main(), use the methods to convert several temperatures, printing out the results.

package ch7;

public class TempMeth {

	public static void main(String[] args) {
		
		System.out.println(toCelc(212));
		System.out.println(toFahr(0));	
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
}
