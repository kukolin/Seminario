package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.controlador.Login.LoginControlador;
import edu.usal.vista.Frame;
import edu.usal.vista.PrincipalVista;

public class BtnVolver implements ActionListener{
	
	Frame frame;
	PrincipalVista principalVista;

	public BtnVolver() {
		frame = Controlador.frame;
		principalVista = LoginControlador.principalVista;
}

	@Override
	public void actionPerformed(ActionEvent e) {

		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(principalVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);

		
		
	}

}
