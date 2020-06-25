/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Init;
import  Vistas.*;
import  Controlador.*;
import  Model.*;
/**
 *
 * @author macbook
 */
public class Main {
    
    public static void main(String args[]) {
        System.out.println("Probando");
        System.out.println("Commit Seba");
        System.out.println("Commit Santi");
        Iniciar();
    }
    public static void Iniciar(){
        Home h= new Home();
	Cargador c=new Cargador();
	c.cargarAdmin(a.getUsuario(),a.getPass());
	ControllerInterface controller = new ControllerCliente(c,h);
	h.cambiarController(controller);
	controller.iniciar();
        }
    public static void pruebacambiar(){
        //controlador.CambiarHomeACliente(home, logcliente);
    }
}
