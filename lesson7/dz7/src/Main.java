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
