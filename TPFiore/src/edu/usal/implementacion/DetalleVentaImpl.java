package edu.usal.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.usal.dao.interfaces.DetalleVentaInterfaz;
import edu.usal.negocio.dominio.DetalleVenta;
import edu.usal.negocio.dominio.Venta;
import edu.usal.util.Conexion;

public class DetalleVentaImpl implements DetalleVentaInterfaz{

	Connection con = null;
	
	
	@Override
	public boolean AltaDetalleVenta(DetalleVenta detalleVenta) throws SQLException {

		
		int ID_Venta = detalleVenta.getID_Venta();
		int ID_Producto = detalleVenta.getID_Producto();
		int cantidad = detalleVenta.getCantidad();
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String str = "INSERT INTO DetalleVenta VALUES (";
		
		str = str + ID_Venta + "," + ID_Producto + "," + cantidad + ")";
			
		stm.execute(str);
		
		stm.close();
		
		
		con.close();
		return true;
		
	}

}
