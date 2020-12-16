package edu.usal.controlador.Empleado.Modificar;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Empleado.ModificarEmpleadoVista;

public class ModificarEmpleadoComboListener implements ItemListener{

	ModificarEmpleadoVista modificarEmpleadoVista;
	EmpleadoInterfaz empleadoInterfaz;
	CompletarCamposEmpleados camposEmpleados;
	
	public ModificarEmpleadoComboListener() throws IOException {

		modificarEmpleadoVista = BtnModificarEmpleadoListener.modificarEmpleadoVista;
		empleadoInterfaz = EmpleadoFactory.GetImplementation("MSSQL");
		camposEmpleados = new CompletarCamposEmpleados();
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {


		 int idSelec = modificarEmpleadoVista.comboBox.getSelectedIndex();
		
		 camposEmpleados.completar(idSelec);
		
		
		
	}

}
