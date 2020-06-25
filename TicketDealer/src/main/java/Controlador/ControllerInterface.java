/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Model.*;
import Vistas.*;
/**
 *
 * @author Esteban
 */
public interface ControllerInterface {
    void iniciar();

	void cambiarALogin(Home home);
	
	void cambiarALogin(HomeAdmin home);
	
	void cambiarAHome2(Home v);
	
	void cambiarAPelicula(HomeEmpleado gc);
	
	void cambiarAHome(Login l);
	
	void cambiarAHome(HomeEmpleado gc);
	
	void cambiarACompraTickets(CompraTickets c);
	
//	void cambiarACompra(FormaPago fp);
	
	void cambiarAFormaPago(Pago p);
	
//	void cambiarAFormaPago(CompraView c);
	
	void cambiarACargaStock(HomeAdmin h);
	
	void cambiarAConsultaStock(HomeAdmin h);
	
	void cambiarAHomeAdmin(ConsultaStock cs);
	
//	void cambiarAHomeAdmin(CargaStock cs);
	
	void cambiarAHome2(Login l);
	
//	void cambiarAPago(FormaPago fp);
	
	public Cargador getModel();
	
	boolean esValido(String a,String b);

	
}
