
package Controlador;
import Model.*;
import Vistas.*;
import Resources.*;
import java.sql.ResultSet;


public interface ControllerInterface {
	
	void iniciar();

	void cambiarALogin(Home home);
	
	void cambiarALogin(HomeAdmin home);
	
	void cambiarAHome2(Home v);
	
	void cambiarAPelicula(HomeEmpleado gc);
	
	void cambiarAHome(Login l);
	
	void cambiarAHome(HomeEmpleado gc);
	
	void cambiarACompraTickets(CompraView c);
	
	void cambiarACompra(FormaPago fp);
	
	void cambiarAFormaPago(Pago p);
	
	void cambiarAFormaPago(CompraView c);
	
	void cambiarACargaStock(HomeAdmin h);
	
	void cambiarAConsultaStock(HomeAdmin h);
	
	void cambiarAHomeAdmin(ConsultaStock cs);
	
	void cambiarAHomeAdmin(CargaStock cs);
	
	void cambiarAHome2(Login l);
	
	void cambiarAPago(FormaPago fp);
	
	public Cargador getModel();
	
	boolean esValido(String a,String b);

	void cambiarAHome2(CompraTickets_v1 ct);

	void cambiarACompra(CompraTickets_v1 ct);

	void cambiarAConfirma(FormaPago fp);

	void cambiarAConfirma(Pago p);

	void cambiarAFormaPago(Recibo r);

	void cambiarAHome2(Recibo r);

	void cambiarAPelicula(HomeCliente hc);
	
	void cambiarARecTick(HomeEmpleado gc);
	
	void cambiarAHomeEmpleado(RecibirTiket rt);
	
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
}
