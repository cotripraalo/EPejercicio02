/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epejercicio02;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EPejercicio02 {
   // private static Object telefonomovil01;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       boolean esc =false;
        telefonomovil telefonomovil01 = new telefonomovil();
        telefonomovil01.setPantalla("4.7");
        telefonomovil01.setCamara("8MP");
        telefonomovil01.setProcesador("1.4GHZ");
        
          telefonomovil telefonomovil02 = new telefonomovil();
        telefonomovil02.setPantalla("4.7");
        telefonomovil02.setCamara("8MP");
        telefonomovil02.setProcesador("1.4GHZ");
        
        telefonomovil telefonomovil03 = new telefonomovil();
        telefonomovil03.setPantalla("4.7");
        telefonomovil03.setCamara("8MP");
        telefonomovil03.setProcesador("1.4GHZ");
        
        ArrayList listatelefonomovil = new ArrayList();
        
         listatelefonomovil.add(telefonomovil01);
         listatelefonomovil.add(telefonomovil02);
         listatelefonomovil.add(telefonomovil03);
         
         
         
            System.out.println("Elija una de las opciones");
            System.out.println("A.Telefonos moviles");
            System.out.println("[1] Samsung S7");
            System.out.println("[2] iPhone 6");
            System.out.println("[3] Huawei P8");
            System.out.println("Seleccione un modelo: ");
             char opcion = input.next().charAt(0);
            
                 switch (opcion) {
                    case '1':
                        System.out.println("A.Caracteristicas");
                        System.out.println("Pantalla: 8.4");
                        System.out.println("Camara: 8MP ");
                        System.out.println("Procesador: 1.40Ghz");
                        break;
                    case '2':
                        System.out.println("Pantalla: 7.4");
                        System.out.println("Camara: 7MP ");
                        System.out.println("Procesador: 1.40Ghz");
                        break;
                    case '3':
                        System.out.println("Pantalla: 8.4");
                        System.out.println("Camara: 8MP ");
                        System.out.println("Procesador: 1.40Ghz");
                        break;
                 
                       default:
                        System.out.println("Solo números entre 1 y 3");
               }
                 
            
                 
            System.out.println("B.Operadores");
            System.out.println("[C] Claro");
            System.out.println("[M] Movistar");
            System.out.println("[B] Bitel");
            System.out.println("Seleccione un operador: ");
             char operador = input.next().charAt(0);
            
                 switch (operador)
                 {
                    case 'C':
                        System.out.println("  Claro Max 70 \n" +
                                        "    - Precio S/ 99\n" +
                                  "    - Minutos Ilimitados\n" +
                                      "    - RPC Ilimitados\n" +
                                       "    - Internet 5 GB\n" +
                                         "    - SMS Ilimitados");
                       
                        break;
                    case 'M':
                        System.out.println("Movistar Max 149\n" +
                                         "    - Precio S/ 99\n" +
                                   "    - Minutos Ilimitados\n" +
                                       "    - RPM Ilimitados\n" +
                                        "    - Internet 3 GB\n" +
                                         "    - SMS Ilimitados");
                       break;
                    case 'B':
                        System.out.println("  Bitel Max 30\n" +
                                        "    - Precio S/ 99\n" +
                                  "    - Minutos Ilimitados\n" +
                                      "    - SMS Ilimitados\n" +
                                          "    - Internet 2 GB");
                        
                        break;
                 
                       default:
                        System.out.println("Error");
               
                 
            
    }

    }
}
              
    
            
        
 
    
 
  

        


        
        
        
  
