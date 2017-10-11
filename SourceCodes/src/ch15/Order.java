//Create a class named Order which contains a customer id and name. Provide an appropriate
//constructor.
//a. Write the contents of an Order object to the file order.txt in a readable text format.
//b. Write the contents of the same object to the file order.dat in a binary format.
//c. Write the same object to the file order.ser as a serialized object

package ch15;

import java.io.Serializable;

public class Order implements Serializable {
	private int ID;
	private String name;

	public Order(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
