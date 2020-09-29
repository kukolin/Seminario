package edu.usal.controlador.Producto.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import edu.usal.controlador.Login.LoginControlador;
import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Producto;
import edu.usal.vista.Producto.AltaProductoVista;
import edu.usal.vista.Mensajes;

public class BtnEnviarAltaProductoListener implements ActionListener{
	
	AltaProductoVista altaProductoVista;
	ProductoInterfaz ProductoInterfaz;
	
	public BtnEnviarAltaProductoListener() throws IOException {
		altaProductoVista = BtnAltaProductoListener.altaProductoVista;
		ProductoInterfaz = ProductoFactory.GetImplementation("MSSQL");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		try {
			
			if(altaProductoVista.tCantidad.getText().matches("[0-9]+") && altaProductoVista.tPrecio.getText().matches("[0-9]+[.]?[0-9]+")) {
			
				
			String nombre = altaProductoVista.tNombre.getText();
			String descripcion = altaProductoVista.tDescripcion.getText();
			BigDecimal precio = new BigDecimal(altaProductoVista.tPrecio.getText());
			int cantidad = Integer.parseInt(altaProductoVista.tCantidad.getText());
			

			JOptionPane.showMessageDialog(null, "Enviado.");
			
			Producto Producto = new Producto(nombre, descripcion, cantidad, 0 , precio);
			
			ProductoInterfaz.AltaProducto(Producto);
			
			}
			else {
				new Mensajes().ErrorNumerico();
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
