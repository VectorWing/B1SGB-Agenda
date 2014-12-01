package br.ifsp.edu.agenda.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.ifsp.edu.agenda.ListaContatosModel;

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
		
		/*contatos.setSurrendersFocusOnKeystroke(true);
        if (!tableModel.hasEmptyRow()) {
            tableModel.addEmptyRow();
        }*/
		
		GridBagConstraints gbc = new GridBagConstraints();

		contatos = new JTable();
		contatos.setFillsViewportHeight(true);
		contatos.setModel(tableModel);
		
		sp = new JScrollPane(contatos);
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		this.add(sp, gbc);
	}
}
