package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.LayoutStyle.ComponentPlacement;
import cambodia.raven.DateChooser;
import edu.usal.controlador.Cliente.ItemsClienteListener;

import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;

public class ModificarClienteVista extends JPanel {
	public JButton btnEnviar;
	public JTextField tNombre;
	public JTextField tDni;
	public JTextField tDireccion;
	public JTextField tFechaNac;
	private JLabel lblApellido;
	private JLabel lblNombre_12;
	public JTextField tTelefono;
	public ButtonGroup grupo;
	ItemsClienteListener itemsClienteListener;

	/**
	 * @wbp.nonvisual location=180,694
	 */
	private final DateChooser dcFechaNac = new DateChooser();
	public JTextField tApellido;
	public JRadioButton rdbtnF;
	public JRadioButton rdbtnM;
	public JTextField tEmail;
	public JButton btnVolver;
	public JComboBox comboBox;

	public ModificarClienteVista() throws IOException, SQLException {
		setBackground(SystemColor.activeCaption);

		itemsClienteListener = new ItemsClienteListener();
		grupo = new ButtonGroup();
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(new Color(0, 51, 153));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setForeground(new Color(0, 51, 153));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(new Color(0, 51, 153));
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNumeroPasaporte = new JLabel("Direccion");
		lblNumeroPasaporte.setForeground(new Color(0, 51, 153));
		lblNumeroPasaporte.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_1 = new JLabel("Sexo");
		lblNombre_1.setForeground(new Color(0, 51, 153));
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_2 = new JLabel("Fecha Nacimiento: ");
		lblNombre_2.setForeground(new Color(0, 51, 153));
		lblNombre_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tNombre = new JTextField();
		tNombre.setColumns(10);
		
		tDni = new JTextField();
		tDni.setColumns(10);
		
		tDireccion = new JTextField();
		tDireccion.setColumns(10);
		
		tFechaNac = new JTextField();
		dcFechaNac.setTextRefernce(tFechaNac);
		tFechaNac.setColumns(10);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setForeground(new Color(0, 51, 153));
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNombre_12 = new JLabel("Telefono");
		lblNombre_12.setForeground(new Color(0, 51, 153));
		lblNombre_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tTelefono = new JTextField();
		tTelefono.setColumns(10);
		
		JButton btnFechaEmic_2 = new JButton("...");
		dcFechaNac.setButton(btnFechaEmic_2);
		
		tApellido = new JTextField();
		tApellido.setColumns(10);
		
		rdbtnM = new JRadioButton("M", null, true);
		
		rdbtnF = new JRadioButton("F");
		
		grupo.add(rdbtnM);
		grupo.add(rdbtnF);
		
		JLabel lblNombre_12_1 = new JLabel("Email");
		lblNombre_12_1.setForeground(new Color(0, 51, 153));
		lblNombre_12_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tEmail = new JTextField();
		tEmail.setColumns(10);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setForeground(new Color(0, 51, 153));
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBox = new JComboBox(itemsClienteListener.valores());
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDni, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNumeroPasaporte, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tFechaNac, GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE)
									.addGap(30)
									.addComponent(btnFechaEmic_2))
								.addComponent(tDireccion, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
								.addComponent(tDni, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
								.addComponent(tNombre, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNombre_12, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNombre_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(rdbtnM)
											.addGap(18)
											.addComponent(rdbtnF)
											.addGap(70))
										.addComponent(tApellido, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
										.addComponent(tTelefono, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNombre_12_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
										.addComponent(tEmail, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, 0, 312, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnVolver)))
					.addGap(213))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnVolver)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(tDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rdbtnM)
						.addComponent(rdbtnF))
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumeroPasaporte, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_12, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre_2, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(btnFechaEmic_2)
						.addComponent(tFechaNac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_12_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(tEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
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
	public void addListenerComboBox(ItemListener al) {
		
		comboBox.addItemListener(al);
		
	}
}
