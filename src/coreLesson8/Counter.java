package coreLesson8;

public class Counter {
    private String name;
    private int count;

    public Counter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public Counter(String name) {
        this.name = name;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increaseCounter() {
        this.setCount(getCount() + 1);
    }

    public void decreaseCounter() {
        this.setCount(getCount() - 1);
    }
}
