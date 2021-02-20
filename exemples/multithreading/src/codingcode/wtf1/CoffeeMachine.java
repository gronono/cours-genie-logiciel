package codingcode.wtf1;

public class CoffeeMachine {

    private final int index;

    private int delivered = 0;
    private boolean busy = false;

    public CoffeeMachine(int index) {
        this.index = index;
    }

    public Coffee takeCoffee() {
        try {
            busy = true;
            Thread.sleep(10);
            delivered++;
            return new Coffee();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            busy = false;
        }
    }

    public boolean isBusy() {
        return busy;
    }

    public int nbDelivered() {
        return delivered;
    }

    public int getIndex() {
        return index;
    }
}
