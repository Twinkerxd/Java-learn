package OOP;

public class Test {
    public static void main(String[] args) {
        Man man = new Man("Serega",30);
        Woman woman = new Woman("Ola", 28);
        Human human = new Human("unknown",0);

        Test test = new Test();
        test.somePolymorphismMethod(man);
        test.somePolymorphismMethod(woman);
        test.somePolymorphismMethod(human);

    }

    public void somePolymorphismMethod(Human human) {
        human.whoAreYou();
    }
}
