package edu.usal.controlador.Empleado;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.negocio.dominio.Empleado;

public class ItemsEmpleadoListener {

	static EmpleadoInterfaz EmpleadoImple;
	
	
	public static String[] valores() throws IOException, SQLException {
		
		EmpleadoImple = EmpleadoFactory.GetImplementation("MSSQL");
		ArrayList<Empleado> al = new ArrayList<Empleado>();
		al = EmpleadoImple.listarEmpleados();
		ArrayList<String> al2 = new ArrayList<String>();
		for(int i=0;i<al.size();i++)
			al2.add(al.get(i).getApellido() + ", " + al.get(i).getNombre());
		
		
		String[] al3 = al2.toArray(new String[al2.size()]);
		return al3;
			
	}
	
	
}
