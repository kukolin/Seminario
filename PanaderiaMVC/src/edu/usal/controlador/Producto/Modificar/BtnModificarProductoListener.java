package edu.usal.controlador.Producto.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.negocio.dominio.Producto;
import edu.usal.vista.Frame;
import edu.usal.vista.Producto.ModificarProductoVista;

public class BtnModificarProductoListener implements ActionListener{

	Frame frame;
	static ModificarProductoVista modificarProductoVista;
	CompletarCamposProductos completarCamposProductos;
	
	public BtnModificarProductoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		modificarProductoVista = new ModificarProductoVista();
		completarCamposProductos = new CompletarCamposProductos();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(modificarProductoVista);
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
		completarCamposProductos.completar(0);

		
			try {
				
				modificarProductoVista.addListenerComboBox(new ModificarProductoComboListener());
				modificarProductoVista.addListener(new BtnEnviarModificarProductoListener());
				modificarProductoVista.addListenerVolver(new BtnVolver());

			} catch (IOException e1) {
				
				e1.printStackTrace();
			}

		  
	}

}
