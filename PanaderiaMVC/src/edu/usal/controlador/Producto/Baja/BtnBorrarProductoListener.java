package edu.usal.controlador.Producto.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JComboBox;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.controlador.Producto.ItemsProductoListener;
import edu.usal.vista.Producto.AltaProductoVista;
import edu.usal.vista.Producto.BajaProductoVista;
import edu.usal.vista.Frame;

public class BtnBorrarProductoListener implements ActionListener{

	Frame frame;
	BajaProductoVista bajaProductoVista; 
	ItemsProductoListener itemsProductoListener;
	
	public BtnBorrarProductoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		itemsProductoListener = new ItemsProductoListener();
		bajaProductoVista = Controlador.bajaProductoVista;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(bajaProductoVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
						
	//		bajaProductoVista.addListener(new BtnEnviarBorrarProductoListener());
			bajaProductoVista.addListenerVolver(new BtnVolver());

			try {
				String[] hola = itemsProductoListener.valores();
				
				bajaProductoVista.comboBox.removeAllItems();
				
				for(int i=0;i<hola.length;i++) {
					bajaProductoVista.comboBox.addItem(hola[i]);
				}
			} catch (IOException | SQLException e1) {
			}
		
	}

}
