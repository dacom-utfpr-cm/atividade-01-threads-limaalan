package atividade04;
/**
 * @author Alan Lima Marques
 * @date 17/10/2024
 * @brief Thread que monitora interrupções de um grupo de thread e finaliza após todas terminarem.
 */
public class MonitorThreadInteruption extends Thread{
    Thread[] threads ;

    public MonitorThreadInteruption(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public  void run(){
        int countInterruptedThreads = 0;
        while (true){
            
            for (Thread thread : threads){
                if (thread.isInterrupted()){
                    countInterruptedThreads++;                    
                    System.out.println("Thread ID = " + thread.threadId() + " foi interrompida.");
                }
            } 

            if (countInterruptedThreads >= threads.length){
                System.out.println("Todas as threads terminadas, encerrando monitor...");
                return;
            }
        }
    }


}
