package atividade01;
/**
 * @author Alan Lima Marques
 * @date 17/10/2024
 * @brief Thread que lê uma quantidade arbitrária de valores numéricos.
 */
import java.util.Random;
import outros.ThreadSleep;

public class SleepingThread implements  Runnable{

    @Override
    public void run(){
        Integer num = new Random().nextInt(10) +1;
        System.out.println("Dormindo por "+num+" Segundos...");
        ThreadSleep.sleepSeconds(num);
    }

}
