package edu.usal.controlador.Empleado.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Empleado.AltaEmpleadoVista;
import edu.usal.vista.Mensajes;

public class BtnEnviarAltaEmpleadoListener implements ActionListener{
	
	AltaEmpleadoVista altaEmpleadoVista;
	EmpleadoInterfaz empleadoInterfaz;
	
	public BtnEnviarAltaEmpleadoListener() throws IOException {
		altaEmpleadoVista = BtnAltaEmpleadoListener.altaEmpleadoVista;
		empleadoInterfaz = EmpleadoFactory.GetImplementation("MSSQL");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		try {
			
			if(altaEmpleadoVista.tDni.getText().matches("[0-9]+") && altaEmpleadoVista.tTelefono.getText().matches("[0-9]+")) {
			
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
			
			String sexo = "M";
			if(altaEmpleadoVista.rdbtnM.isSelected())  sexo = "M";
			if(altaEmpleadoVista.rdbtnF.isSelected())  sexo = "F";

			JOptionPane.showMessageDialog(null, "Enviado.");
			Empleado empleado = new Empleado(nombre, apellido, direccion, sexo, puesto, dni, 0, telefono, dateNac2);
			
			empleadoInterfaz.AltaEmpleado(empleado);
			
			}
			else {
				new Mensajes().ErrorNumerico();
			}
			
		} catch (SQLException | ParseException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
