package edu.usal.implementacion;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Producto;
import edu.usal.util.Conexion;


public class ProductoImpl implements ProductoInterfaz{

	Connection con = null;
	
	@Override
	public boolean AltaProducto(Producto producto) throws SQLException {
		
		
		
		String nombre = producto.getNombre();
		String descripcion = producto.getDescripcion();
		int cantidad = producto.getCantidad();
		int idProducto = producto.getIdProducto();
		BigDecimal precio = producto.getPrecio();
		
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String str = "INSERT INTO Producto VALUES (";
		
		str = str + "'" + nombre + "'," + precio + ", " + cantidad+ ",'" + descripcion + "')";
			
		stm.execute(str);
		
		stm.close();
		
		
		con.close();
		return true;
	
		
	}

	@Override
	public boolean BajaProducto(int i) throws SQLException {
	
		return false;
	}

	@Override
	public ArrayList<Producto> ListarProducto() throws SQLException {
		
		return null;
	}
	

	

}
