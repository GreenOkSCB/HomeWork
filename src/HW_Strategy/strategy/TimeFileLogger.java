package HW_Strategy.strategy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeFileLogger extends FileLogger {

    public TimeFileLogger(String logFileName) {
        super(logFileName);
    }

    @Override
    public void write(String message) {

        String now = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(Calendar.getInstance().getTime());
        String datedMessage = now + " " + message;
        super.write(datedMessage);
    }
}
