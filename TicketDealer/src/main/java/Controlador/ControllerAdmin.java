package Controlador;
import Model.*;
import Vistas.*;
import Resources.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class ControllerAdmin implements ControllerInterface{
	Cargador model;
        Home view;
	
	public ControllerAdmin(Cargador model, Home view){
		this.model=model;
		this.view=view;
	}

	@Override
	public void iniciar() { //OK!
	}

	@Override
	public void cambiarALogin(Home v) {//OK!
		v.setVisible(false);
		Login l = new Login(this);
        l.setVisible(true);
	}

	@Override
	public void cambiarAHome2(Home v) {	//OK!
	}

	@Override
	public void cambiarAHome(Login l) { //OK!
		l.setVisible(false);
		Home h= new Home();
		h.cambiarController(this);
		//h.initComponents();
		h.setVisible(true);
	}

	@Override
	public void cambiarAPago(FormaPago fp) {//OK!
	}

	@Override
	public void cambiarAFormaPago(Pago p) {//OK!
	}

	@Override
	public Cargador getModel() {//OK!
		return model;
	}

	@Override
	public void cambiarAHome2(Login l) {//OK!
		l.setVisible(false);
		HomeAdmin cs =new HomeAdmin(this);
		cs.setVisible(true);
	}

	@Override
	public boolean esValido(String a, String b){
		try{
			return model.validarAdmin(a,b);}
		catch (SQLException e){
			return false;
		}
		//return true;
	}

	@Override
	public void cambiarALogin(HomeAdmin h) {//OK!
		h.setVisible(false);
    	Login l = new Login(this);
    	l.setVisible(true);
	}

	@Override
	public void cambiarACargaStock(HomeAdmin h) {//OK!
		h.setVisible(false);
    	CargaStock cs = new CargaStock(this,getModel());
    	ConsultaStock cos= new ConsultaStock(this,getModel());
    	cs.setVisible(true);
    	cos.setVisible(true);
	}

	@Override
	public void cambiarAConsultaStock(HomeAdmin h) {//OK!
		h.setVisible(false);
    	ConsultaStock cs = new ConsultaStock(this,getModel());
    	cs.setVisible(true);
	}

	@Override
	public void cambiarAHomeAdmin(ConsultaStock cs) {//OK!
		cs.setVisible(false);
    	HomeAdmin h = new HomeAdmin(this);
    	h.setVisible(true);	
	}

	@Override
	public void cambiarAHomeAdmin(CargaStock cs) {//OK!
		cs.setVisible(false);
    	HomeAdmin h = new HomeAdmin(this);
    	h.setVisible(true);
	}

	@Override
	public void cambiarAEntradas(HomeEmpleado gc) {//OK!
	}

	@Override
	public void cambiarAHome(HomeEmpleado gc) {//OK!
	}

	@Override
	public void cambiarAFormaPago(CompraView c) {//OK!
	}

	@Override
	public void cambiarACompraTickets(CompraView c) {//OK!
	}

	@Override
	public void cambiarACompra(FormaPago fp) {//OK!
	}

	@Override
	public void cambiarAHome2(CompraTickets_v1 compraTickets_v1) {//OK!
	}

	@Override
	public void cambiarACompra(CompraTickets_v1 ct) {//OK!
	}

	@Override
	public void cambiarAConfirma(FormaPago fp) {//OK!	
	}

	@Override
	public void cambiarAConfirma(Pago p) {//OK!
	}

	@Override
	public void cambiarAFormaPago(Recibo r) {//OK!
	}

	@Override
	public void cambiarAHome2(Recibo r) {//OK!
	}
	
	@Override
	public void cambiarAEntradas(HomeCliente hc) {//OK!
	}
	
	@Override
	public void cambiarARecTick(HomeEmpleado gc) {//OK!
	}
	
	@Override
	public void cambiarAHomeEmpleado(RecibirTiket rt) {
	}
	
	@Override
	public ResultSet getRSProd(String s) {
		try {
			return model.CargarStock();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean agregarStock(int IDprodNom,int cant){
		try {
			model.agregarStock(IDprodNom,cant);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
			}
	}
	
	@Override
	public boolean quitarStock(int nombre, int cant) {
		try {
			model.quitarStock(nombre, cant);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean addProducto(String nombre, double precio, String p_prodtipo, String p_prodcoment) {
		try {
			model.creaProducto(nombre, precio, p_prodtipo, p_prodcoment);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean clearProducto(int idprod) {
		try{
			model.borraProducto(idprod);
			return true;
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ResultSet getRSStock() {try {
            //OK!!
            return model.CargarStock();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
	}

	@Override
	public ResultSet setEventosBox() {
		return null;
	}

	@Override
	public boolean esDisponible(int idPelicula, int idAsiento) {
		return false;
	}

	@Override
	public void iniciarCompra(int idPelicula, String fila, int columna) {		
	}

	@Override
	public Compra getCompraActual() {
		return null;
	}
	
	public boolean cantStock(int id, int cantidad){
		int stock;
		try {
			stock = this.getModel().getStockProducto(id);
			if(cantidad>stock){
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public int getIdProd(String nombre) {
		int i=0;
		try {
			return model.getIdPorNombre(nombre);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

    @Override
    public ResultSet getCarro(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}
