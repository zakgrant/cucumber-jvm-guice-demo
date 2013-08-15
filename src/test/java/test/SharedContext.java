package test;

import org.zak.Greeter;

public class SharedContext {
    private Greeter greeter;
    private String message;

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public Greeter getGreeter() {
        return greeter;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
