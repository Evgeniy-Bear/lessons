public class Dog extends Animal{
   private String typeDog;

    public Dog(String name, int age, String typeDog) {
        super(name, age);
        this.typeDog=typeDog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "typeDog='" + typeDog + '\'' +
                "nane=' "+ getName()+ '\'' +
                '}';
    }

    @Override
    public String sayVoice() {
        return "Gaw";
    }
}
