public class RobotDog extends Robot implements Pet {
    private String owner;

    public RobotDog() {
        // not necessary, but let it be here
        super();
    }

    public RobotDog(int age, String name, int size) {
        super(age, name, size);
    }

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public void play() {
        if(!owner.equals(null))
            System.out.println(getName() + " is playing with " + getOwner());
        else System.out.println(getName() + " is playing with nobody.");
    }
}