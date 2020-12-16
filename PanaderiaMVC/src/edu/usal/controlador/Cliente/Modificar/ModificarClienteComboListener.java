package edu.usal.controlador.Cliente.Modificar;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.Cliente.ModificarClienteVista;

public class ModificarClienteComboListener implements ItemListener{

	ModificarClienteVista modificarClienteVista;
	ClienteInterfaz clienteInterfaz;
	CompletarCamposClientes camposClientes;
	
	public ModificarClienteComboListener() throws IOException {

		modificarClienteVista = Controlador.modificarClienteVista;
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		camposClientes = new CompletarCamposClientes();
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {

		
		 int idSelec = modificarClienteVista.comboBox.getSelectedIndex();
		 
		// if(idSelec != 0)
		 camposClientes.completar(idSelec);
		
		
		
	}

}
