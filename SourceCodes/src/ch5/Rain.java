//Write a program that stores numeric values for the total daily rainfall for one week (this will take 7
//variables). Print the daily rainfall amounts and calculate and print the total rainfall for the week, as
//well as the average rainfall for the week

package ch5;

public class Rain {
	public static void main(String[] args) {
		float monday = 12;
		float tuesday = 0;
		float wednesday = 5;
		float thursday = 23;
		float friday = 0;
		float saturday = 12;
		float sunday = 10;

		System.out.println("Monday: " + monday);

		System.out.println("Tuesday: " + tuesday);

		System.out.println("Wednesday: " + wednesday);

		System.out.println("Thursday: " + thursday);

		System.out.println("Friday: " + friday);

		System.out.println("Saturday: " + saturday);

		System.out.println("Sunday: " + sunday);
		
		System.out.println("Total: " + monday+tuesday+wednesday+thursday+friday+saturday+sunday);
		System.out.println("Average: " + ((monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7));
	}

}
