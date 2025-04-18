package OOP;

public class Woman extends Human {
    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    void whoAreYou() {
        System.out.println("I am a woman");
    }
}
