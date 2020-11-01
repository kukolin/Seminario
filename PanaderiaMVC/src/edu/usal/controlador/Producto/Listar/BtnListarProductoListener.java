package edu.usal.controlador.Producto.Listar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.Frame;
import edu.usal.vista.Producto.ListarProductoVista;

public class BtnListarProductoListener implements ActionListener {

	Frame frame;
	static ListarProductoVista listarProductoVista;

	public BtnListarProductoListener() throws IOException {
		frame = Controlador.frame;
		listarProductoVista = Controlador.listarProductoVista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(listarProductoVista);
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);

		
	//		listarProductoVista.addListener(new BtnEnviarListarProductoListener());
			listarProductoVista.addListenerVolver(new BtnVolver());

		 
	}

}
