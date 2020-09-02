package edu.usal.controlador.Cliente.Listar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.ListarClienteVista;

public class BtnEnviarListarClienteListener implements ActionListener{

	ListarClienteVista listarClienteVista;
	ClienteInterfaz clienteInterfaz;
	
	public BtnEnviarListarClienteListener() throws IOException {
		listarClienteVista = BtnListarClienteListener.listarClienteVista;
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(listarClienteVista.modelo.getColumnCount() != 8) {
			
			listarClienteVista.modelo.addColumn("Nombre");
			listarClienteVista.modelo.addColumn("Apellido");
			listarClienteVista.modelo.addColumn("Direccion");
			listarClienteVista.modelo.addColumn("Email");
			listarClienteVista.modelo.addColumn("Sexo");
			listarClienteVista.modelo.addColumn("Dni");
			listarClienteVista.modelo.addColumn("Telefono");
			listarClienteVista.modelo.addColumn("Nacimiento");
			
//			Nombre = nombre;
//			Apellido = apellido;
//			Direccion = direccion;
//			Mail = mail;
//			Sexo = sexo;
//			Dni = dni;
//			Telefono = telefono;
//			this.fechaNac = fechaNac;
			
			}
			
			ArrayList<Cliente> lista = null;
			
			
			try {
				
				lista = clienteInterfaz.ListarClientes();
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		
	    Object[] object = new Object[8];      
	    
	    listarClienteVista.modelo.setRowCount(0);
	 //   listarClienteVista.modelo.setColumnCount(0);

		
	    if (lista.size() != 0) {
	       for (int i = 0; i < lista.size(); i++) {

	    	   	object[0] = lista.get(i).getNombre();
	            object[1] = lista.get(i).getApellido();
	            object[2] = lista.get(i).getDni();
	            object[3] = lista.get(i).getFechaNac();
	            object[4] = lista.get(i).getDireccion();
	            object[5] = lista.get(i).getTelefono();
	            object[6] = lista.get(i).getSexo();
	            object[7] = lista.get(i).getMail();

	            listarClienteVista.modelo.addRow(object);
	    		
	        }
			

	    }

			}
	

}
