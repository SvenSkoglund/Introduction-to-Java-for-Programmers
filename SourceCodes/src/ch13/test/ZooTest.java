package ch13.test;
import ch13.animal.*;
public class ZooTest {

	public static void main(String[] args) {
		ch13.animal.Cat snowflake = new ch13.animal.Cat();
		ch13.zoo.Cat sima = new ch13.zoo.Cat();
		Dog crystal = new Dog();
		
		Object [] animalFriends = new Object[3];
		animalFriends[0] = snowflake;
		animalFriends[1] = sima;
		animalFriends[2] = crystal;
		
	}

}
