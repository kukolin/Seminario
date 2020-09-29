package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Empleado;

public interface EmpleadoInterfaz {
	
	//TODO AMB de empleados
	
	ArrayList<Empleado> listarEmpleados() throws SQLException;
	
}
