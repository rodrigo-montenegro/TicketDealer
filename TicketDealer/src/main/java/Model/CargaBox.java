/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Esteban
 */
public class CargaBox {
    	
    Connect c;
    PreparedStatement ps;
    Statement s;
    ResultSet rs;
    
    public CargaBox() throws SQLException{
    	c = new Connect();
    }
    
    public ResultSet CargarStock() throws SQLException{
    	s = c.getConnection().createStatement();
    	rs = s.executeQuery("select * from productos");
    	return rs;
    	}
    
    public ResultSet CargarCompra(String codigoCompra) throws SQLException {
    	ps = c.getConnection().prepareStatement("select * from compraactual where codigoCompra=?") ;
    	ps.setString(1, codigoCompra);
    	rs = ps.executeQuery();
    	return rs;
    }

}
