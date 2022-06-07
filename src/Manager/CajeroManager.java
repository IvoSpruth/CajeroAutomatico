package Manager;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CajeroManager {
    
    boolean run = true;
    Logger logger = Logger.getLogger(CajeroManager.class.getName());  
    Scanner in = new Scanner(System.in);
    
    int disponibleMil = 100;
    int disponibleQuini = 0;
    int disponibleCien = 10;
    int disponibleCincuenta = 10;      
    int cant1000 = 0;
    int cant500 = 0;
    int cant100 = 0;
    int cant50 = 0;
    int parcial = 0;

    public CajeroManager(){}

    public void start(){
        
        logger.log(Level.INFO, "Inicio del programa");

        while(run){                       

            logger.log(Level.INFO, "Bienvenido a BANELCO");
            logger.log(Level.INFO, "Por favor, ingrese nro DNI");

            
        }        
    }
    
    
}
