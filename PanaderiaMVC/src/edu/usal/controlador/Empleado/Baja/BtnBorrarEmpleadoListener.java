package edu.usal.controlador.Empleado.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.controlador.Empleado.ItemsEmpleadoListener;
import edu.usal.vista.Empleado.BajaEmpleadoVista;
import edu.usal.vista.Frame;

public class BtnBorrarEmpleadoListener implements ActionListener{

	Frame frame;
	BajaEmpleadoVista bajaEmpleadoVista; 
	ItemsEmpleadoListener itemsEmpleadoListener;
	
	
	public BtnBorrarEmpleadoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		bajaEmpleadoVista = Controlador.bajaEmpleadoVista;
		itemsEmpleadoListener = new ItemsEmpleadoListener();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(bajaEmpleadoVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
		bajaEmpleadoVista.addListenerVolver(new BtnVolver());
		
		
		try {
			String[] hola = itemsEmpleadoListener.valores();
			
			bajaEmpleadoVista.comboBox.removeAllItems();
			
			for(int i=0;i<hola.length;i++) {
				bajaEmpleadoVista.comboBox.addItem(hola[i]);
			}
		} catch (IOException | SQLException e1) {
		}
		
		
	}

}
