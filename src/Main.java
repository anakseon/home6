import robot.Animal;
import robot.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals =new Animal[3];
        animals[1] = new Dog("Dog",5,3,"Petro","Hi, i`m dog");
        animals[2] = new Dog("Dog 2",3,1,"Vaska","i`m dog 2");

        for (Animal animal:animals) {
            System.out.println(animal);
            animal.voice();
        }
    }
}