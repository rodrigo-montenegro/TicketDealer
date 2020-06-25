/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Cargador;
import Vistas.ConsultaStock;
import Vistas.Home;
import Vistas.HomeAdmin;
import Vistas.HomeEmpleado;
import Vistas.Login;
import java.sql.ResultSet;
import java.sql.SQLException;

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
      //  @Override
	public void cambiarAHome2(Login l) {//OK!
		l.setVisible(false);
		HomeEmpleado gc =new HomeEmpleado(this,this.getModel());
		gc.setVisible(true);	
	}
	
	//@Override
	public void cambiarAHome(HomeEmpleado gc) {//OK!
		gc.setVisible(false);
		Home h= new Home();
		h.cambiarController(this);
		//h.initComponents();
		h.setVisible(true);
	}
	
	//@Override
	public void cambiarAHome2(CompraTickets_v1 ct) {
		ct.setVisible(false);
		HomeEmpleado gc =new HomeEmpleado(this,this.getModel());
		gc.setVisible(true);
	}

	
	public void cambiarAHome2(Home v) {//OK!
	}
        
	public void cambiarACompraTickets(CompraView c) {//OK!
		c.setVisible(false);
		CompraTickets_v1 ct;
		try {
			ct = new CompraTickets_v1(this);
		} catch (SQLException e) {
			ct=null;
			e.printStackTrace();
		}
		ct.setVisible(true);
	}

	
	public void cambiarAPago(FormaPago fp) {//OK!
		fp.setVisible(false);
		Pago p= new Pago(this);
		p.setVisible(true);
	}

	
	public void cambiarAFormaPago(Pago p) {//OK!
		p.setVisible(false);
		FormaPago fp=new FormaPago(this);
		fp.setVisible(true);
	}

	
	public Cargador getModel() {//OK!
		return model;
	}

	
	public boolean esValido(String a, String b) {
		try{
			return model.validarEmpleado(a,b);}
		catch (SQLException e){
			return false;
		}
		//return true;
	}

	public void cambiarALogin(HomeAdmin home) {//OK!
	}

	
	public void cambiarACargaStock(HomeAdmin h) {//OK!
	}

	
	public void cambiarAConsultaStock(HomeAdmin h) {//OK!
	}

	
	public void cambiarAHomeAdmin(ConsultaStock cs) {//OK!
	}

	
	public void cambiarAHomeAdmin(CargaStock cs) {//OK!
		}
        
	public void cambiarAFormaPago(CompraView c) {//OK!
		c.setVisible(false);
		FormaPago fp= new FormaPago(this);
		fp.setVisible(true);
	}

	
	public void cambiarACompra(FormaPago fp) {//OK!
		fp.setVisible(false);
		CompraView c;
		try {
			c = new CompraView(this);
		} catch (SQLException e) {
			e.printStackTrace();
			c=null;
		}
		c.setVisible(true);
	}

	
	public void cambiarACompra(CompraTickets_v1 ct) {//OK!
		ct.setVisible(false);
		CompraView c;
		try {
			c = new CompraView(this);
		} catch (SQLException e) {
			c=null;
			e.printStackTrace();
		}
		c.setVisible(true);
	}
        
	public void cambiarAPelicula(HomeEmpleado gc) {
		gc.setVisible(false);
		CompraTickets_v1 ct;
		try {
			ct = new CompraTickets_v1(this);
		} catch (SQLException e) {
			ct=null;
			e.printStackTrace();
		}
		ct.setVisible(true);
	}

	
	public void cambiarAConfirma(FormaPago fp) {
		fp.setVisible(false);
		Recibo r=new Recibo(this);
		r.setVisible(true);
	}

	
	public void cambiarAConfirma(Pago p) {//OK!
		p.setVisible(false);
		Recibo r=new Recibo(this);
		r.setVisible(true);
	}

	
	public void cambiarAFormaPago(Recibo r) {//OK!
		r.setVisible(false);
		FormaPago fp=new FormaPago(this);
		fp.setVisible(true);
	}

	
	public void cambiarAHome2(Recibo r) {//OK!
		r.setVisible(false);
		HomeEmpleado gc= new HomeEmpleado(this,this.getModel());
		gc.setVisible(true);
	}
	
	
	public void cambiarAPelicula(HomeCliente hc) {//OK!
	}

	
	public void cambiarARecTick(HomeEmpleado gc) {
		gc.setVisible(false);
		RecibirTiket rt= new RecibirTiket(this);
		rt.setVisible(true);
	}

	
	public void cambiarAHomeEmpleado(RecibirTiket rt) {
		rt.setVisible(false);
		HomeEmpleado gc= new HomeEmpleado(this,this.getModel());
		gc.setVisible(true);
	}

	
	public ResultSet getRSProd(String s) {
		return null;
	}
	
	
	public boolean agregarStock(int nombre, int cant) {
		return false;
	}
        
	
	public boolean quitarStock(int nombre, int cant) {
		return false;
	}

	
	public boolean addProducto(String nombre, double precio, String string, String string2) {
		return false;
	}
	
	
	public boolean clearProducto(int text) {
		return false;
	}

	
	public ResultSet getRSStock() {
		try {
			return model.getCargaBox().CargarStock();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public ResultSet setPelisBox() {
		try {
			return model.getPeliculas();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean esDisponible(int idPelicula, int idAsiento) {
		try {
			return model.estaOcupado(idPelicula,idAsiento);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public void iniciarCompra(int idPelicula,String fila, int columna) {
		String codigoCompra= model.getObjCompra().getCodigo();
		try {
			model.comprarEntrada(idPelicula, codigoCompra,fila,columna);
			
			model.setOcupado(idPelicula, model.getIdAsiento(fila, columna));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public Compra getCompraActual() {
		return model.getObjCompraEmpleado();
	}

	
	public boolean cantStock(int id, int cantidad) {
		return false;
	}

	
	public int getIdProd(String nombre) {
		return 0;
	}
	
}
