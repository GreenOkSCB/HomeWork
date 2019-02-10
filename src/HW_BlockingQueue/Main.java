package HW_BlockingQueue;

import HW_BlockingQueue.blockQueue.Worker;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

//    Используя блокирующие очереди сосчитать топ слов как из предыдущего задания.
//    Вариантом решения может быть:
//    main создает потоки Worker, которые ждут строки из очереди на методе take().
//    Далее main читает с диска и добавляет строки в очереди, последними строками будут стоп-строки.
//    Worker'ы при получении стоп-строки добавляют свою внутреннюю мапу в следующую очередь и завершают свою работу.
//    main же ждет мапы со всех воркеров на второй очереди и результат собирает в результирующую мапу.
//    В итоге, не должно быть нигде явной синхронизации и использованы две блокирующие очереди

    public static void main(String[] args) {

        int optimalThreads = Runtime.getRuntime().availableProcessors();
        int wordsQueueSize = 100;
        String fileName = "inputText.txt";
        String endPoint = "EndPoint";

        System.out.println("Optimal threads:" + optimalThreads);

        BlockingQueue<String> inputWordsBlockingQueue = new ArrayBlockingQueue<>(wordsQueueSize, true);
        BlockingQueue<Map<String, Integer>> mainThreadBlockingQueue = new ArrayBlockingQueue<>(1, true);
        Map <String,Integer> finalMap = new HashMap<>();

        for (int i=0;i<optimalThreads;i++) {
            new Thread(new Worker(inputWordsBlockingQueue,mainThreadBlockingQueue,endPoint)).start();
        }

        try (BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))){
            String line;
            while ((line = buff.readLine()) != null) {
                line = line.replaceAll("\\pP", " ");
                String[] words=line.split("\\s");
                for(String w:words){
                    inputWordsBlockingQueue.put (w);
                }
            }

            for (int i = 0;i<optimalThreads;i++) inputWordsBlockingQueue.put(endPoint);

            for (int i = 0;i<optimalThreads;i++) {
                Map<String,Integer> threadMap = mainThreadBlockingQueue.take();
                for (Map.Entry entry : threadMap.entrySet()) {
                    finalMap.merge(entry.getKey().toString(), (Integer) entry.getValue(), (oldVal, newVal) -> oldVal + newVal);
                }
            }

            finalMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(100).forEach(System.out::println);

        } catch (IOException | InterruptedException iox ) {
            System.out.println(iox.getMessage());
        }
    }
}
