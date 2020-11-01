package edu.usal.controlador.Cliente.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.controlador.Cliente.ItemsClienteListener;
import edu.usal.vista.Cliente.AltaClienteVista;
import edu.usal.vista.Cliente.BajaClienteVista;
import edu.usal.vista.Frame;

public class BtnBorrarClienteListener implements ActionListener{

	Frame frame;
	BajaClienteVista bajaClienteVista;
//	BtnEnviarBorrarClienteListener btnEnviarBorrarClienteListener;
	ItemsClienteListener itemsClienteListener;
	
	public BtnBorrarClienteListener() throws IOException, SQLException {
		frame = Controlador.frame;
		bajaClienteVista = Controlador.bajaClienteVista;
//		btnEnviarBorrarClienteListener = new BtnEnviarBorrarClienteListener();
		itemsClienteListener = new ItemsClienteListener();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(bajaClienteVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
//		bajaClienteVista.addListener(btnEnviarBorrarClienteListener);
		bajaClienteVista.addListenerVolver(new BtnVolver());
		
		
		try {
			String[] hola = itemsClienteListener.valores();
			
			bajaClienteVista.comboBox.removeAllItems();
			
			for(int i=0;i<hola.length;i++) {
				bajaClienteVista.comboBox.addItem(hola[i]);
			}
		} catch (IOException | SQLException e1) {
		}
		
		
	}

}
