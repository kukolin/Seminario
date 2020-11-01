package edu.usal.controlador.Producto.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.controlador.Login.LoginControlador;
import edu.usal.vista.Producto.AltaProductoVista;
import edu.usal.vista.Frame;

public class BtnAltaProductoListener implements ActionListener{
	
	
	Frame frame;
	public static AltaProductoVista altaProductoVista;
	
	public BtnAltaProductoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		altaProductoVista = Controlador.altaProductoVista;

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(altaProductoVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
	//		altaProductoVista.addListener(new BtnEnviarAltaProductoListener());
			altaProductoVista.addListenerVolver(new BtnVolver());

		
		
	}

}
