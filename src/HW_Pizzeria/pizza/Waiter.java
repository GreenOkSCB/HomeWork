package HW_Pizzeria.pizza;

import java.util.concurrent.BlockingQueue;

public class Waiter implements Runnable {

    BlockingQueue<Order> pendingOrders;
    BlockingQueue<Order> processingOrders;

    public Waiter(BlockingQueue<Order> pendingOrders, BlockingQueue<Order> processingOrders) {
        this.pendingOrders = pendingOrders;
        this.processingOrders = processingOrders;
    }

    @Override
    public void run() {
        try {
            while (!pendingOrders.isEmpty()) {
                Order nextOrder = pendingOrders.take();
                System.out.println("Waiter: Next order to cook " + nextOrder.getOrderID() );
                processingOrders.put(nextOrder);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
