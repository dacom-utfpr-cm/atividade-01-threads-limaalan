package atividade03;
/**
 * @author Alan Lima Marques
 * @date 17/10/2024
 * @brief Thread principal que inicia outras threads e as interrompe .
 */
import atividade01.SleepingThread;
import atividade02.ReadingThread;
import outros.ThreadSleep;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando 3 threads do exercício 1...");
        Thread[] threads = new Thread[4];
        threads[0]= new Thread(new SleepingThread());
        threads[1]= new Thread(new SleepingThread());
        threads[2]= new Thread(new SleepingThread());

        System.out.println("\nIniciando a thread que lê as frases ...");
        threads[3]= new Thread(new ReadingThread());

        for (Thread thread : threads){
            thread.start();
        }

        //Esperando um pouco até que as threads comecem a executar algo
        ThreadSleep.sleepSeconds(1);

        System.out.println("Enviando sinal de interrupção para todas as threads...");
        for (Thread thread : threads){
            thread.interrupt();
        }


    }
}
