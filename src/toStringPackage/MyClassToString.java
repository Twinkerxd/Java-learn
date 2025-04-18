package toStringPackage;

import OOP.Test;

public class MyClassToString {

    public static void main(String[] args) {
        TestClass test = new TestClass(16,13);
        System.out.println(test.toString());
    }
}

class TestClass {
    int a;
    int b;

    public TestClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public String toString() {
        return "ave " + getA() + getB();
    }
}

