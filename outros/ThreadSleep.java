package outros;

public class ThreadSleep {
    public static void sleepMiliseconds(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida!");
            //e.printStackTrace();
            return;
        }
    }

    public static void sleepSeconds(long s) {
        ThreadSleep.sleepMiliseconds(s*1000);
    }
}
