package edu.usal.vista.Producto;

import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import edu.usal.controlador.Producto.ItemsProductoListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.jidesoft.swing.ComboBoxSearchable;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import com.jidesoft.swing.AutoCompletionComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

public class BajaProductoVista extends JPanel {
	public JButton btnEnviar;
	ItemsProductoListener itemsProductoListener;
	public JButton btnVolver;
	public AutoCompletionComboBox comboBox;

	public BajaProductoVista() throws IOException, SQLException {
		setBackground(SystemColor.activeCaption);

		itemsProductoListener = new ItemsProductoListener();
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(0, 0, 0));
		btnEnviar.setForeground(Color.ORANGE);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblIngreseElId = new JLabel("Ingrese el ID del producto a eliminar:");
		lblIngreseElId.setForeground(new Color(0, 51, 153));
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseElId.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		
		btnVolver = new JButton("Volver");
		
		comboBox = new AutoCompletionComboBox();
		
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
					.addContainerGap(334, Short.MAX_VALUE)
					.addComponent(btnVolver)
					.addGap(47))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(274, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(176))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(134)
					.addComponent(comboBox, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
					.addGap(150))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(btnVolver)
					.addGap(18)
					.addComponent(lblIngreseElId, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
					.addGap(37)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
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
