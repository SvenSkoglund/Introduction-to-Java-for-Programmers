/*Create a class named Search that searches through the file employee.txt for the pattern "manager"
and prints out any lines that match the pattern. (Hint: You can search through a string for a substring
using the indexOf() method in the String class.)*/

package ch15;

import java.io.*;

public class Search {

	public static void main(String[] args)
			throws IOException, FileNotFoundException {
		if (args.length != 2) {
			System.out.println("Needs two args. First arg = subtext Second arg = filename");
		}
        String pattern = args[0];
        String filename = args[1];
        
		FileReader fr = new FileReader(filename);
		BufferedReader buf = new BufferedReader(fr);
		char[] charArray = pattern.toCharArray();
		String s;
		try {
			for (int i = 0; i < 40; i++) {
				s = buf.readLine();
				for (int j = 0; j < s.length(); j++)
					if (s.charAt(j) == charArray[0] && s.charAt(j + 1) == charArray[1]
							&& s.charAt(j + 2) == charArray[2] && s.charAt(j + 3) == charArray[3]/*
							&& s.charAt(j + 4) == charArray[4]*/) {
						System.out.println(s);
					}
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			return;
		}
	}

}
