package edu.usal.controlador.Cliente;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;

public class ItemsClienteListener {

	static ClienteInterfaz clienteImple;
	
	
	public static String[] valores() throws IOException, SQLException {
		
		clienteImple = ClienteFactory.GetImplementation("MSSQL");
		ArrayList<Cliente> al = new ArrayList<Cliente>();
		al = clienteImple.ListarClientes();
		ArrayList<String> al2 = new ArrayList<String>();
		for(int i=0;i<al.size();i++)
			al2.add(al.get(i).getNombre() + " " + al.get(i).getApellido() + ", DNI: " + al.get(i).getDni());
		
		
		String[] al3 = al2.toArray(new String[al2.size()]);
		return al3;
			
	}
	
	
}
