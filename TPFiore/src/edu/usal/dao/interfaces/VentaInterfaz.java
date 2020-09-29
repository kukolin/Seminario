package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.DetalleVenta;
import edu.usal.negocio.dominio.Venta;

public interface VentaInterfaz {

	ArrayList<Venta> ListarVentas() throws SQLException;

	boolean AltaVenta(Venta venta) throws SQLException;

	int getUltimaVenta() throws SQLException;
	
}
