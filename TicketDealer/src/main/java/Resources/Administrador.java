/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import javax.swing.JOptionPane;

/**
 *
 * @author Scoles
 */
public class Administrador 
{
	private String usuario;
	private String contrasena;
	private String nombre;
	private static int contadorInstancia;
	private static Administrador instancia= null;
	
	private Administrador(String u, String c){
		usuario=u;
		contrasena=c;
//		nombre=n;
		contadorInstancia=0;
	}
	
	private static void crearInstancia(String a, String b){
		if(instancia==null){
			instancia= new Administrador(a,b);
		}
	}
	
	public static Administrador getInstancia(String a, String b){
		contadorInstancia++;
		if(instancia==null){
			crearInstancia(a,b);
		}else{
        	JOptionPane.showMessageDialog(null, "No puede ingresar mas de un Administrador");
		}		
		return instancia;
	}
	
	public void setUsuario(String a, String b, String c){
		usuario=a;
		contrasena=b;
		nombre=c;
	}
	
	public void setPass(String c){
		contrasena=c;}
	
	public String getUsuario(){
		return usuario;
	}
	
	public String getPass(){
		return contrasena;}
}