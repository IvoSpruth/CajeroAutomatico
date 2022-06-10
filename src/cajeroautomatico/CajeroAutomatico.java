package cajeroautomatico;
import java.util.Scanner;


public class CajeroAutomatico {
   
    public static void main(String[] args) {
        
        Retiro r = new Retiro();
        Scanner in = new Scanner(System.in);
        boolean activo = true;
        
        while (activo = true){
            System.out.println("Ingrese su DNI:");
            while (!in.hasNextInt()){
                System.out.println("Ingrese un DNI valido:");
                in.next();
            }
            int dni = in.nextInt();
 
            System.out.println("¿Cuanto dinero desea extraer?");
            while (!in.hasNextInt()){
                System.out.println("Ingrese una cantidad de dinero valida:");
                in.next();
            }            
            int plataRetira = in.nextInt();
        
            r.extraer(plataRetira, dni);
        }
        
    }
    
}
