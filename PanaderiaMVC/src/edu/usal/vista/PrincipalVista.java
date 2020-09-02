package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import edu.usal.controlador.Cliente.Alta.BtnAltaClienteListener;
import edu.usal.controlador.Cliente.Baja.BtnBorrarClienteListener;
import edu.usal.controlador.Cliente.Listar.BtnListarClienteListener;
import edu.usal.controlador.Cliente.Modificar.BtnModificarClienteListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class PrincipalVista extends JPanel {
	public JButton btnAltaCliente;
	public JButton btnListarClientes;
	public JButton btnBorrarClientes;
	private JButton btnModificarClientes;

	public PrincipalVista() {
		setBackground(SystemColor.activeCaption);

		
		btnAltaCliente = new JButton("Alta Cliente");
		
		btnListarClientes = new JButton("Listar Clientes");
		
		btnBorrarClientes = new JButton("Eliminar Clientes");
		
		btnModificarClientes = new JButton("Modificar Clientes");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(165)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnModificarClientes, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBorrarClientes, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnAltaCliente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnListarClientes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(172, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(111)
					.addComponent(btnAltaCliente)
					.addGap(18)
					.addComponent(btnListarClientes)
					.addGap(18)
					.addComponent(btnBorrarClientes)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnModificarClientes)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public void addActionListeners(BtnAltaClienteListener btnAltaClienteListener) {
		btnAltaCliente.addActionListener(btnAltaClienteListener);		
	}
	public void addActionListeners2(BtnListarClienteListener btnListarClienteListener) {
		btnListarClientes.addActionListener(btnListarClienteListener);
	}
	public void addActionListeners3(BtnBorrarClienteListener btnBorrarClienteListener) {
		btnBorrarClientes.addActionListener(btnBorrarClienteListener);
	}
	public void addActionListeners4(BtnModificarClienteListener btnModificarClienteListener) {
		btnModificarClientes.addActionListener(btnModificarClienteListener);
	}
}
