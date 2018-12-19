package org.Iteracion1Login;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

import org.Iteracion2GestionarSala.IU_SALA;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin {

	private JFrame frmLogin;
	private JTextField txtUsuario;
	private JLabel lblPass;
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
					VentanaLogin window = new VentanaLogin();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VentanaLogin() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/iconos/baker.png")));
		frmLogin.setTitle("Restaurante Magdalena");
		frmLogin.setBounds(100, 100, 450, 223);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(177, 54, 46, 14);
		frmLogin.getContentPane().add(lblUsuario);

		lblPass = new JLabel("Contraseña");
		lblPass.setEnabled(false);
		lblPass.setBounds(177, 95, 68, 14);
		frmLogin.getContentPane().add(lblPass);

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
		lblLblicono.setIcon(new ImageIcon(VentanaLogin.class.getResource("/iconos/Cocinero.png")));
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
			lblPass.setEnabled(true);
			txtPass.setEnabled(true);
		}
	}

	private class TxtContraseñaKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			btnAceptar.setEnabled(true);
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				btnAceptar.doClick();
			}
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
			Usuario u = new Usuario(txtUsuario.getText(), txtPass.getText());
			if (gu.comprobarUsuarioIntroducido(u)) {
				@SuppressWarnings("unused")
				IU_SALA iusala = new IU_SALA();
				frmLogin.dispose();
			} else {
				lblAviso.setBackground(Color.CYAN);
				lblAviso.setText("Contraseña incorrecta");
				btnAceptar.setEnabled(false);
			}

		}
	}
}
