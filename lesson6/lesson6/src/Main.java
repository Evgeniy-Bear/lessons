public class Main {
    private Service service;
    public static void main(String[] args) {
        Cat cat=new Cat("Cat",2);
        Dog dog=new Dog("Dog",3,"NEWTYPE");
        Animal animal=new Cat("",12);
        Animal animal1=new Dog("Dog",5,"Type");
        System.out.println(cat.toString());
        System.out.println(cat);
        showAnimal(cat);
        showAnimal(dog);
        Service service=new ServiceImpl();
        Main main=new Main(new ServiceImpl());


    }
    public Main(Service service){
        this.service=service;
        service.say();
    }
    public static void showAnimal(Animal animal){
        System.out.println(animal.getName());
        System.out.println(animal.toString());
        System.out.println(animal.sayVoice());
    }
}
