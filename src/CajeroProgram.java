
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CajeroProgram {
    
    public static void main(String args[]){
    
        boolean run = true;
        Logger logger = Logger.getLogger(CajeroProgram.class.getName());  
        Scanner entrada = new Scanner(System.in);
        
        
        logger.log(Level.INFO, "Inicio del programa");
        
        while(run){                       
            
            logger.log(Level.INFO, "Bienvenido a BANELCO");
            logger.log(Level.INFO, "Por favor, ingrese nro DNI");
            
            try {
                
                Thread.sleep(60000);
                
            } catch (Exception ex) {
                  logger.log(Level.SEVERE, "Ocurrio un error");
            }
        }
        
    } 
    
}
