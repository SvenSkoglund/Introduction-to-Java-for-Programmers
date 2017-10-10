package ch14;

public class InvalidDataException extends Exception {
    public String getMessage() {
        return "Name must be provided.";
    }
}
