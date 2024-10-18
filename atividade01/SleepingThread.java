package atividade01;
/**
 * @author Alan Lima Marques
 * @date 17/10/2024
 * @brief Thread que lê uma quantidade arbitrária de valores numéricos.
 */
import java.util.Random;
import outros.ThreadSleep;

public class SleepingThread implements  Runnable{
    private static final int MIN_SLEEP_TIME = 3;
    private static final int MAX_SLEEP_TIME = 10;
    @Override
    public void run(){
        Integer num = new Random().nextInt(MAX_SLEEP_TIME-MIN_SLEEP_TIME) +MIN_SLEEP_TIME;
        System.out.println("Dormindo por "+num+" Segundos...");
        ThreadSleep.sleepSeconds(num);
    }

}
