package br.ifsp.edu.agenda.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditarContato extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField	nome;
	private JTextField	telefone1;
	private JTextField	telefone2;
	private JTextField	email;
	private JTextField	endereco;
	private JLabel		layout_spacer;
	private JButton		clear;
	private JButton		submit;
	
	public EditarContato()
	{
		this.initProperties();
		this.initLayout();
	}

	private void initLayout()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.anchor = GridBagConstraints.NORTHWEST;
		
		// Column 0
		gbc.gridx = 0;
		gbc.weightx = 0;
		
		JLabel header_nome = new JLabel("Nome:");
		gbc.insets = new Insets(16, 16, 0, 16);
		gbc.gridy = 0;
		this.add(header_nome, gbc);
		
		JLabel header_tel1 = new JLabel("Telefone 1:");
		gbc.insets = new Insets(4, 16, 0, 16);
		gbc.gridy = 1;
		this.add(header_tel1, gbc);
				
		JLabel header_tel2 = new JLabel("Telefone 2:");
		gbc.gridy = 2;
		this.add(header_tel2, gbc);
				
		JLabel header_email = new JLabel("E-mail:");
		gbc.gridy = 3;
		this.add(header_email, gbc);
				
		JLabel header_endereco = new JLabel("Endereço:");
		gbc.gridy = 4;
		this.add(header_endereco, gbc);
		
		// Column 1
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.weightx = 1;
		gbc.gridwidth = 2;

		nome = new JTextField();
		gbc.insets = new Insets(16, 16, 0, 16);
		gbc.gridy = 0;
		this.add(nome, gbc);
		
		telefone1 = new JTextField();
		gbc.insets = new Insets(4, 16, 0, 16);
		gbc.gridy = 1;
		this.add(telefone1, gbc);
				
		telefone2 = new JTextField();
		gbc.gridy = 2;
		this.add(telefone2, gbc);
				
		email = new JTextField();
		gbc.gridy = 3;
		this.add(email, gbc);
				
		endereco = new JTextField();
		gbc.gridy = 4;
		this.add(endereco, gbc);
		
		clear = new JButton("Limpar");
		gbc.anchor = GridBagConstraints.NORTHEAST;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		this.add(clear, gbc);
		
		submit = new JButton("Enviar");
		gbc.gridx = 2;
		this.add(submit, gbc);
		
				
		layout_spacer = new JLabel();
		gbc.insets = new Insets(16, 16, 16, 16);
		gbc.weighty = 1;
		this.add(layout_spacer, gbc);
	}

	private void initProperties()
	{
		this.setName("Alterar");
		this.setLayout(new GridBagLayout());
	}

}
