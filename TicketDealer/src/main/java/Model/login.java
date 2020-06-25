/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Vistas.*;
import Controlador.*;
import Resources.*;
/**
 *
 * @author perez
 */
public class login {
String user;
String pass;
String tipo;
       
    public login(String user, String pass, String tipo){
    this.user = user;
    this.pass = pass;
    this.tipo = tipo;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getTipo() {
        return tipo;
    }
    
}
