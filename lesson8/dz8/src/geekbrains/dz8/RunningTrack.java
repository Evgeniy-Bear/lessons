package geekbrains.dz8;

public class RunningTrack implements Barrier {
    private String name;
    private int sizeObstacles;

    public RunningTrack(String name, int sizeObstacles) {
        this.name = name;
        this.sizeObstacles = sizeObstacles;
    }


    @Override
    public boolean barrier(Action action) {
        if (action.actionRun(sizeObstacles)) return true;
        else return false;

    }
}
