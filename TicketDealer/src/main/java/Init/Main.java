/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Init;
import  Vistas.*;
import  Controlador.*;
/**
 *
 * @author macbook
 */
public class Main {
    
    public static void main(String args[]) {
        System.out.println("Probando");
        Iniciar();
    }
    public static void Iniciar(){
        Controlador controlador = new Controlador();
        Home home = new Home();
        LogCliente logcliente = new LogCliente();
        }
    public static void pruebacambiar(){
        //controlador.CambiarHomeACliente(home, logcliente);
    }
}
