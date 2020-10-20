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

	@Override
	public boolean AltaEmpleado(Empleado empleado) throws SQLException {
		

		String nombre = empleado.getNombre();
		String apellido = empleado.getApellido();
		String direccion = empleado.getDireccion();
		String sexo = empleado.getSexo();
		String puesto = empleado.getPuesto();
		int dni = empleado.getDni();
		int telefono = empleado.getTelefono();
		Date fechaNac = empleado.getFechaNac();
		
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String str = "INSERT INTO Empleado VALUES (";
		
		str = str + "'" + nombre + "','" + apellido + "'," + dni +", '"
		+ direccion + "'," + telefono + ",'" + fechaNac + "','" + sexo + "','" + puesto + "',0)";
		
		stm.execute(str);
		
		stm.close();
		
		
		con.close();
		return true;
	}

	@Override
	public boolean BajaEmpleado(int i) throws SQLException {
		
		con = Conexion.getConnection();
		
		
		Statement stm = con.createStatement();
		
		String sql = "UPDATE Empleado SET Borrado = 1 WHERE ID_Empleado = " + i;
		
		stm.execute(sql);
		
		stm.close();
		con.close();
		
		return true;
	}

	@Override
	public boolean ModificarEmpleado(int idEmpleado, Empleado empleado) throws SQLException {

		String nombre = empleado.getNombre();
		String apellido = empleado.getApellido();
		String direccion = empleado.getDireccion();
		String sexo = empleado.getSexo();
		String puesto = empleado.getPuesto();
		int dni = empleado.getDni();
		int telefono = empleado.getTelefono();
		Date fechaNac = empleado.getFechaNac();
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String updateEmpleado = "UPDATE Empleado SET Nombre = '" + nombre + 
				"', Apellido = '" + apellido +
				"', DNI = '" + dni +
				"', Direccion = '" + direccion +
				"', Telefono = '" + telefono +
				"', Fecha_nacimiento = '" + fechaNac + 
				"', Sexo = '" + sexo +
				"', Puesto_laboral = '" + puesto +

				"' WHERE ID_Empleado = " + idEmpleado;
		
		stm.execute(updateEmpleado);
		
		stm.close();
		
		
		con.close();
		return true;
		
	}

	
	
}
