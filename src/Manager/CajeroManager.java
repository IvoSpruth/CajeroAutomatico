package Manager;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CajeroManager {
    
    boolean run = true;
    Logger logger = Logger.getLogger(CajeroManager.class.getName());  
    Scanner entrada = new Scanner(System.in);

    public CajeroManager(){}

    public void start(){      

        while(run){                       

            logger.log(Level.INFO, "Bienvenido a BANELCO");
            logger.log(Level.INFO, "Por favor, ingrese nro DNI");
            
        }        
    }
    
    
}
