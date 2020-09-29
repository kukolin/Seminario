package edu.usal.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.util.Conexion;

public class EmpleadoImpl implements EmpleadoInterfaz{
	
	Connection con = null;

	@Override
	public ArrayList<Empleado> listarEmpleados() throws SQLException {

	con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Empleado WHERE Borrado = 0";
		
		ResultSet rs = stm.executeQuery(sql);
				
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		
		
		while(rs.next()) {
		
			Empleado Empleado = new Empleado(rs.getString(1).trim(), rs.getString(2).trim(), rs.getString(4).trim(), rs.getString(8).trim()
					,rs.getString(9).trim(), rs.getInt(3), rs.getInt(5), rs.getInt(6), rs.getDate(7));
											
			lista.add(Empleado);
			
		}
		stm.close();
		con.close();
		
		
		return lista;
	}

	
	
}
