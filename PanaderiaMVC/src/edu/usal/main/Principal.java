package edu.usal.main;

import java.awt.EventQueue;

import edu.usal.controlador.Controlador;
import edu.usal.vista.Frame;

public class Principal {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					Frame frame = new Frame();
					Controlador controlador = new Controlador(frame);
					
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
	}
	
	
}
