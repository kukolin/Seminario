package edu.usal.vista;

import javax.swing.JOptionPane;

public class Mensajes {
	public void ErrorNumerico() {
		JOptionPane.showMessageDialog(null,"El campo debe ser num�rico.", "Error", JOptionPane.ERROR_MESSAGE);	
	}
	public void Realizado() {
		JOptionPane.showMessageDialog(null,"Realizado", "Warning", JOptionPane.WARNING_MESSAGE);	
	}
	public boolean Edad() {
		int edad = JOptionPane.showConfirmDialog(null, "Confirma tener mas de 18 a�os?");
		if(edad == JOptionPane.YES_OPTION) {return true;}
		else return false;
		
	}
	public void Verificar() {
		JOptionPane.showMessageDialog(null,"Por favor, verifique que todos los campos est�n completos y que el formato de las fechas sea el correcto (yyyy-MM-dd).", "Warning", JOptionPane.WARNING_MESSAGE);	
	}

	public void AcercaDe() {
		
		JOptionPane.showMessageDialog(null,"C�digo creado por: -Di Gregorio, Fiore \n\n Versi�n 0.1", "Acerca de...", JOptionPane.INFORMATION_MESSAGE);	
		
	}
	
}
