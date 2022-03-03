
package servicio;

import entidades.cuenta;
import java.util.Scanner;


public class servicioCuenta {
    
    public cuenta altaCuenta(){
    int num1;
    int bandera=0;    
   
    Scanner leer = new Scanner(System.in);
    
    cuenta c1 = new cuenta();
    System.out.println(" Ingrese el numero de cuenta ");
    c1.setNumerodecuenta(leer.nextInt());
   
       do{ 
        System.out.println("elija una opcion");
        System.out.println("1 Ingresar Dinero");
        System.out.println("2 Extraer Dinero");
        System.out.println("3 Extraccion Rapida");
        System.out.println("4 Consultar Saldo");
        System.out.println("5 Consultar Datos"); 
        System.out.println("5 Cerrar Sesión"); 
           num1 = leer.nextInt();
       switch (num1){
           
            case 1: System.out.println("Ingresar Monto");
                    c1.setIngreso(leer.nextDouble());
                    c1.setSaldo_actual(c1.getIngreso()+c1.getSaldo_actual());
                    break;
            case 2: System.out.println("Extraer Dinero");
                    c1.setRatirar(leer.nextDouble());
                    c1.setSaldo_actual(c1.getSaldo_actual() - c1.getRatirar());
                    break;
            case 3: System.out.println("Extraccion Rapida");
                    c1.setExtraxccionRapida(leer.nextDouble());
                    c1.setSaldo_actual(c1.getSaldo_actual()/20*100 - c1.getExtraxccionRapida());
                    break;
            case 4: System.out.println("Consultar Saldo");
                    System.out.println(c1);
                    break;
            case 5: System.out.println("Consultar Datos");
                    System.out.println("Numero de cuenta "+c1.getNumerodecuenta()+" Saldo actual " + c1.getSaldo_actual());
                    break;
            case 6: System.out.println("Hasta Pronto...");        
                    if (num1 == 6) {
                    bandera = 6;
                        break;
                }
            
            default: System.out.println("Elija una opcion valida");
       
       }
       
 } 
       while (bandera != 6);
    return c1;
        
 }
   
}
    
    

