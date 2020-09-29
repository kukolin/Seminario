package edu.usal.implementacion;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.usal.dao.interfaces.VentaInterfaz;
import edu.usal.negocio.dominio.Venta;
import edu.usal.negocio.dominio.Venta;
import edu.usal.util.Conexion;

public class VentaImpl implements VentaInterfaz {
	
	Connection con = null;
	
	@Override
	public int getUltimaVenta() throws SQLException {
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		ResultSet rsVenta = stm.executeQuery("SELECT TOP 1 * FROM Venta ORDER BY ID_Venta DESC");

		int idVenta = 0;
				
		while(rsVenta.next()) {
			idVenta = rsVenta.getInt(1);
		}
		
		rsVenta.close();
		stm.close();
		con.close();
		return idVenta;
		
	}
	
	@Override
	public boolean AltaVenta(Venta venta) throws SQLException {

		
		int idCliente = venta.getID_Cliente();
		int idEmpleado = venta.getID_Empleado();
		BigDecimal total = venta.getTotal();
		
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String str = "INSERT INTO Venta VALUES (";
		
		str = str + idCliente + "," + idEmpleado  + "," + total + ",0)";
			
		stm.execute(str);
		
		stm.close();
		
		
		con.close();
		return true;
	
		
	}

	@Override
	public ArrayList<Venta> ListarVentas() throws SQLException {
	con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Venta WHERE Borrado = 0";
		
		ResultSet rs = stm.executeQuery(sql);
				
		ArrayList<Venta> lista = new ArrayList<Venta>();
		
		
		while(rs.next()) {
			

				
			
//			public Venta(String nombre, String descripcion, int cantidad, int idVenta, BigDecimal precio) {

			Venta venta = new Venta(rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getBigDecimal(4));
			
			
			lista.add(venta);

			
		}
		stm.close();
		con.close();
		
		
		return lista;
	}
	

}	
