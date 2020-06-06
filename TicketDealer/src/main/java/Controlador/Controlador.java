/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Init.Main;
import Vistas.*;
/**
 *
 * @author macbook
 */
public class Controlador {
    public void CambiarHomeACliente(Home home, LogCliente logcliente){
        home.setVisible(false);
        logcliente.setVisible(true);
    }
}
