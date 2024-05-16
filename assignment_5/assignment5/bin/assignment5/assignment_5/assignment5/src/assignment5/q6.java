package assignment5;
import java.util.ArrayList;

public class q6 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ArrayList<Object> objects = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            objects.add(new byte[1024]); // Creating objects of size 1KB
            if (i % 10000 == 0) {
                printHeapInfo(startTime);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Program execution time: " + (endTime - startTime) + " milliseconds");
    }

    private static void printHeapInfo(long startTime) {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();

        System.out.println("Timestamp: " + elapsedTime + " milliseconds");
        System.out.println("Total Memory: " + totalMemory + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");
    }
}
