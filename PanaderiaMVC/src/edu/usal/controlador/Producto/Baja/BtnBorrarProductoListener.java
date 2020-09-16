package edu.usal.controlador.Producto.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.Producto.AltaProductoVista;
import edu.usal.vista.Producto.BajaProductoVista;
import edu.usal.vista.Frame;

public class BtnBorrarProductoListener implements ActionListener{

	Frame frame;
	BajaProductoVista bajaProductoVista; 
	
	
	public BtnBorrarProductoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		bajaProductoVista = new BajaProductoVista();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(bajaProductoVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
		try {
			bajaProductoVista.addListener(new BtnEnviarBorrarProductoListener());
			bajaProductoVista.addListenerVolver(new BtnVolver());
		} catch (IOException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
