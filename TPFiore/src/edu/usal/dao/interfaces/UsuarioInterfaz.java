package edu.usal.dao.interfaces;

import java.sql.SQLException;

import edu.usal.negocio.dominio.Usuario;

public interface UsuarioInterfaz {

	public boolean verificarUsuario (Usuario usuario) throws SQLException;
	
}
