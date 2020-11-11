package edu.usal.controlador.Producto.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Producto;
import edu.usal.vista.Producto.BajaProductoVista;
import edu.usal.vista.Mensajes;

public class BtnEnviarBorrarProductoListener implements ActionListener{

	Mensajes mensaje;
	BajaProductoVista bajaProducto;
	ProductoInterfaz cliInter;
	
	public BtnEnviarBorrarProductoListener() throws IOException, SQLException{
		cliInter = ProductoFactory.GetImplementation("MSSQL");
		bajaProducto = Controlador.bajaProductoVista;
		mensaje = new Mensajes();

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<Producto> alProductos = new ArrayList<Producto>();
		
		try {
			alProductos = cliInter.ListarProducto();
		} catch (SQLException e1) {
			e1.printStackTrace();
			mensaje.Verificar();
		}
		
		int idSelec = alProductos.get(bajaProducto.comboBox.getSelectedIndex()).getIdProducto();
		
		try {
			
				
				
				cliInter.BajaProducto(idSelec);
				
				mensaje.Realizado();
					
			
			
		} catch (NumberFormatException | SQLException e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se pudo registrar en la base de datos. Verifique que el producto no exista.");

		}		
	}

}
