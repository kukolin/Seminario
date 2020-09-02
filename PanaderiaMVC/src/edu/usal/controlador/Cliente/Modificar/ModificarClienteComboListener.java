package edu.usal.controlador.Cliente.Modificar;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.ModificarClienteVista;

public class ModificarClienteComboListener implements ItemListener{

	ModificarClienteVista modificarClienteVista;
	ClienteInterfaz clienteInterfaz;
	CompletarCamposClientes camposClientes;
	
	public ModificarClienteComboListener() throws IOException {

		modificarClienteVista = BtnModificarClienteListener.modificarClienteVista;
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		camposClientes = new CompletarCamposClientes();
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {

		/*
		 * int idSelec = modificarClienteVista.comboBox.getSelectedIndex();
		 * 
		 * ArrayList<Cliente> alClientes = new ArrayList<Cliente>();
		 * 
		 * try { alClientes = clienteInterfaz.ListarClientes(); } catch (SQLException
		 * e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 * 
		 * modificarClienteVista.tNombre.setText(alClientes.get(idSelec).getNombre());
		 * modificarClienteVista.tApellido.setText(alClientes.get(idSelec).getApellido()
		 * ); modificarClienteVista.tDni.setText(alClientes.get(idSelec).getDni() + "");
		 * modificarClienteVista.tTelefono.setText(alClientes.get(idSelec).getTelefono()
		 * + "");
		 * modificarClienteVista.tDireccion.setText(alClientes.get(idSelec).getDireccion
		 * ()); modificarClienteVista.tEmail.setText(alClientes.get(idSelec).getMail());
		 * modificarClienteVista.tNombre.setText(alClientes.get(idSelec).getNombre());
		 * modificarClienteVista.tNombre.setText(alClientes.get(idSelec).getNombre());
		 */

		 int idSelec = modificarClienteVista.comboBox.getSelectedIndex();
		
		 camposClientes.completar(idSelec);
		
		
		
	}

}
