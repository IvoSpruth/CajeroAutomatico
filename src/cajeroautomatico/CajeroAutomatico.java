package cajeroautomatico;
import java.util.Scanner;


public class CajeroAutomatico {
   
    public static void main(String[] args) {
        
        Retiro r = new Retiro();
        Scanner in = new Scanner(System.in);
        boolean activo = true;
        
        while (activo = true){
            System.out.println("Ingrese su DNI:");
            int dni = in.nextInt();
             
            System.out.println("¿Cuanto dinero desea extraer?");
            int plataRetira = in.nextInt();
        
            r.extraer(plataRetira, dni);
        }
        
    }
    
}
