
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*

 */
public class Imagen {

    public static void main(String[] args) {
        Image imagenes = null;
        //Se trata la excepcion, se inicializa y signa el url de la imagen 
        try {
            URL url = new URL ("http://www.larevista.ec/orientacion/psicologia/pedir-ayuda-no-es-debilidad");
            imagenes = ImageIO.read(url);
        }catch(IOException e){
            e.printStackTrace();

            //Mostrar imagen
            JFrame marco = new JFrame();
            marco.setSize(500,500);
            JLabel label = new JLabel(new ImageIcon(imagenes));
            marco.add(label);
            marco.setVisible(true);
        }
    }

}
