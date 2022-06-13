
package cajeroautomatico;

import java.util.LinkedList;

public class Retiro {
    LinkedList lista = new LinkedList();
    
        int disponibleMil = 100;
        int disponibleQuini = 100;
        int disponibleCien = 100;
        int disponibleCincuenta = 100;      
        int cant1000 = 0;
        int cant500 = 0;
        int cant100 = 0;
        int cant50 = 0;
        int parcial = 0;

    public LinkedList getLista() {
        return lista;
    }
    
    public void extraer(int plataRetira, int dni){        
        Retiro r = new Retiro();
             
        String data = "DNI: " + dni + " - ";
        
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
                    data = data + String.valueOf(cant1000) + " billetes de $1000 ";       
                }
                else if (plataRetira >= 500 && (plataRetira / 500) < disponibleQuini){
                    cant500 = plataRetira / 500;
                    parcial = cant500 * 500;
                    plataRetira = plataRetira - parcial;
                    parcial = 0;
                    disponibleQuini = disponibleQuini - cant500;

                    System.out.println(cant500 + " billetes de $500");
                    data = data + String.valueOf(cant500) + " billetes de $500 ";
                }
                else if (plataRetira >= 100 && (plataRetira / 100) < disponibleCien){
                    cant100 = plataRetira / 100;
                    parcial = cant100 * 100;
                    plataRetira = plataRetira - parcial;
                    parcial = 0;
                    disponibleCien = disponibleCien - cant100;

                    System.out.println(cant100 + " billetes de $100");
                    data = data + String.valueOf(cant100) + " billetes de $100 ";
                }
                else if (plataRetira >= 50 && (plataRetira / 50) < disponibleCincuenta){
                    cant50 = plataRetira / 50;
                    parcial = cant50 * 50;
                    plataRetira = plataRetira - parcial;
                    disponibleCincuenta = disponibleCincuenta - cant50;

                    System.out.println(cant50 + " billetes de $50");
                    data = data + String.valueOf(cant50) + " billetes de $50 ";
                }
                else if(plataRetira > 0 && plataRetira < 50){
                    System.out.println("Un total de $" + plataRetira + " no se pudo extraer. El dinero vuelve a tu cuenta.");
                    plataRetira = 0;
                }
            }
            lista.add(data); // Lo pongo aca para que no salga en el reporte cuando el cajero no cuenta con dinero
        }
        else{
            System.out.println("Lo sentimos, en este momento el cajero no cuenta con el efectivo necesario para realizar su extraccion.");
        }
        
        System.out.println(lista);
    }
    
    
}
