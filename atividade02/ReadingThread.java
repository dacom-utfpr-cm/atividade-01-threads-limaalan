package atividade02;
import java.io.File;
import java.util.Scanner;
import outros.ThreadSleep;

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
                ThreadSleep.sleepSeconds(num);
                
            }
            System.out.println("Todas as frases exibidas.");
            scanner.close();
        } catch (Exception e) {
            System.out.println("Um erro ocorreu: "+e);
        }
    }

}
