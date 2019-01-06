package HW040119.observer;

public interface Alarm {// наблюдатель / слушатель
    void tempChange(int temp);
}

class GreenAlarm implements Alarm {
    @Override
    public void tempChange(int temp) {
        if (temp >= 100 && temp < 300) {
            System.out.println("Сработала сигнализация, ЗЕЛЕНЫЙ уровень опасности, температура достигла: " + temp + " градусов.");
        } else if (temp < 100) {
            System.out.println("Все ок! Температура равна " + temp + " градусам!");
        }
    }
}

class YellowAlarm implements Alarm {
    @Override
    public void tempChange(int temp) {
        if (temp >= 300 && temp < 600) {
            System.out.println("Сработала сигнализация, ЖЕЛТЫЙ уровень опасности, температура достигла: " + temp + " градусов.");
        }
    }
}

class RedAlarm implements Alarm {
    @Override
    public void tempChange(int temp) {
        if (temp >= 600) {
            System.out.println("Сработала сигнализация, КРАСНЫЙ уровень опасности, температура достигла: " + temp + " градусов.");
        }
    }
}
