package edu.usal.controlador.Empleado.Modificar;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Empleado.ModificarEmpleadoVista;



public class CompletarCamposEmpleados {
	
	ModificarEmpleadoVista modificarEmpleadoVista;
	EmpleadoInterfaz empleadoInterfaz;

	public CompletarCamposEmpleados() throws IOException {
		
		modificarEmpleadoVista = BtnModificarEmpleadoListener.modificarEmpleadoVista;
		empleadoInterfaz = EmpleadoFactory.GetImplementation("MSSQL");
		
	}
	
		public void completar(int idSelec) {		
		
//	int idSelec = modificarEmpleadoVista.comboBox.getSelectedIndex();
	
	ArrayList<Empleado> alEmpleados = new ArrayList<Empleado>();
	
	try {
		alEmpleados = empleadoInterfaz.listarEmpleados();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	modificarEmpleadoVista.tNombre.setText(alEmpleados.get(idSelec).getNombre());
	modificarEmpleadoVista.tApellido.setText(alEmpleados.get(idSelec).getApellido());
	modificarEmpleadoVista.tDni.setText(alEmpleados.get(idSelec).getDni() + "");
	modificarEmpleadoVista.tTelefono.setText(alEmpleados.get(idSelec).getTelefono() + "");
	modificarEmpleadoVista.tDireccion.setText(alEmpleados.get(idSelec).getDireccion());
	modificarEmpleadoVista.tEmail.setText(alEmpleados.get(idSelec).getPuesto());
	modificarEmpleadoVista.tNombre.setText(alEmpleados.get(idSelec).getNombre());
	modificarEmpleadoVista.tNombre.setText(alEmpleados.get(idSelec).getNombre());}
	
	
}
