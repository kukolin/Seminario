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
import edu.usal.controlador.Cliente.Alta.BtnAltaClienteListener;
import edu.usal.controlador.Cliente.Baja.BtnBorrarClienteListener;
import edu.usal.controlador.Cliente.Listar.BtnListarClienteListener;
import edu.usal.controlador.Cliente.Modificar.BtnModificarClienteListener;
import edu.usal.controlador.Empleado.Alta.BtnAltaEmpleadoListener;
import edu.usal.controlador.Empleado.Baja.BtnBorrarEmpleadoListener;
import edu.usal.controlador.Empleado.Listar.BtnListarEmpleadoListener;
import edu.usal.controlador.Empleado.Modificar.BtnModificarEmpleadoListener;
import edu.usal.controlador.Login.LoginControlador;
import edu.usal.controlador.Producto.Alta.BtnAltaProductoListener;
import edu.usal.controlador.Producto.Baja.BtnBorrarProductoListener;
import edu.usal.controlador.Producto.Listar.BtnListarProductoListener;
import edu.usal.controlador.Producto.Modificar.BtnModificarProductoListener;
import edu.usal.controlador.Registrarse.BtnAltaUsuarioListener;
import edu.usal.controlador.Venta.Alta.BtnAltaVentaListener;

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
	public JMenu mnNewMenu_1;
	public JMenuItem mnAltaCliente;
	public JMenuItem mntmBajaCliente;
	public JMenuItem mntmListarCliente;
	public JMenuItem mntmModificarCliente;
	public JMenu mnNewMenu_2;
	public JMenuItem mntmAltaEmpleado;
	public JMenuItem mntmBajaMepleado;
	public JMenuItem mntmListarempleado;
	public JMenuItem mntmModificarEmpleado;
	public JMenu mnNewMenu_3;
	public JMenuItem mntmAltaProducto;
	public JMenuItem mntmBajaProducto;
	public JMenuItem mntmListarProducto;
	public JMenuItem mntmModificarproducto;
	public JMenu mnNewMenu_4;
	public JMenuItem mntmAltaVenta;
	public JButton btnRegistrarse;

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
		setBounds(100, 100, 890, 622);
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
		
		mnNewMenu_1 = new JMenu("Cliente");
		mnNewMenu_1.setVisible(false);
		menuBar.add(mnNewMenu_1);
		
		mnAltaCliente = new JMenuItem("Alta Cliente");
		mnNewMenu_1.add(mnAltaCliente);
		
		mntmBajaCliente = new JMenuItem("Baja Cliente");
		mnNewMenu_1.add(mntmBajaCliente);
		
		mntmListarCliente = new JMenuItem("Listar Cliente");
		mnNewMenu_1.add(mntmListarCliente);
		
		mntmModificarCliente = new JMenuItem("Modificar Cliente");
		mnNewMenu_1.add(mntmModificarCliente);
		
		mnNewMenu_2 = new JMenu("Empleados");
		mnNewMenu_2.setVisible(false);
		menuBar.add(mnNewMenu_2);
		
		mntmAltaEmpleado = new JMenuItem("Alta Empleado");
		mnNewMenu_2.add(mntmAltaEmpleado);
		
		mntmBajaMepleado = new JMenuItem("Baja Empleado");
		mnNewMenu_2.add(mntmBajaMepleado);
		
		mntmListarempleado = new JMenuItem("Listar Empleado");
		mnNewMenu_2.add(mntmListarempleado);
		
		mntmModificarEmpleado = new JMenuItem("Modificar Empleado");
		mnNewMenu_2.add(mntmModificarEmpleado);
		
		mnNewMenu_3 = new JMenu("Productos");
		mnNewMenu_3.setVisible(false);
		menuBar.add(mnNewMenu_3);
		
		mntmAltaProducto = new JMenuItem("Alta Producto");
		mnNewMenu_3.add(mntmAltaProducto);
		
		mntmBajaProducto = new JMenuItem("Baja Producto");
		mnNewMenu_3.add(mntmBajaProducto);
		
		mntmListarProducto = new JMenuItem("Listar Producto");
		mnNewMenu_3.add(mntmListarProducto);
		
		mntmModificarproducto = new JMenuItem("Modificar Producto");
		mnNewMenu_3.add(mntmModificarproducto);
		
		mnNewMenu_4 = new JMenu("Venta");
		mnNewMenu_4.setVisible(false);
		menuBar.add(mnNewMenu_4);
		
		mntmAltaVenta = new JMenuItem("Alta Venta");
		mnNewMenu_4.add(mntmAltaVenta);
		
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
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setForeground(Color.BLACK);
		btnRegistrarse.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(lblBienvenido, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
							.addGap(201))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addComponent(btnRegistrarse, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
									.addComponent(btnNewButton))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2))
									.addGap(72)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(passwordField)
										.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED, 184, Short.MAX_VALUE)))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
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
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton)
										.addComponent(btnRegistrarse)))
								.addComponent(lblNewLabel_1)))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(268, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	
	public void addActionListener(LoginControlador loginControlador, MenuListener menuListener) {
		btnNewButton.addActionListener(loginControlador);
		mntmAcercaDe.addActionListener(menuListener);
		mntmSalir.addActionListener(menuListener);
		mntmDesloguearse.addActionListener(menuListener);
	}
	public void addActionListeners(BtnAltaClienteListener btnAltaClienteListener) {
		mnAltaCliente.addActionListener(btnAltaClienteListener);		
	}
	public void addActionListeners2(BtnListarClienteListener btnListarClienteListener) {
		mntmListarCliente.addActionListener(btnListarClienteListener);
	}
	public void addActionListeners3(BtnBorrarClienteListener btnBorrarClienteListener) {
		mntmBajaCliente.addActionListener(btnBorrarClienteListener);
	}
	public void addActionListeners4(BtnModificarClienteListener btnModificarClienteListener) {
		mntmModificarCliente.addActionListener(btnModificarClienteListener);
	}
	public void addActionListeners5(BtnAltaProductoListener btnAltaProductoListener ) {
		mntmAltaProducto.addActionListener(btnAltaProductoListener);
	}
	public void addActionListeners6(BtnListarProductoListener btnListarProductoListener ) {
		mntmListarProducto.addActionListener(btnListarProductoListener);
	}
	public void addActionListeners7(BtnBorrarProductoListener btnBorrarProductoListener ) {
		mntmBajaProducto.addActionListener(btnBorrarProductoListener);
	}
	public void addActionListeners8(BtnModificarProductoListener btnModificarProductoListener ) {
		mntmModificarproducto.addActionListener(btnModificarProductoListener);
	}
	public void addActionListeners9(BtnAltaVentaListener btnAltaVentaListener ) {
		mntmAltaVenta.addActionListener(btnAltaVentaListener);
	}
//	public void addActionListeners10(BtnListarVentaListener asd) {
//		btnAltaVenta.addActionListener(asd);
//	}
	public void addActionListeners11(BtnAltaEmpleadoListener btnAltaEmpleadoListener ) {
		mntmAltaEmpleado.addActionListener(btnAltaEmpleadoListener);
	}

	public void addActionListeners12(BtnListarEmpleadoListener btnListarEmpleadoListener) {
		mntmListarempleado.addActionListener(btnListarEmpleadoListener);
	}

	public void addActionListeners13(BtnBorrarEmpleadoListener btnBorrarEmpleadoListener) {
		mntmBajaMepleado.addActionListener(btnBorrarEmpleadoListener);
	}

	public void addActionListeners14(BtnModificarEmpleadoListener btnModificarEmpleadoListener) {
		mntmModificarEmpleado.addActionListener(btnModificarEmpleadoListener);		
	}
	
	public void addActionListeners15(BtnAltaUsuarioListener btnAltaUsuarioListener) {
		btnRegistrarse.addActionListener(btnAltaUsuarioListener);		
	}
	
}
