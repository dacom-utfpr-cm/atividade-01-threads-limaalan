/**
 * @author Alan Lima Marques
 * @date 17/10/2024
 * @brief Thread que lê uma quantidade arbitrária de valores numéricos.
 */
package atividade05;

import java.util.ArrayList;
import java.util.Scanner;

public class ReaderThread implements  Runnable{
    private final ArrayList<Integer> readValues = new ArrayList<>();

    @Override
    public void run(){
        System.out.println("\n Entre com valores inteiros, digite qualquer outra coisa para encerrar.");
        Scanner reader = new Scanner(System.in);
        Integer num ;
        
        while (true){
            System.out.print("Valor :");
            try {
                num = reader.nextInt();
            } catch (Exception e) {
                System.out.println("Encerrando leitura pela thread de leitura...");
                reader.close();
                return;
            }
            readValues.add(num);
        }
    }

    public ArrayList<Integer> getReadValues() {
        return readValues;
    }
}