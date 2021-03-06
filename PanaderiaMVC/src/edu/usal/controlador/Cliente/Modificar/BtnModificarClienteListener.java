package edu.usal.controlador.Cliente.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.controlador.Cliente.ItemsClienteListener;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.vista.Frame;
import edu.usal.vista.Cliente.ModificarClienteVista;

public class BtnModificarClienteListener implements ActionListener {

	Frame frame;
	static ModificarClienteVista modificarClienteVista;
	CompletarCamposClientes completarCamposClientes;
	ItemsClienteListener itemsClienteListener;

	public BtnModificarClienteListener() throws IOException, SQLException {
		frame = Controlador.frame;
		modificarClienteVista = Controlador.modificarClienteVista;
		completarCamposClientes = new CompletarCamposClientes();
		itemsClienteListener = new ItemsClienteListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(modificarClienteVista);
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);

		completarCamposClientes.completar(0);

			try {

		modificarClienteVista.addListenerComboBox(new ModificarClienteComboListener());
//				modificarClienteVista.addListener(new BtnEnviarModificarClienteListener());
		modificarClienteVista.addListenerVolver(new BtnVolver());

			} catch (IOException e1) {
				
			e1.printStackTrace();
			}
		
		  try { String[] hola = itemsClienteListener.valores();
		  
		  modificarClienteVista.comboBox.removeAllItems();
		  
		  for(int i=0;i<hola.length;i++) {
		  modificarClienteVista.comboBox.addItem(hola[i]); } } catch (IOException |
		  SQLException e1) { }
		 

	}

}
