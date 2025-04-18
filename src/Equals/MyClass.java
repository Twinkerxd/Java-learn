package Equals;

import java.util.Objects;

public class MyClass {

    public static void main(String[] args) {
        First first = new First("kek");
        Second second = new Second("kek");

        boolean equals = first.equals(second);

        System.out.println(first);
        System.out.println(second);
        System.out.println(equals);
    }
}

class First {
    String name;

    public First(String name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        if (object instanceof Second second) {
            return Objects.equals(this.name, second.getName());
        }

        return false;
    }

    public String getName() {
        return name;
    }
}

class Second {
    String name;

    public Second(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object object) {
        if (object instanceof First first) {
            Objects.equals(this.name, first.getName());
        }
        return false;
    }
}
