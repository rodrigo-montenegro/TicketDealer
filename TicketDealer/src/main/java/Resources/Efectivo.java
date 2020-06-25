package Resources;


public class Efectivo implements formapago{
	public double pagar(double precio){
		precio=precio*0.9;
		System.out.println("Estoy pagando en efectivo");
		return precio;
	}

}
