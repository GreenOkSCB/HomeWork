package HW_Pizzeria.pizza;

import java.util.concurrent.BlockingQueue;

public class Client implements Runnable {

    BlockingQueue<Order> pendingOrders;
    BlockingQueue<Order> doneOrders;
    Order clientOrder;

    public Client(BlockingQueue<Order> pendingOrders, BlockingQueue<Order> doneOrders) {
        this.pendingOrders = pendingOrders;
        this.doneOrders = doneOrders;
        clientOrder = new Order((int)(Math.random()*100));
    }

    @Override
    public void run() {
        try {
            pendingOrders.put(clientOrder);
            System.out.println("Client: I have new order " + clientOrder.getOrderID());
            clientOrder = doneOrders.take();
            System.out.println("Client: Thank you for the order " + clientOrder.getOrderID() );
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
