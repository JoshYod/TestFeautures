package JavaPackage;

public class Main {

    public static void main(String[] args) {
        Message msg = new Message("Hello");
        Greeter greeter = new Greeter(msg);
        greeter.greet("you");
    }
}