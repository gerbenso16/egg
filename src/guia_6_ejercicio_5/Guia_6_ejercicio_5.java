package guia_6_ejercicio_5;

import entidades.cuenta;
import entidades.usuarios;
import servicio.servicioCuenta;
import servicio.servicioUsuarios;


public class Guia_6_ejercicio_5 {


    public static void main(String[] args) {
        servicioUsuarios a1 = new servicioUsuarios();
        
        usuarios user1 = a1.altaUsuarios();
        
        
       // System.out.println(user1);
        
        servicioCuenta cta1 = new servicioCuenta();
        
        cuenta c1 = cta1.altaCuenta();
        
        System.out.println(c1);
        
    }
    
}
