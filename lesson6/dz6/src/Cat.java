public class Cat extends Animal {
    public final int catRunDistanceMax = 200;
    public final int catSwimDistanceMax = 0;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int lengthOfObstacle) {
        runAnimal(super.getName(), lengthOfObstacle, catRunDistanceMax);

    }

    @Override
    public void swim(int lengthOfObstacle) {
        swimAnimal(super.getName(), lengthOfObstacle, catSwimDistanceMax);

    }

}
