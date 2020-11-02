package edu.usal.controlador.Producto.Listar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Producto;
import edu.usal.vista.Producto.ListarProductoVista;

public class BtnEnviarListarProductoListener implements ActionListener{

	ListarProductoVista listarProductoVista;
	ProductoInterfaz ProductoInterfaz;
	
	public BtnEnviarListarProductoListener() throws IOException {
		listarProductoVista = Controlador.listarProductoVista;
		ProductoInterfaz = ProductoFactory.GetImplementation("MSSQL");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(listarProductoVista.modelo.getColumnCount() != 4) {
			
			listarProductoVista.modelo.addColumn("Nombre");
			listarProductoVista.modelo.addColumn("Precio");
			listarProductoVista.modelo.addColumn("Cantidad");
			listarProductoVista.modelo.addColumn("Descripcion");

			
			}
			
			ArrayList<Producto> lista = null;
			
			
			try {
				
				lista = ProductoInterfaz.ListarProducto();
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		
	    Object[] object = new Object[4];      
	    
	    listarProductoVista.modelo.setRowCount(0);
	 //   listarProductoVista.modelo.setColumnCount(0);

		
	    if (lista.size() != 0) {
	       for (int i = 0; i < lista.size(); i++) {

	    	   	object[0] = lista.get(i).getNombre();
	            object[1] = lista.get(i).getPrecio();
	            object[2] = lista.get(i).getCantidad();
	            object[3] = lista.get(i).getDescripcion();

	            listarProductoVista.modelo.addRow(object);
	    		
	        }
			

	    }

			}
	

}
