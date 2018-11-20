package PRESENTACIÓN;

import javax.swing.JFrame;
import javax.swing.JList;

import java.awt.GridBagLayout;
import java.awt.Toolkit;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

import javax.swing.JTextField;


import DOMINIO.GestorSala;
import DOMINIO.Mesa;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IU_SALA {

	private JFrame frmGestinDeSala;
	private JTextField txtEstado;
	private JTextField txtId;
	GestorSala gs;
	private JList<Mesa> list;
	private JButton btnReservarMesa;

	public IU_SALA() {
		
		initialize();
		frmGestinDeSala.setVisible(true);

	}

	private void initialize() {
		gs=new GestorSala();
		frmGestinDeSala = new JFrame();
		frmGestinDeSala.setTitle("Gestión de sala");
		frmGestinDeSala.setIconImage(
				Toolkit.getDefaultToolkit().getImage(IU_SALA.class.getResource("/PRESENTACIÓN/iconos/baker.png")));
		frmGestinDeSala.setBounds(100, 100, 593, 207);
		frmGestinDeSala.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 25, 87, 48, 30, 129, 225, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 18, 0, 0, 0, 28, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		frmGestinDeSala.getContentPane().setLayout(gridBagLayout);

		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		frmGestinDeSala.getContentPane().add(label, gbc_label);

		JLabel lblNewLabel = new JLabel("Mesas");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frmGestinDeSala.getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		JLabel label_1 = new JLabel("  ");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 3;
		gbc_label_1.gridy = 1;
		frmGestinDeSala.getContentPane().add(label_1, gbc_label_1);

		JLabel lblIdMesa = new JLabel("ID MESA:");
		GridBagConstraints gbc_lblIdMesa = new GridBagConstraints();
		gbc_lblIdMesa.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdMesa.gridx = 4;
		gbc_lblIdMesa.gridy = 2;
		frmGestinDeSala.getContentPane().add(lblIdMesa, gbc_lblIdMesa);

		txtId = new JTextField();
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 5;
		gbc_txtId.gridy = 2;
		frmGestinDeSala.getContentPane().add(txtId, gbc_txtId);
		txtId.setColumns(10);

		list = new JList<Mesa>();
		list.addListSelectionListener(new ListListSelectionListener());
		DefaultListModel<Mesa> listModel=new DefaultListModel<Mesa>();
		
		for (int i = 0; i < gs.getListaMesas().size(); i++) {
			listModel.add(i, gs.getListaMesas().get(i));
		}
		
		list.setModel(listModel);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.gridheight = 4;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		frmGestinDeSala.getContentPane().add(list, gbc_list);

		
		JLabel lblEstadoActual = new JLabel("ESTADO ACTUAL:");
		GridBagConstraints gbc_lblEstadoActual = new GridBagConstraints();
		gbc_lblEstadoActual.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstadoActual.gridx = 4;
		gbc_lblEstadoActual.gridy = 3;
		frmGestinDeSala.getContentPane().add(lblEstadoActual, gbc_lblEstadoActual);

		txtEstado = new JTextField();
		GridBagConstraints gbc_txtEstado = new GridBagConstraints();
		gbc_txtEstado.insets = new Insets(0, 0, 5, 5);
		gbc_txtEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEstado.gridx = 5;
		gbc_txtEstado.gridy = 3;
		frmGestinDeSala.getContentPane().add(txtEstado, gbc_txtEstado);
		txtEstado.setColumns(10);

		JLabel lblRecordatorioParaHacer = new JLabel(
				"Recordatorio: Para hacer la reserva de una mesa, debe estar libre");
		GridBagConstraints gbc_lblRecordatorioParaHacer = new GridBagConstraints();
		gbc_lblRecordatorioParaHacer.gridwidth = 2;
		gbc_lblRecordatorioParaHacer.insets = new Insets(0, 0, 5, 5);
		gbc_lblRecordatorioParaHacer.gridx = 4;
		gbc_lblRecordatorioParaHacer.gridy = 4;
		frmGestinDeSala.getContentPane().add(lblRecordatorioParaHacer, gbc_lblRecordatorioParaHacer);

		btnReservarMesa = new JButton("Reservar mesa");
		btnReservarMesa.addActionListener(new BtnReservarMesaActionListener());
		btnReservarMesa.setEnabled(false);
		GridBagConstraints gbc_btnReservarMesa = new GridBagConstraints();
		gbc_btnReservarMesa.gridwidth = 2;
		gbc_btnReservarMesa.insets = new Insets(0, 0, 0, 5);
		gbc_btnReservarMesa.gridx = 4;
		gbc_btnReservarMesa.gridy = 5;
		frmGestinDeSala.getContentPane().add(btnReservarMesa, gbc_btnReservarMesa);
	}

	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			txtId.setText(""+list.getSelectedValue().getId());
			txtEstado.setText(list.getSelectedValue().getEstado());
			if(list.getSelectedValue().getEstado()=="libre")
				btnReservarMesa.setEnabled(true);
			else
				btnReservarMesa.setEnabled(false);
		}
	}
	private class BtnReservarMesaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			list.getSelectedValue().setEstado(true);
			txtEstado.setText(list.getSelectedValue().getEstado());
			btnReservarMesa.setEnabled(false);
		}
	}
}
