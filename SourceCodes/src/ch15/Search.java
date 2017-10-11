/*Create a class named Search that searches through the file employee.txt for the pattern "manager"
and prints out any lines that match the pattern. (Hint: You can search through a string for a substring
using the indexOf() method in the String class.)*/

package ch15;

import java.io.*;

public class Search {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileReader fr = new FileReader(
				"C:\\Users\\User\\Desktop\\Working Files\\Programming\\Programming Files\\Eclipse Workspace\\Introduction-to-Java-for-Programmers\\SourceCodes\\src\\ch15\\employee.txt");
		BufferedReader buf = new BufferedReader(fr);

		String s;
		try {
			for (int i = 0; i < 40; i++) {
				s = buf.readLine();
				for (int j = 0; j < s.length(); j++)
					if (s.charAt(j) == 'm' && s.charAt(j + 1) == 'a' && s.charAt(j + 2) == 'n' && s.charAt(j + 3) == 'a'
							&& s.charAt(j + 4) == 'g') {
						System.out.println(s);
					}
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			return;
		}
	}

}
