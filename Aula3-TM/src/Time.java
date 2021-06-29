public class Time {

    private static long startTime;
    private static long stopTime;

    static void start(){
        Time.startTime = System.currentTimeMillis();
    };

    static void stop(){
        Time.stopTime = System.currentTimeMillis();
    };

    static Long elapsedTime(){
        return (stopTime - startTime);
    }
}
