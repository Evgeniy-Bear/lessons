public class Cat {
    private String name;
    public int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate){
        satiety=plate.decreaseFoot(appetite);

    }

    @Override
    public String toString() {
        return "Cat{"+
                "name='"+name+'\''+
                "appetite="+appetite+
                "satiety="+ satiety+
                '}';
    }
}
