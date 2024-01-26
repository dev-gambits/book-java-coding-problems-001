package website.sideral.exercise1.util;

import java.util.concurrent.TimeUnit;

public class DisplayExecutionTimeUtil {
    public static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " (" +
                TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}
