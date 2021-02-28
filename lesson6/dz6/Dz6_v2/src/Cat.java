public class Cat extends Animal {
    public Cat(String name, int swimPossibleLength, int runPossibleLength) {
        super(name, swimPossibleLength, runPossibleLength);
    }

    @Override
    public void run(int length) {
        if (runPossibleLength > length) {
            System.out.println(" кот" + name + "пробежал влю дистанцию(" + length + ")");
        } else {
            System.out.println(name + " не может остлить такую дистанцию");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("коты не плавают");
    }
}
