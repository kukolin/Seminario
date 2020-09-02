package edu.usal.controlador.Cliente.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.AltaClienteVista;
import edu.usal.vista.Mensajes;

public class BtnEnviarAltaClienteListener implements ActionListener{
	
	AltaClienteVista altaClienteVista;
	ClienteInterfaz clienteInterfaz;
	
	public BtnEnviarAltaClienteListener() throws IOException {
		altaClienteVista = BtnAltaClienteListener.altaClienteVista;
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		try {
			
			if(altaClienteVista.tDni.getText().matches("[0-9]+") && altaClienteVista.tTelefono.getText().matches("[0-9]+")) {
			
			String nombre = altaClienteVista.tNombre.getText();
			String apellido = altaClienteVista.tApellido.getText();
			int dni = Integer.parseInt(altaClienteVista.tDni.getText());
			String direccion = altaClienteVista.tDireccion.getText();
			String mail = altaClienteVista.tEmail.getText();
			int telefono = Integer.parseInt(altaClienteVista.tTelefono.getText());
			
			String pattern = "dd-MM-yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			Date dateNac = simpleDateFormat.parse(altaClienteVista.tFechaNac.getText());
			java.sql.Date dateNac2 = new java.sql.Date(dateNac.getTime());
			
			String sexo = "M";
			if(altaClienteVista.rdbtnM.isSelected())  sexo = "M";
			if(altaClienteVista.rdbtnF.isSelected())  sexo = "F";

			JOptionPane.showMessageDialog(null, "Enviado.");
			Cliente cliente = new Cliente(0, nombre, apellido, direccion, mail, sexo, dni, telefono, dateNac2);
			
			clienteInterfaz.AltaCliente(cliente);
			
			}
			else {
				new Mensajes().ErrorNumerico();
			}
			
		} catch (SQLException | ParseException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
