public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public  void runAnimal(String nameAnimal, int lengthOfObstacle, int runDistanceMax) {
        if (runDistanceMax == 0) {
            System.out.println(nameAnimal + " не бегает");
        } else  if (lengthOfObstacle > runDistanceMax) {
            System.out.println("Слишком большая дистанция для "+ nameAnimal);
        } else if (lengthOfObstacle <= runDistanceMax && lengthOfObstacle > 0) {
            System.out.println(nameAnimal + " пробежал " + lengthOfObstacle + " м");
        } else {
            System.out.println("не корректное значение длинны дистанции");
        }
    }

    public  void swimAnimal(String nameAnimal, int lengthOfObstacle, int swimDistanceMax) {
        if (swimDistanceMax == 0) {
            System.out.println(nameAnimal + " не умеет плавать");
        } else if (lengthOfObstacle > swimDistanceMax) {
            System.out.println("Слишком большая дистанция для "+ nameAnimal );
        } else if (lengthOfObstacle <= swimDistanceMax && lengthOfObstacle > 0) {
            System.out.println(nameAnimal + " проплыл " + lengthOfObstacle + " м");
        } else {
            System.out.println("не корректное значение длинны дистанции");
        }
    }


}
