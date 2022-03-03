
package servicio;

import entidades.usuarios;
import java.util.Scanner;



public class servicioUsuarios{
    public usuarios altaUsuarios(){
    
    
    Scanner leer = new Scanner(System.in);
    usuarios user1 = new usuarios();
    System.out.println("Ingrese el nombre de usuario");   
    user1.setNombre(leer.next());
    System.out.println("Ingrese el apellido");
    user1.setApellido(leer.next());
        System.out.println("Ingrese el DNI");
    user1.setDni(leer.nextInt());
    
    
    
    return user1;
   
 }
    public void datoUsuario(usuarios user1){
    
        user1.getDni();
    
    }
    
    
    
}