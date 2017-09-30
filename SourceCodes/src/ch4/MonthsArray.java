//Write a program that creates an array of 12 Strings. Populate each member of the array with the
//name of a month. Print out the name of the month in which you were born.

package ch4;

public class MonthsArray {

	public static void main(String[] args) {

		String[] months = new String[12];
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";

		System.out.println("I was born in: " + months[2]);
	}

}
