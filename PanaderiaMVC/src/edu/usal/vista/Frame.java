package edu.usal.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.usal.controlador.Controlador;
import edu.usal.controlador.MenuListener;
import edu.usal.controlador.Login.LoginControlador;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Frame extends JFrame {

	public JPanel contentPane;
	public JMenu mnNewMenu;
	public JMenuItem mntmAcercaDe;
	public JMenuItem mntmSalir;
	public JPanel panel;
	public JPasswordField passwordField;
	public JTextPane textPane;
	public JButton btnNewButton;
	public JMenuItem mntmDesloguearse;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws SQLException 
	 */
	public Frame() throws IOException, SQLException {
		
//		Controlador controlador = new Controlador(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 518);
		setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo...");
		menuBar.add(mnNewMenu);
		
		mntmDesloguearse = new JMenuItem("Cerrar sesión");
		mnNewMenu.add(mntmDesloguearse);
		
		mntmAcercaDe = new JMenuItem("Acerca de...");
//		mntmAcercaDe.addActionListener(controlador);
		mnNewMenu.add(mntmAcercaDe);
		
		mntmSalir = new JMenuItem("Salir");
//		mntmSalir.addActionListener(controlador);
		mnNewMenu.add(mntmSalir);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel, "name_202213171225400");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("Logo2.png"));
		
		JLabel lblBienvenido = new JLabel("Bienvenido! ");
		lblBienvenido.setForeground(new Color(0, 51, 153));
		lblBienvenido.setFont(new Font("Clibri", Font.ITALIC, 20));
		
		textPane = new JTextPane();
		
		passwordField = new JPasswordField();
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(0, 51, 153));
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(0, 51, 153));
		
		btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(57)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2))
									.addGap(72)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(passwordField)
										.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnNewButton)))
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(lblBienvenido, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
							.addGap(201)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addGap(70))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblBienvenido, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(38)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2))
									.addGap(68)
									.addComponent(btnNewButton))
								.addComponent(lblNewLabel_1)))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	
	public void addActionListeners(LoginControlador loginControlador, MenuListener menuListener) {
		btnNewButton.addActionListener(loginControlador);
		mntmAcercaDe.addActionListener(menuListener);
		mntmSalir.addActionListener(menuListener);
		mntmDesloguearse.addActionListener(menuListener);
		
		
	}
}
