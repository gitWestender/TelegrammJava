package coreLesson11;

public class CounterService {

    public Counter[] counters;

    public CounterService(int quantityOfCounters) {
        this.counters = new Counter[quantityOfCounters];
    }

    public void getAllCountersInfo() {
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] != null)
                System.out.printf("\n%s : %d (%s)", counters[i].getCounterName(), counters[i].getValue(), counters[i].getUnitOfMeasure());
        }
    }

    public void addCounterToArray(Counter c) {
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] == null) {
                counters[i] = c;
                break;
            }

        }
    }

    public void getCounterByName(String name) {
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] != null && counters[i].getCounterName().equals(name))
                System.out.printf("\n%s : %d (%s)", counters[i].getCounterName(), counters[i].getValue(), counters[i].getUnitOfMeasure());
        }
    }

    public void increaseCount(Counter c) {
        if (c != null)
            c.setValue(c.getValue() + 1);
    }

    public void increaseCount(Counter c, int value) {
        if (c != null)
            c.setValue(value);
    }

    public void resetCounter(Counter c) {
        if (c != null)
            c.setValue(0);
    }
}
