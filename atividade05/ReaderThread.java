
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ReaderThread {
    public static void main(String[] args) {
        new Thread(()->{
            Scanner reader = new Scanner(System.in);
            String line ="";
            
            while ( Integer.valueOf(line)!= null ){
                System.out.println("Digite :");
                line = reader.nextLine();

                System.out.println("Lido:" + line );
                System.out.printf("lido : %s\n" , line);
            }

            
            String texto = JOptionPane.showInputDialog(null , "Digite : ");
            JOptionPane.showMessageDialog(null, texto);
        }).start();
    }

}
