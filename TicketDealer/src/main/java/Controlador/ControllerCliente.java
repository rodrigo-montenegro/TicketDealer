/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Init.Main;
import Vistas.*;
import Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author macbook
 */
public class ControllerCliente implements ControllerInterface {
   Cargador model;
    Home view;
    String args = "iniciar";
    Connect c;
	
	public ControllerCliente(Cargador model, Home view){
		this.model=model;
		this.view=view;
		//iniciar();
	}
	
	public void iniciar(){
//            try {	
//                c = new Connect();
//            } catch (SQLException ex) {
//                Logger.getLogger(ControllerCine.class.getName()).log(Level.SEVERE, null, ex);
//            }
            //Home h = new Home();
            view.initComponents();
            view.setVisible(true);     
	}

	public void cambiarAHome2(Home v) {//OK!
		v.setVisible(false);
		HomeCliente hc= new HomeCliente(this);
		hc.setVisible(true);
	}
	
	@Override
	public void cambiarACompra(CompraTickets ct) {//OK!
		ct.setVisible(false);
		HomeCliente c;
		try {
			c = new HomeCliente(this);
		} catch (SQLException e) {
			c=null;
			e.printStackTrace();
		}
		c.setVisible(true);
	}
	
	@Override
	public void cambiarAFormaPago(HomeCliente c) {//OK!
		c.setVisible(false);
		FormaDePago fp= new FormaDePago(this);
		fp.setVisible(true);
	}
	
	public void cambiarAPago(FormaDePago fp) {//OK!
		fp.setVisible(false);
		Pago p= new Pago(this);
		p.setVisible(true);
	}
	
	public void	cambiarAFormaPago(Pago p) {//OK!
		p.setVisible(false);
		FormaDePago fp=new FormaDePago(this);
		fp.setVisible(true);
	}
	
	@Override
	public void cambiarACompra(FormaDePago fp) {//OK!
		fp.setVisible(false);
		HomeCliente c;
		try {
			c = new HomeCliente(this);
		} catch (SQLException e) {
			c=null;
			e.printStackTrace();
		}
		c.setVisible(true);
	}
	
	@Override
	public void cambiarACompraTickets(HomeCliente c) {//OK!
		c.setVisible(false);
		CompraTickets ct;
                ct = new CompraTickets(this);
		ct.setVisible(true);
	}
	
	@Override
	public void cambiarAHome2(CompraTickets ct) {//OK!
		ct.setVisible(false);
		HomeCliente hc= new HomeCliente(this);
		hc.setVisible(true);
	}
	
	public void cambiarAHome(Login l) {//OK!
	}
	
	public void	cambiarALogin(Home v) {//OK!
	}
	
	public Cargador getModel(){//OK!
		return model;
	}

	@Override
	public void cambiarAHome2(Login l) {//OK!
	}

	@Override
	public boolean esValido(String a, String b) {//OK!
		return false;
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
	public void cambiarAHomeAdmin(CargaStock cs) {//OK!
	}
	
	@Override
	public void cambiarAPelicula(HomeEmpleado gc) {//OK!
	}

	@Override
	public void cambiarAHome(HomeEmpleado gc) {//OK!
	}

	@Override
	public void cambiarAConfirma(FormaPago fp) {
		fp.setVisible(false);
		Recibo r=new Recibo(this);
		r.setVisible(true);
	}

	@Override
	public void cambiarAConfirma(Pago p) {//OK!
		p.setVisible(false);
		Recibo r=new Recibo(this);
		r.setVisible(true);
	}
	
	@Override
	public void cambiarAFormaPago(Recibo r) {//OK!
		r.setVisible(false);
		FormaPago fp=new FormaPago(this);
		fp.setVisible(true);
	}

	@Override
	public void cambiarAHome2(Recibo r) {//OK!
		r.setVisible(false);
		HomeCliente hc= new HomeCliente(this);
		hc.setVisible(true);
	}

	@Override
	public void cambiarAPelicula(HomeCliente hc) {
		hc.setVisible(false);
		CompraTickets ct;
		try {
			ct = new CompraTickets(this);
		} catch (SQLException e) {
			e.printStackTrace();
			ct=null;
		}
		ct.setVisible(true);
	}	
	
	@Override
	public void cambiarARecTick(HomeEmpleado gc) {//OK!
	}
	
	@Override
	public void cambiarAHomeEmpleado(RecibirTiket rt) {
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

	
	

	@Override
	public boolean cantStock(int id, int cantidad) {
		return false;
	}

	@Override
	public int getIdProd(String nombre) {
		return 0;
	}

    @Override
    public void cambiarACompraTickets(CompraTickets c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
