/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Controlador;
package main.java.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import main.java.model.Cargador;
import main.java.resources.Compra;
import main.java.view.CargaStock;
import main.java.view.CompraView;
import main.java.view.CompraTickets_v1;
import main.java.view.ConsultaStock;
import main.java.view.HomeEmpleado;
import main.java.view.Home;
import main.java.view.HomeAdmin;
import main.java.view.HomeCliente;
import main.java.view.Login;
import main.java.view.Pago;
import main.java.view.RecibirTiket;
import main.java.view.FormaPago;
import main.java.view.Recibo;
import main.java.view.*;

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

  
  public void iniciar() { // OK!
  }

  
  public void cambiarALogin(Home v) {// OK!
    v.setVisible(false);
    Login l = new Login(this);
    l.setVisible(true);
  }

  
  public void cambiarAHome2(Home v) { // OK!
  }

  
  public void cambiarAHome(Login l) { // OK!
    l.setVisible(false);
    Home h = new Home();
    h.cambiarController(this);
    // h.initComponents();
    h.setVisible(true);
  }

  
  public void cambiarAPago(FormaPago fp) {// OK!
  }

  
  public void cambiarAFormaPago(Pago p) {// OK!
  }

  
  public Cargador getModel() {// OK!
    return model;
  }

  
  public void cambiarAHome2(Login l) {// OK!
    l.setVisible(false);
    HomeAdmin cs = new HomeAdmin(this);
    cs.setVisible(true);
  }

  
  public boolean esValido(String a, String b) {
    try {
      return model.validarAdmin(a, b);
    } catch (SQLException e) {
      return false;
    }
    // return true;
  }

  
  public void cambiarALogin(HomeAdmin h) {// OK!
    h.setVisible(false);
    Login l = new Login(this);
    l.setVisible(true);
  }

  
  public void cambiarACargaStock(HomeAdmin h) {// OK!
    h.setVisible(false);
    CargaStock cs = new CargaStock(this, getModel());
    ConsultaStock cos = new ConsultaStock(this, getModel());
    cs.setVisible(true);
    cos.setVisible(true);
  }

  
  public void cambiarAConsultaStock(HomeAdmin h) {// OK!
    h.setVisible(false);
    ConsultaStock cs = new ConsultaStock(this, getModel());
    cs.setVisible(true);
  }

  public void cambiarAHomeAdmin(ConsultaStock cs) {// OK!
    cs.setVisible(false);
    HomeAdmin h = new HomeAdmin(this);
    h.setVisible(true);
  }

  public void cambiarAHomeAdmin(CargaStock cs) {// OK!
    cs.setVisible(false);
    HomeAdmin h = new HomeAdmin(this);
    h.setVisible(true);
  }

  public void cambiarAPelicula(HomeEmpleado gc) {// OK!
  }

  public void cambiarAHome(HomeEmpleado gc) {// OK!
  }

  public void cambiarAFormaPago(CompraView c) {// OK!
  }

  public void cambiarACompraTickets(CompraView c) {// OK!
  }

  public void cambiarACompra(FormaPago fp) {// OK!
  }

  public void cambiarAHome2(CompraTickets_v1 compraTickets_v1) {// OK!
  }

  public void cambiarACompra(CompraTickets_v1 ct) {// OK!
  }

  public void cambiarAConfirma(FormaPago fp) {// OK!
  }

  public void cambiarAConfirma(Pago p) {// OK!
  }

  public void cambiarAFormaPago(Recibo r) {// OK!
  }

  public void cambiarAHome2(Recibo r) {// OK!
  }

  public void cambiarAPelicula(HomeCliente hc) {// OK!
  }

  public void cambiarARecTick(HomeEmpleado gc) {// OK!
  }

  public void cambiarAHomeEmpleado(RecibirTiket rt) {
  }

  public ResultSet getRSProd(String s) {
    try {
      return model.CargarStock();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public boolean agregarStock(int IDprodNom, int cant) {
    try {
      model.agregarStock(IDprodNom, cant);
      return true;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean quitarStock(int nombre, int cant) {
    try {
      model.quitarStock(nombre, cant);
      return true;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean addProducto(String nombre, double precio, String string, String string2) {
    try {
      model.creaProducto(nombre, precio, string, string2);
      return true;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean clearProducto(int text) {
    try {
      model.borraProducto(text);
      return true;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public ResultSet getRSStock() {// OK!!
    return null;
  }

  public ResultSet setPelisBox() {
    return null;
  }

  public boolean esDisponible(int idPelicula, int idAsiento) {
    return false;
  }

  public void iniciarCompra(int idPelicula, String fila, int columna) {
  }

  public Compra getCompraActual() {
    return null;
  }

  public boolean cantStock(int id, int cantidad) {
    int stock;
    try {
      stock = this.getModel().getStockProducto(id);
      if (cantidad > stock) {
        return false;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return true;
  }

  public int getIdProd(String nombre) {
    int i = 0;
    try {
      return model.getIdPorNombre(nombre);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return i;
  }
}