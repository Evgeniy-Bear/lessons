

public class Main {
    public static void main(String[] args) {

        Cat[] arrCat = new Cat[4];
        arrCat[0] = new Cat("Barsik", 10, false);
        arrCat[1] = new Cat("Murzik", 20, false);
        arrCat[2] = new Cat("Vasiliy", 30, false);
        arrCat[3] = new Cat("Murzik", 40, false);

        for (int i = 0; i < arrCat.length; i++) {
            System.out.println("name: " + arrCat[i].getName() +
                    " appetite: " + arrCat[i].getAppetite() +
                    " satiety: " + arrCat[i].isSatiety());

        }

        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < arrCat.length; i++) {
            arrCat[i].eat(plate);
        }
        for (int i = 0; i < arrCat.length; i++) {
            System.out.println("name: " + arrCat[i].getName() +
                    " appetite: " + arrCat[i].getAppetite() +
                    " satiety: " + arrCat[i].isSatiety());

        }
        plate.info();


        if (plate.getFood() < 50) {
            plate.addFood(100);
        }
        plate.info();
    }


}

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        int countFoot = plate.getFood();
        plate.decreaseFood(appetite);
        if (plate.getFood() < countFoot) {
            setSatiety(true);
        }
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int countFoot) {
        if ((food - countFoot) >= 0) {
            food -= countFoot;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int countFoot) {
        setFood(getFood() + countFoot);
    }

}


