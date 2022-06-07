
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class aleatorios {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter dato = new FileWriter("num.txt");
            PrintWriter pw = new PrintWriter(dato);
            for (int i = 0; i < 10; i++) {
                pw.print(i + 1);
                System.out.println(i + 1);
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
