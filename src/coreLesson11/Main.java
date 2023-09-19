package coreLesson11;

public class Main {
    public static void main(String[] args) {

        Counter gas = new Counter("Газ", "м3");
        Counter hotWater = new Counter("Горячая вода", "м3");
        Counter coldWater = new Counter("Холодная вода", "м3");


        CounterService service = new CounterService(10);

        service.addCounterToArray(gas);
        service.addCounterToArray(hotWater);
        service.addCounterToArray(coldWater);

        service.increaseCount(gas);
        service.increaseCount(hotWater, 130);
        service.increaseCount(coldWater, 247);

        service.getAllCountersInfo();


    }
}
