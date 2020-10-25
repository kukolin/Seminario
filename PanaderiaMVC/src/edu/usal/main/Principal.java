package edu.usal.main;

import java.awt.EventQueue;

import javax.swing.UIManager;

import edu.usal.controlador.Controlador;
import edu.usal.vista.Frame;

public class Principal {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					
					Frame frame = new Frame();
					Controlador controlador = new Controlador(frame);

					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

					frame.setVisible(true);

				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
	}
	
	
}
