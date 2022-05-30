
import Manager.CajeroManager;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CajeroProgram {
    
    public static void main(String args[]){
     
        Logger logger = Logger.getLogger(CajeroProgram.class.getName()); 
//      Clase utilizada para logear mensajes 

        String version = "1.03.01";
        
        CajeroManager _cManager = new CajeroManager();
//      1 -> numero designado al aplicativo
//      03 -> numero designado a la branch (01 es el main y 02 es branch Ivo)
//      00 -> numero de version del aplicativo(00 porque es la inicial)
        
        logger.log(Level.INFO, "Iniciando Cajero Automatico");
        logger.log(Level.INFO, "Version number: " + version);
        
//      Iniciamos el aplicativo
        _cManager.start();
        
        
        
    } 
    
}
