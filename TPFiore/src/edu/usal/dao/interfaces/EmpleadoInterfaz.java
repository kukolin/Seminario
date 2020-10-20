package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Empleado;

public interface EmpleadoInterfaz {
		
	ArrayList<Empleado> listarEmpleados() throws SQLException;
	
	public boolean AltaEmpleado(Empleado empleado) throws SQLException;

	boolean BajaEmpleado(int i) throws SQLException;

	boolean ModificarEmpleado(int idEmpleado, Empleado empleado) throws SQLException;
	
}
