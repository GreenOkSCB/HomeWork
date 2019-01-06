package HW040119.observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor {   // наблюдаемый / издатель / извещатель

    private List<Alarm> alarms = new ArrayList<>();

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void notifyAlarm(int temp) {
        for (Alarm alarm : alarms) {
            alarm.tempChange(temp);
        }
    }

    public void changeTemp(int temp) {
        notifyAlarm(temp);
    }
}