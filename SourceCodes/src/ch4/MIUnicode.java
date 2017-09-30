//Modify your solution to use Unicode escapes, rather than character literals, to initialize the
//variables. (Hint: Unicode for 'A' is '\u0041', 'Z' is '\u005A'.)

package ch4;

public class MIUnicode {
	public static void main ( String [] args)
	{
		char firstInitial = '\u0053';
		char middleInitial = '\u0052';
		char lastInitial = '\u0053';
		
		System.out.println(firstInitial+ middleInitial+lastInitial);
	}

}
