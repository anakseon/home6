
public class Robot {
    private int age;
    private String name;
    private int size;

    // defaults
    public Robot() {
        age = 0;
        name = "Basic Robot";
        size = 1;
    }

    public Robot(int age, String name, int size) {
        this.age = age;
        this.name = name;
        this.size = size;
    }

    public void greet() {
        // a prototype 
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}