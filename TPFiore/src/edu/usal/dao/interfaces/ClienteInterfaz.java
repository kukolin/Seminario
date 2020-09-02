package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Cliente;

public interface ClienteInterfaz {

	public boolean AltaCliente(Cliente cliente) throws SQLException;

	boolean BajaCliente(int i) throws SQLException;

	ArrayList<Cliente> ListarClientes() throws SQLException;

	boolean ModificarCliente(int idCliente, Cliente cliente) throws SQLException;
	
	
}
