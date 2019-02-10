package HW_Strategy;

import HW_Strategy.strategy.*;

public class Main {

//      Самостоятельно изучить паттерн Стратегия. Реализовать Logger.
//      1. Интерфейс ILogger с мотодом write()
//      2. Реализовать три стратегии:
//      ConsoleLogger - выводит сообщения в консоль
//      FileLogger - записывает сообщение в файл
//      TimeFileLogger - записывает сообщение в файл + текущее время
//      3. Реализовать классы, исползующие эти стратегии.
//      Запись в файл должна работать!
    enum LoggerType{CONSOLE, FILE, TIMEFILE};

    public static void main(String[] args) {

        LoggerType loggerType = LoggerType.TIMEFILE;
        String logFileName = "loggerStrategy.txt";

        ILogger logger = null;

        switch (loggerType) {
            case CONSOLE: logger = new ConsoleLogger(); break;
            case FILE: logger = new FileLogger(logFileName);break;
            case TIMEFILE: logger = new TimeFileLogger(logFileName);break;
        }

        if (logger != null ) {
            Calculation calculation = new Calculation(logger);
            calculation.processData(25,75);
        }

    }
}
