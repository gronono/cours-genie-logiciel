package nc.unc.cours.gl;

public class CoffeeMachine {

    private final int index;

    private int delivered = 0;
    private boolean busy = false;

    public CoffeeMachine(int index) {
        this.index = index;
    }


    public synchronized  Coffee takeCoffee() {
        busy = true;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        delivered++;
        Coffee coffee = new Coffee();
        busy = false;
        return coffee;
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
