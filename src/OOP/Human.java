package OOP;

import java.util.ArrayList;

public class Human {
    protected String name;
    protected int age;
    protected ArrayList<String> hobbies = new ArrayList<>();

    void whoAreYou() {
        System.out.println("I am a human");
    }

    void getHobbies() {
        System.out.println(hobbies);
    }

    void setHobbies(String hobby) {
        hobbies.add(hobby);
        System.out.println("New hobby = "+hobby+" added to hobbies list");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Created object human, with name = " +name+" and age = "+age);
    }

    void getName() {
        System.out.println("My name is "+name);
    }
}
