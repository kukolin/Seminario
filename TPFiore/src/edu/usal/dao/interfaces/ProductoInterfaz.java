package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import edu.usal.negocio.dominio.Producto;

public interface ProductoInterfaz {
	
	public boolean AltaProducto(Producto producto) throws SQLException;

	boolean BajaProducto(int i) throws SQLException;

	ArrayList<Producto> ListarProducto() throws SQLException;
	
	public boolean ModificarProducto(int idProducto, Producto producto) throws SQLException;
	
	public boolean RestarStock(Integer idProducto, int cantidad) throws SQLException;
}
