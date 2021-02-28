public class Dog extends Animal {
    public final int dogRunDistanceMax = 500;
    public final int dogSwimDistanceMax = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int lengthOfObstacle) {
        runAnimal(super.getName(),lengthOfObstacle,dogRunDistanceMax);

    }

    @Override
    public void swim(int lengthOfObstacle) {
        swimAnimal(super.getName(),lengthOfObstacle,dogSwimDistanceMax);

    }
}
