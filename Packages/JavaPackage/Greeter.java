package JavaPackage;

public class Greeter {

    private Message message;

    public Greeter(Message message) {
        this.message = message;
    }

    public void greet(String name) {
        System.out.println(message.getText() + ", " + name + "!");
    }
}
