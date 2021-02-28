public class Dog extends Animal {
    public Dog(String name, int swimPossibleLength, int runPossibleLength) {
        super(name, swimPossibleLength, runPossibleLength);
    }

    @Override
    public void run(int length) {
        if (runPossibleLength > length) {
            System.out.println("Собака" + name + "пробежала дистанцию (" + length + " )");
        } else {
            System.out.println(name + "не модет осилить такую дистанцию");
        }

    }

    @Override
    public void swim(int length) {
        if (swimPossibleLength > length) {
            System.out.println("Собака " + name + "пробежала влю дистанцию (" + length + ")");
        } else {
            System.out.println(name + " не может осилить такую дистанцию");
        }


    }
}















