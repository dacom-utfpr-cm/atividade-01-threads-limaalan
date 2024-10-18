package atividade04;
import atividade01.SleepingThread;
import java.util.Random;
import outros.ThreadSleep;

public class Main {
    public static final int MAX_TIME_BETWEEN_INTERRUPTIONS = 2;
    public static final int MIN_TIME_BETWEEN_INTERRUPTIONS = 1;

    public static void main(String[] args) {
        
        Thread[] threads = new Thread[3];
        System.out.println("Iniciando 3 threads do exercício 1...");
        threads[0]= new Thread(new SleepingThread());
        threads[1]= new Thread(new SleepingThread());
        threads[2]= new Thread(new SleepingThread());

        for (Thread thread : threads){
            thread.start();
        }

        // Iniciando thread que monitora interrupções
        new  MonitorThreadInteruption(threads).start();       

        System.out.println("Enviando sinal de interrupção para todas as threads...");
        for (Thread thread : threads){
            ThreadSleep.sleepSeconds(new Random().nextInt(MAX_TIME_BETWEEN_INTERRUPTIONS)+MIN_TIME_BETWEEN_INTERRUPTIONS);
            thread.interrupt();
        }


    }
}
