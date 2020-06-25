/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Model.*;
import Vistas.*;
import java.sql.ResultSet;
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
	
	void cambiarACompra(FormaDePago fp);
	
	void cambiarAFormaPago(Pago p);
	
	void cambiarAFormaPago(HomeCliente c);
	
	void cambiarACargaStock(HomeAdmin h);
	
	void cambiarAConsultaStock(HomeAdmin h);
	
	void cambiarAHomeAdmin(ConsultaStock cs);
	
	void cambiarAHomeAdmin(cargaStock cs);
	
	void cambiarAHome2(Login l);
	
	void cambiarAPago(FormaDePago fp);
	
	public Cargador getModel();
	
	boolean esValido(String a,String b);

        ResultSet getRSProd(String s);

	boolean agregarStock(int nombre, int cant);

	boolean quitarStock(int nombre, int cant);

	boolean addProducto(String nombre, double precio, String string, String string2);

	boolean clearProducto(int text);

	ResultSet getRSStock();

	ResultSet setPelisBox();
	
	public boolean esDisponible(int idPelicula, int idAsiento);
	
	void iniciarCompra(int idPelicula, String fila, int columna);

	Compra getCompraActual();
	
	boolean cantStock(int id, int cantidad);
	
	int getIdProd(String nombre);

	boolean agregarStock(int nombre, int cant);

	boolean quitarStock(int nombre, int cant);

	boolean addProducto(String nombre, double precio, String string, String string2);

	boolean clearProducto(int text);

	ResultSet setEventosBox();	

	Compra getCompraActual();
	
	
}
