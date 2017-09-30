////Modify your solution to (if necessary) so that the sequence number is printed out next to the
//Fibonacci value. Make sure that sequence numbers 0and 1 match up with the first two pre-defined
//values.

package ch6;

public class Fib {

	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 0;
		System.out.println("0: " +fib1);
		System.out.println("1: " +fib2);

		for (int i = 2 ; i < 20 ; i++) {
			fib3 = fib1+fib2;
			System.out.println(i +": " +fib3);
			fib1 = fib2;
			fib2 = fib3;

		}

	}

}
