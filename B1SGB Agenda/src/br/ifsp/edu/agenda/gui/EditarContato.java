package br.ifsp.edu.agenda.gui;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class EditarContato extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public EditarContato()
	{
		this.initProperties();
		this.initLayout();
	}

	private void initLayout()
	{
		
	}

	private void initProperties()
	{
		this.setName("Alterar");
		this.setLayout(new GridBagLayout());
	}

}
