/*

 */
public class MiExcepcion extends Exception {
    /*Constructor que regresa el mensaje que se quiere mostrar cuando ocurre 
    la excepcion y se lo pasa entonces al constructor de la clase Exception*/
    
    public MiExcepcion(String mensajeError){
        super(mensajeError);
    }
}
