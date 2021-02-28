public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Васька");
        Animal dog1 = new Dog("Бобик");

        cat1.run(4);
        cat1.swim(2);
        dog1.run(20);
        dog1.swim(8);
    }

}
