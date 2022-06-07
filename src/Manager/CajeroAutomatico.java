package Manager;

import java.util.Scanner;

public class CajeroAutomatico {
    
    public static void main(String[] args) {
        int disponibleMil = 100;
        int disponibleQuini = 0;
        int disponibleCien = 10;
        int disponibleCincuenta = 10;      
        int cant1000 = 0;
        int cant500 = 0;
        int cant100 = 0;
        int cant50 = 0;
        int parcial = 0;
        
        Scanner in = new Scanner(System.in);
        
        int dineroTotal = (disponibleCien*100) + (disponibleCincuenta*50) + (disponibleMil*1000) + (disponibleQuini*500);
        System.out.println("La cantidad de dinero es de " + dineroTotal);
    
        System.out.println("Ingrese su DNI:");
        int dni = in.nextInt();
    
        System.out.println("¿Cuanto dinero desea extraer?");
        int plataRetira = in.nextInt();
        
        if ((plataRetira / 1000) < disponibleMil || (plataRetira / 500) < disponibleQuini || (plataRetira / 100) < disponibleCien || (plataRetira / 50) < disponibleCincuenta){
            System.out.println("Usted ha retirado: ");
            
            while (plataRetira > 0){    
                if (plataRetira >= 1000 && (plataRetira / 1000) < disponibleMil){
                    cant1000 = plataRetira / 1000;
                    parcial = cant1000 * 1000;
                    plataRetira = plataRetira - parcial;
                    parcial = 0;
                    disponibleMil = disponibleMil - cant1000;

                    System.out.println(cant1000 + " billetes de $1000");
                }
                else if (plataRetira >= 500 && (plataRetira / 500) < disponibleQuini){
                    cant500 = plataRetira / 500;
                    parcial = cant500 * 500;
                    plataRetira = plataRetira - parcial;
                    parcial = 0;
                    disponibleQuini = disponibleQuini - cant500;

                    System.out.println(cant500 + " billetes de $500");
                }
                else if (plataRetira >= 100 && (plataRetira / 100) < disponibleCien){
                    cant100 = plataRetira / 100;
                    parcial = cant100 * 100;
                    plataRetira = plataRetira - parcial;
                    parcial = 0;
                    disponibleCien = disponibleCien - cant100;

                    System.out.println(cant100 + " billetes de $100");
                }
                else if (plataRetira >= 50 && (plataRetira / 50) < disponibleCincuenta){
                    cant50 = plataRetira / 50;
                    parcial = cant50 * 50;
                    plataRetira = plataRetira - parcial;
                    disponibleCincuenta = disponibleCincuenta - cant50;

                    System.out.println(cant50 + " billetes de $50");
                }
                else if(plataRetira > 0 && plataRetira < 50){
                    System.out.println("Un total de $" + plataRetira + " no se pudo extraer. El dinero vuelve a tu cuenta.");
                    plataRetira = 0;
                }
            }
        }
        else{
            System.out.println("Lo sentimos, en este momento el cajero no cuenta con el efectivo necesario para realizar su extraccion.");
        }    
    }
    
}

    

