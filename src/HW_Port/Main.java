package HW_Port;

import HW_Port.port.Port;
import HW_Port.port.Ship;

public class Main {

//    Обязательно решить одну задачу (при решении использовать классы из пакета java.util.concurrent):
//    Задача 2
//    Порт. Корабли заходят в порт для разгрузки/загрузки. Работает несколько причалов.
//    У одного причала может стоять один корабль. Корабль может загружаться у причала,
//    разгружаться или выполнять оба действия.


    public static void main(String[] args) {
        int numDocks = 5;
        int numShips = 100;

        System.out.println("Welcome to Green Port");

        Port greenPort = new Port(numDocks);

        for (int i =0;i<numShips;i++) {
            int random = (int)(Math.random() * 3 + 1);
            Ship.ShipAction shipAction = Ship.ShipAction.LOADING;
            switch (random) {
                case 1: shipAction = Ship.ShipAction.LOADING;break;
                case 2: shipAction = Ship.ShipAction.UNLOADING;break;
                case 3: shipAction = Ship.ShipAction.EXCHANGE;break;
            }
            Thread shipThread = new Thread(new Ship(greenPort.getPortDocks(),shipAction));
            shipThread.start();
        }
        System.out.println("To the port goes " + numShips + " ships");
    }
}
