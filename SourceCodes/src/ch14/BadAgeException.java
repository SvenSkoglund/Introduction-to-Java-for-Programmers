package ch14;

public class BadAgeException extends Exception{
	public String getMessage() {
		return "Invalid Age";
	}
}
