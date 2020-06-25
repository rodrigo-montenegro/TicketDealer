/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.*;
import Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Esteban
 */
public class ControllerEmp implements ControllerInterface{
    Cargador model;
    Home view;
	
	public ControllerEmp(Cargador model, Home view){
		this.model=model;
		this.view=view;
	}
    @Override
	public void iniciar() {//OK!
	}

    @Override
        public void cambiarALogin(Home v) {//OK!
		v.setVisible(false);
		Login l = new Login(this);
        l.setVisible(true);
        //setborn("a");
	}
    @Override
	public void cambiarAHome2(Login l) {//OK!
		l.setVisible(false);
		HomeEmpleado gc =new HomeEmpleado(this,this.getModel());
		gc.setVisible(true);	
	}
	
    @Override
	public void cambiarAHome(HomeEmpleado gc) {//OK!
		gc.setVisible(false);
		Home h= new Home();
		h.cambiarController(this);
		//h.initComponents();
		h.setVisible(true);
	}
	public void cambiarAHome2(CompraTickets ct) {
		ct.setVisible(false);
		HomeEmpleado gc =new HomeEmpleado(this,this.getModel());
		gc.setVisible(true);
	}

	
    @Override
	public void cambiarAHome2(Home v) {//OK!
	}
        
	public void cambiarACompraTickets(HomeCliente c) {//OK!
		c.setVisible(false);
		CompraTickets ct;
                ct = new CompraTickets(this);
		ct.setVisible(true);
	}

	
    @Override
	public void cambiarAPago(FormaDePago fp) {//OK!
		fp.setVisible(false);
                Pago p= new Pago(this);
		p.setVisible(true);
	}

	
    @Override
	public void cambiarAFormaPago(Pago p) {//OK!
		p.setVisible(false);
		FormaDePago fp=new FormaDePago(this);
		fp.setVisible(true);
	}

	
    @Override
	public Cargador getModel() {//OK!
		return model;
	}

	
    @Override
	public boolean esValido(String a, String b) {
		try{
			return model.validarEmpleado(a,b);}
		catch (SQLException e){
			return false;
		}
		//return true;
	}

    @Override
	public void cambiarALogin(HomeAdmin home) {//OK!
	}

	
    @Override
	public void cambiarACargaStock(HomeAdmin h) {//OK!
	}

	
    @Override
	public void cambiarAConsultaStock(HomeAdmin h) {//OK!
	}

	
    @Override
	public void cambiarAHomeAdmin(ConsultaStock cs) {//OK!
	}

	
    @Override
	public void cambiarAHomeAdmin(cargaStock cs) {//OK!
		}
        
    @Override
	public void cambiarAFormaPago(HomeCliente c) {//OK!
		c.setVisible(false);
		FormaDePago fp= new FormaDePago(this);
		fp.setVisible(true);
	}

	
    @Override
	public void cambiarACompra(FormaDePago fp) {//OK!
		fp.setVisible(false);
		HomeCliente c;
                c = new HomeCliente(this);
		c.setVisible(true);
	}

	
	public void cambiarACompra(CompraTickets ct) {//OK!
		ct.setVisible(false);
		HomeCliente c;
                c = new HomeCliente(this);
		c.setVisible(true);
	}
        
	public void cambiarATickets(HomeEmpleado gc) {
		gc.setVisible(false);
		CompraTickets ct;
                ct = new CompraTickets(this);
		ct.setVisible(true);
	}

	
	public void cambiarAConfirma(FormaDePago fp) {
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
		FormaDePago fp=new FormaDePago(this);
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
		ProcesarComprobante rt= new ProcesarComprobante(this);
		rt.setVisible(true);
	}

	
    @Override
	public void cambiarAHomeEmpleado(ProcesarComprobante rt) {
		rt.setVisible(false);
		HomeEmpleado gc= new HomeEmpleado(this,this.getModel());
		gc.setVisible(true);
	}

	
    @Override
	public ResultSet getRSProd(String s) {
		return null;
	}
	
	
    @Override
	public boolean agregarStock(int nombre, int cant) {
		return false;
	}
        
	
    @Override
	public boolean quitarStock(int nombre, int cant) {
		return false;
	}

	
    @Override
	public boolean addProducto(String nombre, double precio, String string, String string2) {
		return false;
	}
	
	
    @Override
	public boolean clearProducto(int text) {
		return false;
	}

	
    @Override
	public ResultSet getRSStock() {
		try {
			return model.getCargaBox().CargarStock();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
    @Override
	public ResultSet setPelisBox() {
		try {
			return model.getPeliculas();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	
    @Override
	public boolean esDisponible(int idPelicula, int idAsiento) {
		try {
			return model.estaOcupado(idPelicula,idAsiento);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public void iniciarCompra(int idEvento, String codigoCompra,String fila, int columna) {
		//String codigoCompra= model.getObjCompra().getCodigo();
		try {
			model.comprarEntrada(idEvento, codigoCompra,fila,columna);
			
			model.setOcupado(idEvento, model.getIdAsiento(fila, columna));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public boolean cantStock(int id, int cantidad) {
		return false;
	}

	
	public int getIdProd(String nombre) {
		return 0;
	}

    @Override
    public void cambiarAPelicula(HomeEmpleado gc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiarAHome(Login l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiarACompraTickets(CompraTickets c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet setEventosBox() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
