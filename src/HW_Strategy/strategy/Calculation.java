package HW_Strategy.strategy;

public class Calculation {
    private ILogger logger;

    public Calculation(ILogger logger) {
        this.logger = logger;
    }

    public void processData (int start, int stop) {
        for (int i=start;i<stop;i++) {
            if (i%10 == 0) logger.write("Found number: " + i);
        }
    }
}
