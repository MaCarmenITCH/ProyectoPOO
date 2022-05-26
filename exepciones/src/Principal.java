
import java.util.Scanner;

/* Todas las excepciones derivan de la clase EXEPTION
 */
public class Principal {

    public static void main(String[] args) {
        combinandoExcepciones();
        //  primeraExcepcion();
    }

    //Se crea el metodo para llamar o generar mi primera excepcion
    /*  public static void primeraExcepcion(){
     String dato="";
     int convertido = 0;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Introduzca un número, se leerá como cadena y lo convertirá en número");
     dato = teclado.nextLine();
    
    /* Cuando se requiere convertir una cadena que no es numero a entero se produce un error.
     Dentro de la sentencia try se colocan las instrucciones que podrian generar un error */
    /*  try {
     convertido = Integer.parseInt(dato);
     }
     catch (Exception e){
     /*Con catch se atrapa la excepcion y se puede realizar alguna acción*/
    /*  } finally {
     System.out.println("Se ejecuta haya excepciones o no, puede servir para cerrar un archivo o "+ 
     "una conección a BD");
     }
     System.out.println("El dato invertido * 10 = " + convertido*10);
     }*/
    public static void combinandoExcepciones() {
        String datoLeido = " ";
        String datoAuxiliar = null;
        int datoConvertido;

        Scanner teclado = new Scanner(System.in);
        datoLeido = teclado.nextLine();

        if (datoLeido.length() > 5) {
            datoAuxiliar = "hola";

        }
        try {
            //Puede generar un error NullPointer
            int longitud = datoAuxiliar.length();
            //Puede generar error de conversión
            datoConvertido = Integer.parseInt(datoAuxiliar);

        } catch (NullPointerException e) {
            System.out.println("Tabajando con un valor nulo");
        } catch (NumberFormatException e) {
            System.out.println("No se pudo realizar la conversión");
        }
    }

    //Se crea metodo a convertir

    public static int convertir(String dato) throws NumberFormatException {
        /* Se crea un mensje en una excepcion ya existente, cuando un 
         metodo va a regresar una excepcion se indica con la sentencia throw 
         seguida de la clase de la excepcion que se va a regresar */

        int convertido = 0;
        convertido = Integer.parseInt(dato);
        return convertido;
    }
    /*Se crea metodo para atrapar la excepcion; éste metodo invoca al metodo 
     que lanza la excepcion */

    public static void atrapandoExcepciones() {
        try {
            System.out.println("Convertir: " + convertir("palabra"));
        } catch (NumberFormatException e) {
            System.err.println("No se puede realizar la conversión");
        }
    }
}
