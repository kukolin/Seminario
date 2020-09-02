package edu.usal.controlador.Cliente.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.BajaClienteVista;
import edu.usal.vista.Mensajes;

public class BtnEnviarBorrarClienteListener implements ActionListener{

	Mensajes mensaje;
	BajaClienteVista bajaCliente;
	ClienteInterfaz cliInter;
	
	public BtnEnviarBorrarClienteListener() throws IOException, SQLException{
		cliInter = ClienteFactory.GetImplementation("MSSQL");
		bajaCliente = new BajaClienteVista();
		mensaje = new Mensajes();

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<Cliente> alClientes = new ArrayList<Cliente>();
		
		try {
			alClientes = cliInter.ListarClientes();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
		
		int idSelec = alClientes.get(bajaCliente.comboBox.getSelectedIndex()).getIdCliente();
		
		try {
			
				
				
				cliInter.BajaCliente(idSelec);
				
				mensaje.Realizado();
					
			
			
		} catch (NumberFormatException | SQLException e1) {
			e1.printStackTrace();
		}		
	}

}
