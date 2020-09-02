package edu.usal.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.usal.dao.interfaces.UsuarioInterfaz;
import edu.usal.negocio.dominio.Usuario;
import edu.usal.util.Conexion;

public class UsuarioImpl implements UsuarioInterfaz{
	
	Connection con = null;

	@Override
	public boolean verificarUsuario(Usuario usuario) throws SQLException {

		String nombreUsu = usuario.getNombreUsuario();
		String password = usuario.getPassword();
		
		con = Conexion.getConnection();
		
		String query = "SELECT * FROM Usuario";
		
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(query);
		
		
		while(rs.next()) {
			if(rs.getString(1).trim().equals(nombreUsu) && rs.getString(2).trim().equals(password)) {
				return true;
			}
			
		}
		stm.close();
		con.close();
		
		return false;
	}

}
