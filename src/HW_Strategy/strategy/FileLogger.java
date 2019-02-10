package HW_Strategy.strategy;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements ILogger{

    protected String logFileName;

    public FileLogger(String logFileName) {
        this.logFileName = logFileName;
    }

    @Override
    public void write(String message) {
        try {
            FileWriter fw = new FileWriter(logFileName,true);
            fw.write(message + '\n');
            fw.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
