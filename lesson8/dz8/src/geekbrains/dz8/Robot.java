package geekbrains.dz8;

public class Robot implements Action, Running, Jumping {
    private String name;
    private int distanceMax;
    private int heightMax;

    public Robot(String name, int distanceMax, int heightMax) {
        this.name = name;
        this.distanceMax = distanceMax;
        this.heightMax = heightMax;
    }

    public void run(int length) {
        if (length <= distanceMax) {
            System.out.println(name + " успешно пробежал " + length + " м");
        } else {
            System.out.println(name + " не смог пробежать " + length + " м");
        }
    }

    @Override
    public void jump(int length) {
        if (length <= heightMax) {
            System.out.println(name + " успешно перепрыгнул стену " + length + " м");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену " + length + " м");
        }
    }


    @Override
    public boolean actionJump(int length) {
        if (length <= heightMax) {
            return true;
            //System.out.println(name + " успешно перепрыгнул стену " + length + " м");
        } else {
            return false;
            //System.out.println(name + " не смог перепрыгнуть стену " + length + " м");
        }
    }

    public boolean actionRun(int length) {
        if (length <= distanceMax) {
            return true;
            //System.out.println(name + " успешно пробежал " + length + " м");
        } else {
            return false;
           // System.out.println(name + " не смог пробежать " + length + " м");
        }
    }
}
