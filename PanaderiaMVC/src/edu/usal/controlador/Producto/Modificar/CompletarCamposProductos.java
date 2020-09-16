package edu.usal.controlador.Producto.Modificar;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Producto;
import edu.usal.vista.Producto.ModificarProductoVista;



public class CompletarCamposProductos {
	
	ModificarProductoVista modificarProductoVista;
	ProductoInterfaz ProductoInterfaz;

	public CompletarCamposProductos() throws IOException {
		
		modificarProductoVista = BtnModificarProductoListener.modificarProductoVista;
		ProductoInterfaz = ProductoFactory.GetImplementation("MSSQL");
		
	}
	
		public void completar(int idSelec) {		
		
//	int idSelec = modificarProductoVista.comboBox.getSelectedIndex();
	
	ArrayList<Producto> alProductos = new ArrayList<Producto>();
	
	try {
		alProductos = ProductoInterfaz.ListarProducto();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	modificarProductoVista.tNombre.setText(alProductos.get(idSelec).getNombre());
	modificarProductoVista.tPrecio.setText(alProductos.get(idSelec).getPrecio().toString());
	modificarProductoVista.tDescripcion.setText(alProductos.get(idSelec).getDescripcion());
	modificarProductoVista.tCantidad.setText(alProductos.get(idSelec).getCantidad() + "");

	
		}
}
