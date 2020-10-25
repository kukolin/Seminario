package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.LayoutStyle.ComponentPlacement;
import cambodia.raven.DateChooser;
import java.awt.event.ActionEvent;

public class RegistroVista extends JPanel {
	public JButton btnEnviar;
	public JTextField tNombre;
	public JTextField tPassword2;
	private JLabel lblApellido;
	public ButtonGroup grupo;

	/**
	 * @wbp.nonvisual location=180,694
	 */
	private final DateChooser dcFechaNac = new DateChooser();
	public JTextField tPassword;
	public JButton btnVolver;

	public RegistroVista() throws IOException, SQLException {
		setBackground(SystemColor.activeCaption);

		
		grupo = new ButtonGroup();
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(new Color(0, 51, 153));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNombre = new JLabel("Nombre de usuario:");
		lblNombre.setForeground(new Color(0, 51, 153));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblDni = new JLabel("Repetir contrase\u00F1a:");
		lblDni.setForeground(new Color(0, 51, 153));
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tNombre = new JTextField();
		tNombre.setColumns(10);
		
		tPassword2 = new JTextField();
		tPassword2.setColumns(10);
		
		lblApellido = new JLabel("Contrase\u00F1a:");
		lblApellido.setForeground(new Color(0, 51, 153));
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tPassword = new JTextField();
		tPassword.setColumns(10);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(140)
										.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(23)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(tPassword2)
											.addComponent(tPassword)
											.addComponent(tNombre, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
								.addContainerGap(138, Short.MAX_VALUE))
							.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblDni))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnVolver)
							.addGap(51))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(btnVolver)
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(tPassword2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(80)
					.addComponent(btnEnviar)
					.addGap(201))
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
