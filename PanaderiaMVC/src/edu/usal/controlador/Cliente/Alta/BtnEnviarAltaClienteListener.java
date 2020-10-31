package edu.usal.controlador.Cliente.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.Cliente.AltaClienteVista;
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
			
			java.sql.Date hoy = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			
			
			if(altaClienteVista.tDni.getText().matches("[0-9]+") && altaClienteVista.tTelefono.getText().matches("[0-9]+")) {
				if(altaClienteVista.tDni.getText().matches("[0-9]{7,8}")) {
					if(altaClienteVista.tEmail.getText().matches(".+[@]{1}.+[.]{1}.+")){
						if(dateNac2.before(hoy)) {

			
			String sexo = "M";
			if(altaClienteVista.rdbtnM.isSelected())  sexo = "M";
			if(altaClienteVista.rdbtnF.isSelected())  sexo = "F";

			Cliente cliente = new Cliente(0, nombre, apellido, direccion, mail, sexo, dni, telefono, dateNac2);
			
			clienteInterfaz.AltaCliente(cliente);
			
			JOptionPane.showMessageDialog(null, "Enviado.");
			}
			
			else {
				JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser posterior a la de hoy!.");		
			}
			}else {
				JOptionPane.showMessageDialog(null, "Ingrese un email válido.");		
			}
			}else{
				JOptionPane.showMessageDialog(null, "Ingrese un DNI válido.");
			}
			}
			else {
						new Mensajes().ErrorNumerico();
			}
			
		} catch (SQLException | ParseException e1) {
			//e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se pudo registrar en la base de datos. Verifique que el DNI no exista.");
		}
		
		
	}

}
