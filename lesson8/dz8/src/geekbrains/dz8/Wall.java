package geekbrains.dz8;

public class Wall implements Barrier {
    private String name;
    private int sizeObstacles;

    public Wall(String name, int sizeObstacles) {
        this.name = name;
        this.sizeObstacles = sizeObstacles;
    }

    @Override
    public boolean barrier(Action action) {
        if (action.actionJump(sizeObstacles))   {return true;}
        else {return false;}
    }
}
