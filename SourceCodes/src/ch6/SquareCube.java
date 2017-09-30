//Modify your solution to also calculate the cube of each number, but only print the cube if the number is even. (Hint: A number is even if it can be divided by 2 with a remainder of zero. The
//modulus operator will return the remainder of a division.)

package ch6;

public class SquareCube {

	public static void main(String[] args) {
		int cube = 0;
		for (int i = 0; i <= 9; i++) {
			System.out.println(i + " squared = " + (i * i));
			cube = i*i*i;
			if (cube % 2 == 0) {
				System.out.println(i + " cubed = " + (cube));
			}
			
		}
	}

}
