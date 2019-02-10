package HW_Port.port;

import java.util.concurrent.BlockingQueue;

public class Ship implements Runnable{

    public enum ShipAction {LOADING,UNLOADING,EXCHANGE}

    BlockingQueue<Ship> portDocks;
    ShipAction shipAction;
   private int shipID = 0;

    public Ship(BlockingQueue<Ship> portDocks, ShipAction shipAction) {
        this.portDocks = portDocks;
        this.shipAction = shipAction;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            shipID = (int) (Math.random() * 100);
        }
        try {
            portDocks.put(this);
            System.out.println("Ship " + shipID +  " entered the dock");
            Thread.sleep(getOperationTime());
            portDocks.take();
            System.out.println("Ship " + shipID +  " leave the port");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    int getOperationTime () {
        int time = 0;
        switch (shipAction) {
            case LOADING: time = 50;break;
            case UNLOADING: time = 30;break;
            case EXCHANGE: time = 110;break;
        }

        return time;
    }
}
