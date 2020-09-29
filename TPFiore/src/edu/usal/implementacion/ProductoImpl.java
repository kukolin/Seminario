package edu.usal.implementacion;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Cliente;
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
	
		con = Conexion.getConnection();
		
		
		Statement stm = con.createStatement();
		
		String sql = "UPDATE Producto SET Borrado = 1 WHERE ID_Producto = " + i;
		
		stm.execute(sql);
		
		stm.close();
		con.close();
		
		return true;
	}

	@Override
	public ArrayList<Producto> ListarProducto() throws SQLException {
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Producto WHERE Borrado = 0";
		
		ResultSet rs = stm.executeQuery(sql);
				
		ArrayList<Producto> lista = new ArrayList<Producto>();
		
		
		while(rs.next()) {
			

				
			
//			public Producto(String nombre, String descripcion, int cantidad, int idProducto, BigDecimal precio) {

			Producto producto = new Producto(rs.getString(1), rs.getString(5), rs.getInt(4), rs.getInt(2), rs.getBigDecimal(3));
			lista.add(producto);

			
		}
		stm.close();
		con.close();
		
		
		return lista;
	}

	@Override
	public boolean ModificarProducto(int idProducto, Producto producto) throws SQLException {
		
		String nombre = producto.getNombre();
		String descripcion = producto.getDescripcion();
		int cantidad = producto.getCantidad();
		BigDecimal precio = producto.getPrecio();
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String updateProducto = "UPDATE Producto SET Nombre = '" + nombre + 
				"', Precio = " + precio +
				", Cantidad = " + cantidad +
				", Descripcion = '" + descripcion + 
				
				"' WHERE ID_Producto = " + idProducto;

		
		stm.execute(updateProducto);
		
		stm.close();
		
		
		con.close();
		return true;
	}

	@Override
	public boolean RestarStock(Integer idProducto, int cantidad) throws SQLException {
		
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
				  				  
		String updateProducto = "UPDATE Producto SET Cantidad = (Cantidad - " + cantidad + ") WHERE ID_Producto = " + idProducto;
		
		stm.execute(updateProducto);
		
		stm.close();
		
		
		con.close();
		return true;
		
	}
	

}
