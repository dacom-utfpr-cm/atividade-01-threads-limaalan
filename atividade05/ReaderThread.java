
import java.util.ArrayList;
import java.util.Scanner;

public class ReaderThread {
    private static volatile ArrayList<Integer> readValues = new ArrayList<>();

    public static void main(String[] args) {
        Thread readerThread = new Thread(()->{
            System.out.println("\n Entre com valores inteiros, digite -1 para sair.");
            Scanner reader = new Scanner(System.in);
            Integer line =0;
            
            while ( line != null && line!= -1){
                System.out.println("Digite :");
                readValues.add(line);
                line = Integer.valueOf(reader.nextLine());
                
                System.out.println("Lido:" + line );
            }
            reader.close();
            
        });
        
        System.out.println("Iniciando thread de leitura...");
        readerThread.start();
        try {
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread de leitura finalizada.");

        Integer sum = 0;
        for (Integer elem : readValues) {
            sum += elem;
        }

        System.out.println("Soma é : " + sum);
    }

}
