package edu.usal.controlador.Empleado.Modificar;

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

import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Mensajes;
import edu.usal.vista.Empleado.ModificarEmpleadoVista;

public class BtnEnviarModificarEmpleadoListener implements ActionListener {

	EmpleadoInterfaz empleadoInterfaz;
	ModificarEmpleadoVista modificarEmpleadoVista;
	
	public BtnEnviarModificarEmpleadoListener() throws IOException {

		empleadoInterfaz = EmpleadoFactory.GetImplementation("MSSQL");
		modificarEmpleadoVista = BtnModificarEmpleadoListener.modificarEmpleadoVista;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		ArrayList<Empleado> alEmpleados = new ArrayList<Empleado>();
		
		try {
			alEmpleados = empleadoInterfaz.listarEmpleados();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		int idSelec = alEmpleados.get(modificarEmpleadoVista.comboBox.getSelectedIndex()).getId();
		
		try {
			String nombre = modificarEmpleadoVista.tNombre.getText();
			String apellido = modificarEmpleadoVista.tApellido.getText();
			int dni = Integer.parseInt(modificarEmpleadoVista.tDni.getText());
			String direccion = modificarEmpleadoVista.tDireccion.getText();
			String puesto = modificarEmpleadoVista.tEmail.getText();
			int telefono = Integer.parseInt(modificarEmpleadoVista.tTelefono.getText());
			
			String pattern = "dd-MM-yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			Date dateNac = simpleDateFormat.parse(modificarEmpleadoVista.tFechaNac.getText());
			java.sql.Date dateNac2 = new java.sql.Date(dateNac.getTime());
			java.sql.Date hoy = new java.sql.Date(Calendar.getInstance().getTime().getTime());

			if(modificarEmpleadoVista.tDni.getText().matches("[0-9]+") && modificarEmpleadoVista.tTelefono.getText().matches("[0-9]+")) {
				if(modificarEmpleadoVista.tDni.getText().matches("[0-9]{7,8}")) {
					if(dateNac2.before(hoy)) {
			

			
			String sexo = "M";
			if(modificarEmpleadoVista.rdbtnM.isSelected())  sexo = "M";
			if(modificarEmpleadoVista.rdbtnF.isSelected())  sexo = "F";

			JOptionPane.showMessageDialog(null, "Enviado.");
			Empleado empleado = new Empleado(nombre, apellido, direccion, sexo, puesto, dni, 0, telefono, dateNac2);
			empleadoInterfaz.ModificarEmpleado(idSelec, empleado);
			
					}
					
					else {
						JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser posterior a la de hoy!.");		
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
