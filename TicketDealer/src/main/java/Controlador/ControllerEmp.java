/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Cargador;
import Vistas.Home;
import Vistas.Login;

/**
 *
 * @author Esteban
 */
public class ControllerEmp {
    Cargador model;
    Home view;
	
	public ControllerEmp(Cargador model, Home view){
		this.model=model;
		this.view=view;
	}
      //  @Override
	public void iniciar() {//OK!
	}

        public void cambiarALogin(Home v) {//OK!
		v.setVisible(false);
		Login l = new Login(this);
        l.setVisible(true);
        //setborn("a");
	}
}
