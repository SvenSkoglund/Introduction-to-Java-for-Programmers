package ch15;
import java.io.*;
public class ReadOrder {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Order.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		FileInputStream fis2 = new FileInputStream("Order.txt");
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		
		FileInputStream fis3 = new FileInputStream("Order.ser");
		ObjectInputStream ois3 = new ObjectInputStream(fis3);
		
		ois.readObject();
		ois2.readObject();
		ois3.readObject();
		

		
		
	}

}
