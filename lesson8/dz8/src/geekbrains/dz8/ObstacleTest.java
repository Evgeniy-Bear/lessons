package geekbrains.dz8;

public class ObstacleTest {
    public boolean test (Action action, Barrier barrier){
     if (barrier.barrier(action)) return true;
        else return false;
    }
}
