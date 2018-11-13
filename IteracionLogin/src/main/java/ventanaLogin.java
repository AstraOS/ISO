
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.UIManager;


import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaLogin {

	private JFrame frmLogin;
	private JTextField txtUsuario;
	private JLabel lblContraseña;
	private JButton btnAceptar;
	private JPasswordField txtPass;
	private JLabel lblAviso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaLogin window = new ventanaLogin();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws SQLException
	 */
	public ventanaLogin() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage(ventanaLogin.class.getResource("/Presentación/iconos/baker.png")));
		frmLogin.setTitle("Restaurante Magdalena");
		frmLogin.setBounds(100, 100, 450, 223);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(177, 54, 46, 14);
		frmLogin.getContentPane().add(lblUsuario);

		lblContraseña = new JLabel("Contraseña");
		lblContraseña.setEnabled(false);
		lblContraseña.setBounds(177, 95, 68, 14);
		frmLogin.getContentPane().add(lblContraseña);

		txtUsuario = new JTextField();
		txtUsuario.addKeyListener(new TxtUsuarioKeyListener());
		txtUsuario.setBounds(255, 51, 130, 20);
		frmLogin.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		btnAceptar.setEnabled(false);
		btnAceptar.setBounds(275, 147, 89, 23);
		frmLogin.getContentPane().add(btnAceptar);

		JLabel lblLblicono = new JLabel("lblIcono");
		lblLblicono.setIcon(new ImageIcon(ventanaLogin.class.getResource("/PRESENTACIÓN/iconos/Cocinero.png")));
		lblLblicono.setBounds(21, 26, 113, 102);
		frmLogin.getContentPane().add(lblLblicono);

		lblAviso = new JLabel("");
		lblAviso.setOpaque(true);
		lblAviso.setBounds(255, 122, 130, 14);
		frmLogin.getContentPane().add(lblAviso);

		txtPass = new JPasswordField();
		txtPass.addKeyListener(new TxtContraseñaKeyListener());
		txtPass.setEnabled(false);
		txtPass.setBounds(255, 92, 130, 20);
		frmLogin.getContentPane().add(txtPass);

	}

	private class TxtUsuarioKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			lblContraseña.setEnabled(true);
			txtPass.setEnabled(true);
		}
	}

	private class TxtContraseñaKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			btnAceptar.setEnabled(true);
		}
	}

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			GestorUsuarios gu = new GestorUsuarios();
			try {
				gu.leerUsuarios();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			@SuppressWarnings("deprecation")
			Usuario u=new Usuario(txtUsuario.getText(),txtPass.getText());
			if(gu.comprobarUsuarioIntroducido(u)) {
				//RESERVAS
				frmLogin.dispose();
			} else {
				lblAviso.setBackground(Color.CYAN);
				lblAviso.setText("Contraseña incorrecta");
				btnAceptar.setEnabled(false);
			}
			
		}
	}
}
