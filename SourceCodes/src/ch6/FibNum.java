//Write a program that uses a for loop to print the first 20 Fibonacci numbers. Remember that the
//first two (known as f0 and f1) are pre-defined as 0 and 1. All subsequent numbers are calculated
//from there

package ch6;

public class FibNum {

	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 0;
		for (int i = 0 ; i < 20 ; i++) {
			fib3 = fib1+fib2;
			System.out.println(fib3);
			fib1 = fib2;
			fib2 = fib3;

		}

	}

}
