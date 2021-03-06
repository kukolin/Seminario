package edu.usal.controlador.Cliente.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.Mensajes;
import edu.usal.vista.Cliente.ModificarClienteVista;

public class BtnEnviarModificarClienteListener implements ActionListener {

	ClienteInterfaz clienteInterfaz;
	ModificarClienteVista modificarClienteVista;
	
	public BtnEnviarModificarClienteListener() throws IOException {

		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		modificarClienteVista = Controlador.modificarClienteVista;
		
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
				if(modificarClienteVista.tDni.getText().matches("[0-9]{7,8}")) {
					if(modificarClienteVista.tEmail.getText().matches(".+[@]{1}.+[.]{1}.+")){
						if(modificarClienteVista.tEmail.getText().length() < 30 ||
								   modificarClienteVista.tNombre.getText().length() < 30 ||
								   modificarClienteVista.tApellido.getText().length() < 30 ||
								   modificarClienteVista.tDireccion.getText().length() < 30
								   ) {
							
						
		java.sql.Date hoy = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			
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
		

						if(dateNac2.before(hoy)) {
							
						

			
			String sexo = "M";
			if(modificarClienteVista.rdbtnM.isSelected())  sexo = "M";
			if(modificarClienteVista.rdbtnF.isSelected())  sexo = "F";

			JOptionPane.showMessageDialog(null, "Enviado.");
			Cliente cliente = new Cliente(0, nombre, apellido, direccion, mail, sexo, dni, telefono, dateNac2);
			
			clienteInterfaz.ModificarCliente(idSelec, cliente);
			
						}
						
						else {
							JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser posterior a la de hoy!.");		
						}
						}else {
							JOptionPane.showMessageDialog(null, "L�mite de caracteres excedido!.");				
						}
						}else {
							JOptionPane.showMessageDialog(null, "Ingrese un email v�lido.");		
						}
						}else{
							JOptionPane.showMessageDialog(null, "Ingrese un DNI v�lido.");
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
