package ThisPractice;

public class Human extends Person{

    public Human() {
//        super.age = 32;
//        super.setActiveTrue();
//        this.rename("blablabla");
        this("2d constructor");
    }

    public Human(String name) {
        this.name = name;
    }

    public void rename(String name) {
        this.name = name;
    }


}
