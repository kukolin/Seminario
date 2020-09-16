package edu.usal.controlador.Producto.Modificar;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;


import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.vista.Producto.ModificarProductoVista;

public class ModificarProductoComboListener implements ItemListener{

	ModificarProductoVista modificarProductoVista;
	ProductoInterfaz ProductoInterfaz;
	CompletarCamposProductos camposProductos;
	
	public ModificarProductoComboListener() throws IOException {

		modificarProductoVista = BtnModificarProductoListener.modificarProductoVista;
		ProductoInterfaz = ProductoFactory.GetImplementation("MSSQL");
		camposProductos = new CompletarCamposProductos();
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {


		 int idSelec = modificarProductoVista.comboBox.getSelectedIndex();
		
		 camposProductos.completar(idSelec);
		
		
		
	}

}
