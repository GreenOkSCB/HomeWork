package HW_Pizzeria;

import HW_Pizzeria.pizza.Client;
import HW_Pizzeria.pizza.Cooker;
import HW_Pizzeria.pizza.Order;
import HW_Pizzeria.pizza.Waiter;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

//    Сделать пиццерию на очередях: клиенты складывают заказы в очередь 1,
//    официанты из нее заказы забирают и добавляют в очередь 2,
//    из которой повар заказ забирает и готовит, после чего он готовые блюда складывает в очередь 3,
//    из который клиенты будут забирать заказы.
//    Сами же клиенты блокируются на очереди 3, официанты на очереди 1, а повара - на очереди 2.

    public static void main(String[] args) {

    int numClients = 100;
    int numWaiters = 5;
    int numCookers = 3;
    int queueSize = 2;

        System.out.println("Welcome to Green Pizza");

    BlockingQueue<Order> pendingOrders = new ArrayBlockingQueue<>(queueSize,true);
    BlockingQueue<Order> processingOrders = new ArrayBlockingQueue<>(queueSize,true);
    BlockingQueue<Order> doneOrders = new ArrayBlockingQueue<>(queueSize,true);
    ArrayList<Thread> allThreads = new ArrayList<>();

        for (int i = 0;i<numClients;i++) {
        Thread clientThread = new Thread(new Client(pendingOrders,doneOrders));
        clientThread.start();
        allThreads.add(clientThread);
    }

        for (int i = 0;i<numWaiters;i++) {
        Thread waiterThread = new Thread(new Waiter(pendingOrders,processingOrders));
        waiterThread.start();
        allThreads.add(waiterThread);
    }

        for (int i = 0;i<numCookers;i++) {
        Thread cookecrThread = new Thread(new Cooker(processingOrders,doneOrders));
        cookecrThread.start();
        allThreads.add(cookecrThread);
    }

        for (Thread thread: allThreads) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        System.out.println("Thank you for visiting Green Pizza");
}
}
