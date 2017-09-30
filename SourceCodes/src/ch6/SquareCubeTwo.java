//Modify your solution to both calculate and print the cube of each number only if the number is even

package ch6;

public class SquareCubeTwo {

	public static void main(String[] args) {
		int cube = 0;
		for (int i = 0; i <= 9; i++) {
			System.out.println(i + " squared = " + (i * i));
			if (i % 2 == 0) {
				cube = i*i*i;
				System.out.println(i + " cubed = " + (cube));
			}
			
		}
	}

}
