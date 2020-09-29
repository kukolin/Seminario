package edu.usal.dao.interfaces;

import java.sql.SQLException;

import edu.usal.negocio.dominio.DetalleVenta;

public interface DetalleVentaInterfaz {
	
	public boolean AltaDetalleVenta(DetalleVenta detalleVenta) throws SQLException;

}
