package staticC;

public class MyTestClass {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.model = "RHT-1365";
        computer.color = "white";
        computer.on();
        computer.off();

        System.out.println(Computer.name);
        Computer.name = "SOMETHING";
        System.out.println(Computer.name);
        System.out.println(Computer.name);

        Computer.myStaticMethod();
    }

    public void renameMe() {
        Computer.name = "lel";
        staticSearch();
    }
    public static void staticSearch() {

    }
}
