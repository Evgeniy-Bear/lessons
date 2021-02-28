public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
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
