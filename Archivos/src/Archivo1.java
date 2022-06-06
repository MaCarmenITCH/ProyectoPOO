
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**/
public class Archivo1 {

    public static void main(String[] args) {
        //Se inicia el tratamiento de las excepciones
        try {
            File objeto = new File("C:\\Users\\invitado\\Desktop\\Datos.txt");
            Scanner myReader = new Scanner(objeto);
            // Mientras encuentre lineas de texto las asignará al objeto creado
            String datos = (myReader.nextLine());
            while (myReader.hasNextLine());
            {
                System.out.println(datos);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }

}
