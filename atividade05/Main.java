/**
 * @author Alan Lima Marques
 * @date 17/10/2024
 * @brief Thread principal que bloqueia até o encerramento da thread de leitura.
 */
package atividade05;
public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando thread de leitura...");
        ReaderThread readerRunnable = new ReaderThread();
        Thread readerThread = new  Thread(readerRunnable);
        readerThread.start();        
        try {
            readerThread.join();
        } catch (InterruptedException e) {
        }
        System.out.println("De volta ao fluxo da thread principal...");
        
        Integer sum = 0;
        for (Integer elem : readerRunnable.getReadValues()) {
            sum += elem;
        }

        System.out.println("A Soma é : " + sum);
    }
}
