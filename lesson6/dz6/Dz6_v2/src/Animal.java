public abstract class Animal implements Runnable, Swimming {
    protected final String name;

    protected final int swimPossibleLength;
    protected final int runPossibleLength;

    public Animal(String name, int swimPossibleLength, int runPossibleLength) {
        this.name = name;
        this.swimPossibleLength = swimPossibleLength;
        this.runPossibleLength = runPossibleLength;
    }

    public String getName() {
        return name;
    }


    public int getSwimPossibleLength() {
        return swimPossibleLength;
    }

    public int getRunPossibleLength() {
        return runPossibleLength;
    }
}
