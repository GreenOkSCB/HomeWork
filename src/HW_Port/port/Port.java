package HW_Port.port;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Port {

    int numDocks;
    BlockingQueue<Ship> portDocks;

    public BlockingQueue<Ship> getPortDocks() {
        return portDocks;
    }

    public Port(int numDocks) {
        this.numDocks = numDocks;
        portDocks = new ArrayBlockingQueue<Ship>(numDocks,true);
    }
}
