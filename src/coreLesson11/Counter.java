package coreLesson11;

public class Counter {
    private String counterName;
    private int value;
    private String unitOfMeasure;

    public Counter(String counterName, String unitOfMeasure) {
        this.counterName = counterName;
        this.unitOfMeasure = unitOfMeasure;
        this.value = 0;
    }

    public String getCounterName() {
        return counterName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }
}
