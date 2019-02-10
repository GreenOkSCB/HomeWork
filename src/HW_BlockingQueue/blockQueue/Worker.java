package HW_BlockingQueue.blockQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable{
    private BlockingQueue<String> wordsQueue;
    private BlockingQueue<Map<String, Integer>> mainThreadQueue;
    String endPoint;
    private Map<String,Integer> wordsCountMap;

    public Worker(BlockingQueue<String> wordsQueue, BlockingQueue<Map<String, Integer>> mainThreadQueue,String endPoint) {
        this.wordsQueue = wordsQueue;
        this.mainThreadQueue = mainThreadQueue;
        this.endPoint = endPoint;
        wordsCountMap = new HashMap<>();
    }

    @Override
    public void run() {
        System.out.println("Starting thread!");
        String newWord = "";

        while (!newWord.equalsIgnoreCase(endPoint)) {
            try {
                newWord = wordsQueue.take();
                wordsCountMap.merge(newWord, 1, (oldVal, newVal)-> oldVal + newVal);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            mainThreadQueue.put(wordsCountMap);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thread work finished!");
    }
}
