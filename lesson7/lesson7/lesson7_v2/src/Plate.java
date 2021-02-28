public class Plate {
    private int foodValue;

    public Plate(int foodValue) {
        this.foodValue = foodValue;
    }
    public boolean decreaseFoot (int countEatenFood){
        if (hasEnoughFood(countEatenFood)) {
            foodValue-=countEatenFood;
            return true;
        }
        return false;
    }
    boolean hasEnoughFood(int requiredCountFood){
        return foodValue>=requiredCountFood;
    }
    public void info(){
        System.out.println("plate: " +foodValue);
    }
    public void addFood(int countFood){
        foodValue+=countFood;
    }
}
