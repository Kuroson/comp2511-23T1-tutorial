package example;

/**
 * Write a program that stores a message and has methods for getting the message,
 * updating the message and printing it out in all caps. Write a `main()` method
 * for testing this class.
 *
 * Create a:
 * - Getter
 * - Setter
 * - Constructor
 * - printMe
 * - shout
 * - toString
 */
public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public String getMessage() {
        return this.message.toLowerCase();
    }

    public void scream() {
        System.out.println(this.getMessage().toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("This is my message");
        System.out.println(s.getMessage());
        s.setMessage("This is my changed message");
        System.out.println(s.getMessage());
        s.scream();
    }
}
