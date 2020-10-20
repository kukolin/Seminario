package edu.usal.controlador.Empleado.Listar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Empleado.ListarEmpleadoVista;

public class BtnEnviarListarEmpleadoListener implements ActionListener{

	ListarEmpleadoVista listarEmpleadoVista;
	EmpleadoInterfaz empleadoInterfaz;
	
	public BtnEnviarListarEmpleadoListener() throws IOException {
		listarEmpleadoVista = BtnListarEmpleadoListener.listarEmpleadoVista;
		empleadoInterfaz = EmpleadoFactory.GetImplementation("MSSQL");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(listarEmpleadoVista.modelo.getColumnCount() != 8) {
			
			listarEmpleadoVista.modelo.addColumn("Nombre");
			listarEmpleadoVista.modelo.addColumn("Apellido");
			listarEmpleadoVista.modelo.addColumn("Direccion");
			listarEmpleadoVista.modelo.addColumn("Puesto");
			listarEmpleadoVista.modelo.addColumn("Sexo");
			listarEmpleadoVista.modelo.addColumn("Dni");
			listarEmpleadoVista.modelo.addColumn("Telefono");
			listarEmpleadoVista.modelo.addColumn("Nacimiento");
			
//			Nombre = nombre;
//			Apellido = apellido;
//			Direccion = direccion;
//			Mail = mail;
//			Sexo = sexo;
//			Dni = dni;
//			Telefono = telefono;
//			this.fechaNac = fechaNac;
			
			}
			
			ArrayList<Empleado> lista = null;
			
			
			try {
				
				lista = empleadoInterfaz.listarEmpleados();
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		
	    Object[] object = new Object[8];      
	    
	    listarEmpleadoVista.modelo.setRowCount(0);
	 //   listarEmpleadoVista.modelo.setColumnCount(0);

		
	    if (lista.size() != 0) {
	       for (int i = 0; i < lista.size(); i++) {

	    	   	object[0] = lista.get(i).getNombre();
	            object[1] = lista.get(i).getApellido();
	            object[2] = lista.get(i).getDni();
	            object[3] = lista.get(i).getFechaNac();
	            object[4] = lista.get(i).getDireccion();
	            object[5] = lista.get(i).getTelefono();
	            object[6] = lista.get(i).getSexo();
	            object[7] = lista.get(i).getPuesto();

	            listarEmpleadoVista.modelo.addRow(object);
	    		
	        }
			

	    }

			}
	

}
