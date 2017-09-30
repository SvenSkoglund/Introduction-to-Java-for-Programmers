//What happens if the System.out.println() statement contains only the three char variables, and not
//the string "Initials: " or anything else?

package ch4;

public class MIChars {
	public static void main ( String [] args)
	{
		char firstInitial = '\u0053';
		char middleInitial = '\u0052';
		char lastInitial = '\u0053';
		
		System.out.println("Initials: " + firstInitial+ middleInitial+lastInitial);
	}

}
