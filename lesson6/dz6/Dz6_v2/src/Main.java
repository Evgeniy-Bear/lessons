public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Cat", 1, 3);
        Animal dog = new Dog("Dog", 1, 3);
        Runnable runnable = cat;
        Swimming swimming = cat;
    }

    public void foo(Runnable runnable) {
        runnable.run(13);
    }
}
