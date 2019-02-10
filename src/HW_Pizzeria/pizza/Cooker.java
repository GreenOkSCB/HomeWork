package HW_Pizzeria.pizza;

import java.util.concurrent.BlockingQueue;

public class Cooker implements Runnable {

    BlockingQueue <Order> processingOrders;
    BlockingQueue <Order> doneOrders;

    public Cooker(BlockingQueue<Order> processingOrders, BlockingQueue<Order> doneOrders) {
        this.processingOrders = processingOrders;
        this.doneOrders = doneOrders;
    }

    @Override
    public void run() {
        while (!processingOrders.isEmpty()) {
            try {
                Order coockingOrder = processingOrders.take();
                System.out.println("Coocker: Cooking order " + coockingOrder.getOrderID());
                Thread.sleep(10);
                doneOrders.put(coockingOrder);
                System.out.println("Coocker: Order is done " + coockingOrder.getOrderID());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
