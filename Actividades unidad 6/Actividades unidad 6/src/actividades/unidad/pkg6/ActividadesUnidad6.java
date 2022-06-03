/* canExecute ().- devuelve un true o un false en funcion de si el archido es ejecutable o no. 
 canWrite().- Si se puede escribir o no en el archivo. 
 crateNewFile().- crea un archivo vacío con el nombre que se le indique. 
 delete().- borra el archivo. 
 exists().- determina que el archivo representado por FILE en la ruta que le hayamos pasado existe si o no. 
 getName().- Otiene el nombre del archivo o carpeta. 
 getParent().- Devuelve una cadena con la ruta de la carpeta del archivo. 
 isDirectory().- Indica si el objeto actual representa a una carpeta. 
 isFile().- INDICA SI EL OBJETO ACTUAL REPRESENTA a un archivo. 
 length().- El tamaño del archivo en bytes. 
 list().- los nombres de los archivos y carpeta hijos de una carpeta. 
 listFiles().- Igual que el anterior pero devuelve objetos FILE para cada archivo o carpeta. 
 mkdir().- crea una carpeta. */
package actividades.unidad.pkg6;

import java.io.File;  

public class ActividadesUnidad6 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\invitado\\Desktop\\Datos.txt");
        File file1 = new File("C:\\Users\\invitado\\Downloads\\Actividades unidad 6");
        
        System.out.println("Existencias: "+file.exists() + "" + file1.exists());
        // para saber si es directorio(devuelve false o true)
        System.out.println("Indica si el archivo es un directorio " + file.isDirectory());
        //Para saber la fecha de modificacion
        System.out.println("Indica la fecha de modificación " +file.lastModified()+ "" + file1.lastModified());
        //para saber el nombre del archivo
        System.out.println("Indica el nombre " +file.getName()+ "" + file1.getName());
        //para saber la ruta
        System.out.println("Indica a ruta " +file.getPath()+ "" + file1.getPath());
        // para saber el tamaño en bites que ocupa en el archivo
        System.out.println("Indica el tamaño " +file.length()+ "" + file1.length());
        // para saber si el archivo es de lectura (f/v)
        System.out.println("Indica si si se puede leer " +file.canRead()+ "" + file1.canRead());
        //para eliminar un archivo
        // System.out.println(file.delete());
        //si fuera un directorio y queremos saber los archivos que tiene 
         for(String string:file.list()){
         System.out.println(string);
         } 
         for(String string:file1.list()){
         System.out.println(string);
         }
    }
    
}
