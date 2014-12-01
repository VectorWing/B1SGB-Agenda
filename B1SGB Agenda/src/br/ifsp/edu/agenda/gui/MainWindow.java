package br.ifsp.edu.agenda.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainWindow extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JMenuBar 		menubar;
	private ListaContatos 	contatos;
	private JTabbedPane 	detalhes;
	private VerContato		tab_view;
	private EditarContato	tab_edit;

	public MainWindow()
	{
		this.initProperties();
		this.initLayout();
	}
	
	private void initProperties()
	{
		this.setLayout(new GridBagLayout());
	}
	
	private void initLayout()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		
		contatos = new ListaContatos();
		gbc.insets = new Insets(16, 16, 16, 16);
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		this.add(contatos, gbc);
		
		tab_view = new VerContato();
		tab_edit = new EditarContato();
		
		detalhes = new JTabbedPane();
		detalhes.add(tab_view);
		detalhes.add(tab_edit);
		gbc.gridy = 1;
		gbc.weighty = 0;
		gbc.fill = GridBagConstraints.BOTH;
		this.add(detalhes, gbc);
	}
	
}
