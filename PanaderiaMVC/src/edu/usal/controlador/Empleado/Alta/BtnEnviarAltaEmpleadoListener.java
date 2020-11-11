package edu.usal.controlador.Empleado.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Empleado.AltaEmpleadoVista;
import edu.usal.vista.Mensajes;

public class BtnEnviarAltaEmpleadoListener implements ActionListener{
	
	AltaEmpleadoVista altaEmpleadoVista;
	EmpleadoInterfaz empleadoInterfaz;
	
	public BtnEnviarAltaEmpleadoListener() throws IOException {
		altaEmpleadoVista = Controlador.altaEmpleadoVista;
		empleadoInterfaz = EmpleadoFactory.GetImplementation("MSSQL");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		try {
			if(altaEmpleadoVista.tDni.getText().matches("[0-9]+") && altaEmpleadoVista.tTelefono.getText().matches("[0-9]+")) {
				if(altaEmpleadoVista.tDni.getText().matches("[0-9]{7,8}")) {
					if(altaEmpleadoVista.tEmail.getText().length() < 30 ||
							   altaEmpleadoVista.tNombre.getText().length() < 30 ||
							   altaEmpleadoVista.tApellido.getText().length() < 30 ||
							   altaEmpleadoVista.tDireccion.getText().length() < 30
							   ) {
						
					
			String nombre = altaEmpleadoVista.tNombre.getText();
			String apellido = altaEmpleadoVista.tApellido.getText();
			int dni = Integer.parseInt(altaEmpleadoVista.tDni.getText());
			String direccion = altaEmpleadoVista.tDireccion.getText();
			int telefono = Integer.parseInt(altaEmpleadoVista.tTelefono.getText());
			String puesto = altaEmpleadoVista.tEmail.getText();
			
			String pattern = "dd-MM-yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			Date dateNac = simpleDateFormat.parse(altaEmpleadoVista.tFechaNac.getText());
			java.sql.Date dateNac2 = new java.sql.Date(dateNac.getTime());
			java.sql.Date hoy = new java.sql.Date(Calendar.getInstance().getTime().getTime());


					if(dateNac2.before(hoy)) {


			
			String sexo = "M";
			if(altaEmpleadoVista.rdbtnM.isSelected())  sexo = "M";
			if(altaEmpleadoVista.rdbtnF.isSelected())  sexo = "F";

			JOptionPane.showMessageDialog(null, "Enviado.");
			Empleado empleado = new Empleado(nombre, apellido, direccion, sexo, puesto, dni, 0, telefono, dateNac2);
			
			empleadoInterfaz.AltaEmpleado(empleado);
			
					}
					
					else {
						JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser posterior a la de hoy!.");		
					}
					}else {
						JOptionPane.showMessageDialog(null, "Límite de caracteres excedido!.");				
					}
					}else{
						JOptionPane.showMessageDialog(null, "Ingrese un DNI válido.");
					}
					}
					else {
						new Mensajes().ErrorNumerico();
					}
			
		} catch (SQLException | ParseException e1) {
			JOptionPane.showMessageDialog(null, "No se pudo registrar en la base de datos. Verifique que el DNI no exista.");
		}
		
		
	}

}
