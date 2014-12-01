package br.ifsp.edu.agenda.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import br.ifsp.edu.agenda.data.ListaContatosModel;

public class ListaContatos extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JScrollPane			sp;
	private ListaContatosModel	tableModel;
	private JTable				contatos;
	
	private String[] columnNames = {
			"Nome",
			"Telefone 1",
			"Telefone 2",
			"E-mail",
			"Endereço"
	};
	
	public ListaContatos()
	{
		this.initProperties();
		this.initLayout();
	}
	
	public void initProperties()
	{
		this.setLayout(new GridBagLayout());
	}

	public void initLayout()
	{
		tableModel = new ListaContatosModel(columnNames);
		tableModel.addEmptyRow();
		
		GridBagConstraints gbc = new GridBagConstraints();

		contatos = new JTable();
		contatos.setFillsViewportHeight(true);
		contatos.setPreferredScrollableViewportSize(new java.awt.Dimension(800, 400));
		contatos.setModel(tableModel);
		contatos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		contatos.setSurrendersFocusOnKeystroke(true);
		contatos.getColumn("Nome").setPreferredWidth(120);
		contatos.getColumn("Telefone 1").setPreferredWidth(50);
		contatos.getColumn("Telefone 2").setPreferredWidth(50);
		contatos.getColumn("E-mail").setPreferredWidth(100);
		contatos.getColumn("Endereço").setPreferredWidth(200);
		
		/*TableColumn col_tel1 = contatos.getColumn("Telefone 1");
		col_tel1.setMinWidth(100);
		col_tel1.setMaxWidth(100);
		TableColumn col_tel2 = contatos.getColumn("Telefone 2");*/
		
        if (!tableModel.hasEmptyRow()) {
            tableModel.addEmptyRow();
        }
		
		sp = new JScrollPane(contatos);
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		this.add(sp, gbc);
	}
}
