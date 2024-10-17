package atividade02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingThread implements  Runnable{

    @Override
    public void run(){
        try {
            Integer num = 10;
            File file = new File("atividade02/quotes.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);

                try {
                    Thread.sleep(num*1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread leitora interrompida!");
                    scanner.close();
                    return;
                }
                
            }
            System.out.println("Todas as frases exibidas.");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Um erro ocorreu: "+e);
        }
    }

}
