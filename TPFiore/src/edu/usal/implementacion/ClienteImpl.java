package edu.usal.implementacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;

import edu.usal.util.Conexion;

public class ClienteImpl implements ClienteInterfaz {

	Connection con = null;
	
	@Override
	public boolean AltaCliente(Cliente cliente) throws SQLException {
		
		String nombre = cliente.getNombre();
		String apellido = cliente.getApellido();
		int dni = cliente.getDni();
		String direccion = cliente.getDireccion();
		String sexo = cliente.getSexo();
		String mail = cliente.getMail();
		int telefono = cliente.getTelefono();
		Date fechaNac = cliente.getFechaNac();
		
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String str = "INSERT INTO Cliente VALUES (";
		
		str = str + "'" + nombre + "','" + apellido + "'," + dni +", '" + fechaNac+ "','" 
		+ direccion + "'," + telefono + ",'" + sexo + "','" + mail + "')";
		
		
		
		stm.execute(str);
		
		stm.close();
		
		
		con.close();
		return true;
	
	}
	@Override
	public boolean BajaCliente(int i) throws SQLException {
		
		con = Conexion.getConnection();
		
		
		Statement stm = con.createStatement();
		
		String sql = "DELETE FROM Cliente WHERE ID_Cliente = " + i;
		
		stm.execute(sql);
		
		stm.close();
		con.close();
		
		return true;
	}

	
	
	
	
	@Override
	public ArrayList<Cliente> ListarClientes() throws SQLException {
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Cliente";
		
		ResultSet rs = stm.executeQuery(sql);
				
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		
		while(rs.next()) {
			
			Cliente cliente = new Cliente(rs.getInt(5), rs.getString(1).trim(), rs.getString(2).trim(), rs.getString(6).trim(), rs.getString(9).trim(),
					rs.getString(8).trim(), rs.getInt(3), rs.getInt(7), rs.getDate(4));
											
			lista.add(cliente);
			
		}
		stm.close();
		con.close();
		
		
		return lista;
	}
	
	@Override
	public boolean ModificarCliente(int idCliente, Cliente cliente) throws SQLException {

		String nombre = cliente.getNombre();
		String apellido = cliente.getApellido();
		int dni = cliente.getDni();
		String direccion = cliente.getDireccion();
		String sexo = cliente.getSexo();
		String mail = cliente.getMail();
		int telefono = cliente.getTelefono();
		Date fechaNac = cliente.getFechaNac();
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String updateCliente = "UPDATE Cliente SET Nombre = '" + nombre + 
				"', Apellido = '" + apellido +
				"', DNI = '" + dni +
				"', Fecha_nacimiento = '" + fechaNac + 
				"', Direccion = '" + direccion +
				"', Telefono = '" + telefono +
				"', Sexo = '" + sexo +
				"', Mail = '" + mail +

				"' WHERE ID_Cliente = " + idCliente;
		
		stm.execute(updateCliente);
		
		stm.close();
		
		
		con.close();
		return true;
		
	}

}
