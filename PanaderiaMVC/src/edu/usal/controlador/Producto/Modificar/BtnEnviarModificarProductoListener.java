package edu.usal.controlador.Producto.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Producto;
import edu.usal.vista.Mensajes;
import edu.usal.vista.Producto.ModificarProductoVista;

public class BtnEnviarModificarProductoListener implements ActionListener {

	ProductoInterfaz ProductoInterfaz;
	ModificarProductoVista modificarProductoVista;
	
	public BtnEnviarModificarProductoListener() throws IOException {

		ProductoInterfaz = ProductoFactory.GetImplementation("MSSQL");
		modificarProductoVista = Controlador.modificarProductoVista;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		ArrayList<Producto> alProductos = new ArrayList<Producto>();
		
		try {
			alProductos = ProductoInterfaz.ListarProducto();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		int idSelec = alProductos.get(modificarProductoVista.comboBox.getSelectedIndex()).getIdProducto();
		
		try {
			
			if(modificarProductoVista.tCantidad.getText().matches("[0-9]+") && modificarProductoVista.tPrecio.getText().matches("[0-9]+[.]?[0-9]+")) {
				
				
				String nombre = modificarProductoVista.tNombre.getText();
				String descripcion = modificarProductoVista.tDescripcion.getText();
				BigDecimal precio = new BigDecimal(modificarProductoVista.tPrecio.getText());
				int cantidad = Integer.parseInt(modificarProductoVista.tCantidad.getText());
				

				JOptionPane.showMessageDialog(null, "Enviado.");
				
				Producto Producto = new Producto(nombre, descripcion, cantidad, 0 , precio);
				
				ProductoInterfaz.ModificarProducto(idSelec, Producto);
				
				}
				else {
					new Mensajes().ErrorNumerico();
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		
		
		
		

	}

}
