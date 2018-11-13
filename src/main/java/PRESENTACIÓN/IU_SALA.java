package PRESENTACIÓN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class IU_SALA {

	private JFrame frmGestinDeSala;

	
	public IU_SALA() {
		initialize();
		frmGestinDeSala.setVisible(true);
	}

	
	private void initialize() {
		frmGestinDeSala = new JFrame();
		frmGestinDeSala.setTitle("Gestión de sala");
		frmGestinDeSala.setIconImage(Toolkit.getDefaultToolkit().getImage(IU_SALA.class.getResource("/PRESENTACIÓN/iconos/baker.png")));
		frmGestinDeSala.setBounds(100, 100, 663, 350);
		frmGestinDeSala.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{25, 87, 26, 129, 111, 0, 0};
		gridBagLayout.rowHeights = new int[]{18, 0, 0, 215, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frmGestinDeSala.getContentPane().setLayout(gridBagLayout);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		frmGestinDeSala.getContentPane().add(label, gbc_label);
		
		JLabel lblMesas = new JLabel("Mesas");
		GridBagConstraints gbc_lblMesas = new GridBagConstraints();
		gbc_lblMesas.insets = new Insets(0, 0, 5, 5);
		gbc_lblMesas.gridx = 1;
		gbc_lblMesas.gridy = 1;
		frmGestinDeSala.getContentPane().add(lblMesas, gbc_lblMesas);
		
		JLabel label_1 = new JLabel("  ");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 1;
		frmGestinDeSala.getContentPane().add(label_1, gbc_label_1);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 2;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		frmGestinDeSala.getContentPane().add(list, gbc_list);
		
		JLabel lblEstadoActual = new JLabel("ESTADO ACTUAL:");
		GridBagConstraints gbc_lblEstadoActual = new GridBagConstraints();
		gbc_lblEstadoActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstadoActual.gridx = 3;
		gbc_lblEstadoActual.gridy = 2;
		frmGestinDeSala.getContentPane().add(lblEstadoActual, gbc_lblEstadoActual);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 2;
		frmGestinDeSala.getContentPane().add(comboBox, gbc_comboBox);
	}

}
