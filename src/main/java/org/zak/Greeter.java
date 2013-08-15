package org.zak;

public class Greeter {

    private final String message;

    public Greeter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String greet(String greetee) {
        return String.format(message + " %s!", greetee);
    }
}
