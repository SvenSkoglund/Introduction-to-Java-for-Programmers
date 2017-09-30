//Write a program that has two integer variables — say, i and j. Write the program to round off i to
//the next largest multiple of the other integer, j. Test your results with the following test data: round off 256 days to the next largest number of days
//that is evenly divisible by a 7-day week.


package ch5;

public class NextMult {

	public static void main(String[] args) {

		int i = 256;
		int j = 7;
		
		int nextMultiple = i + j - i % j;
		System.out.println(nextMultiple);
	}

}
