//Write a program that creates two variables to hold the temperature in Fahrenheit and in Celsius.
//Initialize the Fahrenheit variable with 212 degrees

package ch5;

public class Farenheit {

	public static void main(String[] args) {

		float far = 212 ;
		float cel;
		
		cel = (far - 32) * 5 / 9;
		
		System.out.println(cel);
	}

}
