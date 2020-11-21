package comp;

public class ProgramCounter {

    private int counter;

    public ProgramCounter() {
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int value) {
        this.counter = value;
    }

    public void increment() {
        counter++;
    }

    public boolean isHalt(int index) {
        return counter < index;
    }
}
