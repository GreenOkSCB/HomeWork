package HW040119.observer;

public class Signalization {
    public static void main(String[] args) {
//    Реализовать сигнализации, реагирующие на повышение температуры (паттерн observer).
//    Класс Sensor инкрементально повышает температуру, и на каждое изменение температуры
//    оповещает слушателей (сигнализации). Их должно быть три, соответствующие уровням тревоги:
//    Green (100), Yellow (300), Red (600).
//    Описываете интерфейс Alarm, имеющий метод void tempChanged(int temp),
//    и подписываете три реализации к датчику на оповещения.
//
//    Сигнализации сработают по преодолению определенного порога температуры:
//      100 градусов - Green
//      300 градусов - Green, Yellow
//      600 градусов - Green, Yellow, Red
//
//    Срабатывание - вывод в консоль сообщения. Если сигнализация сработала,
//    то сообщение не повторяется на дальнейшее повышение температуры,
//    но если опустится ниже порога, а потом опять преодолеет, то выведется снова.

        Sensor sensor = new Sensor();
        sensor.addAlarm(new GreenAlarm());
        sensor.addAlarm(new YellowAlarm());
        sensor.addAlarm(new RedAlarm());

        int temp = 0;
        for (int i = 0; i < 100; i++) {
            temp = (int) (Math.random() * 1000);
            sensor.changeTemp(temp);
        }
    }
}

