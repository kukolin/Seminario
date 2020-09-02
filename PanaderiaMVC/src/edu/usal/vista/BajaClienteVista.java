package edu.usal.vista;

import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import edu.usal.controlador.Cliente.ItemsClienteListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class BajaClienteVista extends JPanel {
	public JButton btnEnviar;
	public JComboBox comboBox;
	ItemsClienteListener itemsClienteListener;
	public JButton btnVolver;

	public BajaClienteVista() throws IOException, SQLException {
		setBackground(SystemColor.activeCaption);

		itemsClienteListener = new ItemsClienteListener();
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(0, 0, 0));
		btnEnviar.setForeground(Color.ORANGE);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblIngreseElId = new JLabel("Ingrese el ID del cliente a eliminar:");
		lblIngreseElId.setForeground(new Color(0, 51, 153));
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseElId.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		
		comboBox = new JComboBox(itemsClienteListener.valores());
		
		btnVolver = new JButton("Volver");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(120)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
					.addGap(114))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(163)
					.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
					.addGap(171))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(189)
					.addComponent(lblNewLabel)
					.addContainerGap(261, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(142)
					.addComponent(comboBox, 0, 159, Short.MAX_VALUE)
					.addGap(149))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(306, Short.MAX_VALUE)
					.addComponent(btnVolver)
					.addGap(47))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(btnVolver)
					.addGap(18)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(70))
		);
		setLayout(groupLayout);
		
		
		

	}
	public void addListener(ActionListener al) {
		btnEnviar.addActionListener(al);
	}
	public void addListenerVolver(ActionListener al) {
		btnVolver.addActionListener(al);
	}
}
