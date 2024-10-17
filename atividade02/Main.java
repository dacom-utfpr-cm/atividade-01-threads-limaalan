package atividade02;
/**
 * @author Alan Lima Marques
 * @date 17/10/2024
 * @brief Thread principal que inicia três outras threads que esperam um tempo aleatório.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\nIniciando a thread que lê as frases ...");
        new Thread(new ReadingThread()).start();

    }
}
