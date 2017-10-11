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
	

		Order sven = new Order(2,"Sven");
		oos1.writeObject(sven);
		oos2.writeObject(sven);
	}

}
