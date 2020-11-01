package edu.usal.controlador.Empleado.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Empleado.BajaEmpleadoVista;
import edu.usal.vista.Mensajes;

public class BtnEnviarBorrarEmpleadoListener implements ActionListener{

	Mensajes mensaje;
	BajaEmpleadoVista bajaEmpleado;
	EmpleadoInterfaz cliInter;
	
	public BtnEnviarBorrarEmpleadoListener() throws IOException, SQLException{
		cliInter = EmpleadoFactory.GetImplementation("MSSQL");
		bajaEmpleado = Controlador.bajaEmpleadoVista;
		mensaje = new Mensajes();

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<Empleado> alEmpleados = new ArrayList<Empleado>();
		
		try {
			alEmpleados = cliInter.listarEmpleados();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
		int index = bajaEmpleado.comboBox.getSelectedIndex();
		int idSelec = alEmpleados.get(index).getId();
		
		try {
			
				
				
				cliInter.BajaEmpleado(idSelec);
				
				mensaje.Realizado();
					
			
			
		} catch (NumberFormatException | SQLException e1) {
			e1.printStackTrace();
		}		
	}

}
