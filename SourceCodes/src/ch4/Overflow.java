//Write a program that declares and initializes two int variables: big (2147483647) and bigger
//(big + 1). Print them both out and explain the results.

package ch4;

public class Overflow {

	public static void main(String[] args) {

		int big = 2147483647;
		int bigger = big + 1;
		
		System.out.println(big);
		System.out.println(bigger);
		

	}

}
