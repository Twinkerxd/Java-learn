package OOP;

public class Man extends Human {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    void whoAreYou() {
        System.out.println("I am a man and my name is " + name);
    }

}
