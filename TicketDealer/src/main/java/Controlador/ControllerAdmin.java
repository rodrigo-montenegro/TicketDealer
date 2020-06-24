/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Esteban
 */
public class ControllerAdmin implements ControllerInterface {
  Cargador model;
  Home view;

  public ControllerAdmin(Cargador model, Home view) {
    this.model = model;
    this.view = view;
  }

  @Override
  public void iniciar() { // OK!
  }

  @Override
  public void cambiarALogin(Home v) {// OK!
    v.setVisible(false);
    Login l = new Login(this);
    l.setVisible(true);
  }

  @Override
	public void cambiarAHome2(Home v) {	//OK!
	}
