package Resources;


public class Debito implements formapago{
	public double pagar(double precio){
		System.out.println("Estoy pagando con tarjeta de credito");
		return precio;
	}
}