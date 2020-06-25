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
  public void cambiarAHome2(Home v) { // OK!
  }

  @Override
  public void cambiarAHome(Login l) { // OK!
    l.setVisible(false);
    Home h = new Home();
    h.cambiarController(this);
    // h.initComponents();
    h.setVisible(true);
  }

  @Override
  public void cambiarAPago(FormaPago fp) {// OK!
  }

  @Override
  public void cambiarAFormaPago(Pago p) {// OK!
  }

  @Override
  public Cargador getModel() {// OK!
    return model;
  }

  @Override
  public void cambiarAHome2(Login l) {// OK!
    l.setVisible(false);
    HomeAdmin cs = new HomeAdmin(this);
    cs.setVisible(true);
  }

  @Override
  public boolean esValido(String a, String b) {
    try {
      return model.validarAdmin(a, b);
    } catch (SQLException e) {
      return false;
    }
    // return true;
  }

  @Override
  public void cambiarALogin(HomeAdmin h) {// OK!
    h.setVisible(false);
    Login l = new Login(this);
    l.setVisible(true);
  }

  @Override
  public void cambiarACargaStock(HomeAdmin h) {// OK!
    h.setVisible(false);
    CargaStock cs = new CargaStock(this, getModel());
    ConsultaStock cos = new ConsultaStock(this, getModel());
    cs.setVisible(true);
    cos.setVisible(true);
  }

  @Override
  public void cambiarAConsultaStock(HomeAdmin h) {// OK!
    h.setVisible(false);
    ConsultaStock cs = new ConsultaStock(this, getModel());
    cs.setVisible(true);
  }

  @Override
  public void cambiarAHomeAdmin(ConsultaStock cs) {// OK!
    cs.setVisible(false);
    HomeAdmin h = new HomeAdmin(this);
    h.setVisible(true);
  }

  @Override
  public void cambiarAHomeAdmin(CargaStock cs) {// OK!
    cs.setVisible(false);
    HomeAdmin h = new HomeAdmin(this);
    h.setVisible(true);
  }

  @Override
  public void cambiarAPelicula(HomeEmpleado gc) {// OK!
  }

  @Override
  public void cambiarAHome(HomeEmpleado gc) {// OK!
  }

  @Override
	public void cambiarAFormaPago(CompraView c) {//OK!
	}