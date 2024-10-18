package atividade04;

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
