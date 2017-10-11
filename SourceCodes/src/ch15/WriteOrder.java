//Create a class named Order which contains a customer id and name. Provide an appropriate
//constructor.
//a. Write the contents of an Order object to the file order.txt in a readable text format.
//b. Write the contents of the same object to the file order.dat in a binary format.
//c. Write the same object to the file order.ser as a serialized object

package ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteOrder {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Order.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos);
		
		FileOutputStream fos2 = new FileOutputStream("Order.dat");
		DataOutputStream dos = new DataOutputStream(fos2);
		ObjectOutputStream oos2 = new ObjectOutputStream(dos);
		
		FileOutputStream fos3 = new FileOutputStream("Order.ser");
		ObjectOutputStream oos3 = new ObjectOutputStream(fos3);

	

		Order sven = new Order(2,"Sven");
		oos1.writeObject(sven);
		oos2.writeObject(sven);
		oos3.writeObject(sven);
	}

}
