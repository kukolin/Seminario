package edu.usal.controlador.Cliente.Listar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.Frame;
import edu.usal.vista.ListarClienteVista;

public class BtnListarClienteListener implements ActionListener {

	Frame frame;
	static ListarClienteVista listarClienteVista;

	public BtnListarClienteListener() throws IOException {
		frame = Controlador.frame;
		listarClienteVista = new ListarClienteVista();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(listarClienteVista);
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);

		
		  try {
			listarClienteVista.addListener(new BtnEnviarListarClienteListener());
			listarClienteVista.addListenerVolver(new BtnVolver());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		  
		 
	}

}
