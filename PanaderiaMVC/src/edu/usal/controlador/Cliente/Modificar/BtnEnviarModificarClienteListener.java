package edu.usal.controlador.Cliente.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.Mensajes;
import edu.usal.vista.ModificarClienteVista;

public class BtnEnviarModificarClienteListener implements ActionListener {

	ClienteInterfaz clienteInterfaz;
	ModificarClienteVista modificarClienteVista;
	
	public BtnEnviarModificarClienteListener() throws IOException {

		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		modificarClienteVista = BtnModificarClienteListener.modificarClienteVista;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		ArrayList<Cliente> alClientes = new ArrayList<Cliente>();
		
		try {
			alClientes = clienteInterfaz.ListarClientes();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		int idSelec = alClientes.get(modificarClienteVista.comboBox.getSelectedIndex()).getIdCliente();
		
		try {
			
			if(modificarClienteVista.tDni.getText().matches("[0-9]+") && modificarClienteVista.tTelefono.getText().matches("[0-9]+")) {
			
			String nombre = modificarClienteVista.tNombre.getText();
			String apellido = modificarClienteVista.tApellido.getText();
			int dni = Integer.parseInt(modificarClienteVista.tDni.getText());
			String direccion = modificarClienteVista.tDireccion.getText();
			String mail = modificarClienteVista.tEmail.getText();
			int telefono = Integer.parseInt(modificarClienteVista.tTelefono.getText());
			
			String pattern = "dd-MM-yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			Date dateNac = simpleDateFormat.parse(modificarClienteVista.tFechaNac.getText());
			java.sql.Date dateNac2 = new java.sql.Date(dateNac.getTime());
			
			String sexo = "M";
			if(modificarClienteVista.rdbtnM.isSelected())  sexo = "M";
			if(modificarClienteVista.rdbtnF.isSelected())  sexo = "F";

			JOptionPane.showMessageDialog(null, "Enviado.");
			Cliente cliente = new Cliente(0, nombre, apellido, direccion, mail, sexo, dni, telefono, dateNac2);
			
			clienteInterfaz.ModificarCliente(idSelec, cliente);
			
			}
			else {
				new Mensajes().ErrorNumerico();
			}
			
		} catch (SQLException | ParseException e1) {
			e1.printStackTrace();
		}
		
		
		
		

	}

}
