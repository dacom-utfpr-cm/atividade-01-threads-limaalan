package outros;

public class ThreadSleep {
    public static void sleepMiliseconds(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepSeconds(long s) {
        ThreadSleep.sleepMiliseconds(s*1000);
    }
}
