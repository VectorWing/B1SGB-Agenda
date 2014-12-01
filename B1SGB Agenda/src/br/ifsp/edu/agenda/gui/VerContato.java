package br.ifsp.edu.agenda.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class VerContato extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Font title;
	private Font header;
	private Font normal;
	
	private JLabel nome;
	private JLabel telefone1;
	private JLabel telefone2;
	private JLabel email;
	private JLabel endereco;
	private JLabel layout_spacer;
	
	public VerContato()
	{
		this.initProperties();
		this.initLayout();
	}

	private void initLayout()
	{
		title = new Font("Arial", Font.BOLD, 18);
		header = new Font("Arial", Font.BOLD, 12);
		normal = new Font("Arial", Font.PLAIN, 12);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		nome = new JLabel("Nome");
		nome.setFont(title);
		nome.setBackground(Color.BLUE);
		gbc.insets = new Insets(16, 16, 0, 16);
		gbc.anchor = GridBagConstraints.NORTHWEST;
		//gbc.weightx = 1;
		this.add(nome, gbc);
		
		// Column 0
		gbc.gridx = 0;
		gbc.weightx = 0;

		JLabel header_tel1 = new JLabel("Telefone 1:");
		header_tel1.setFont(header);
		gbc.gridy = 1;
		this.add(header_tel1, gbc);
		
		JLabel header_tel2 = new JLabel("Telefone 2:");
		header_tel2.setFont(header);
		gbc.gridy = 2;
		this.add(header_tel2, gbc);
		
		JLabel header_email = new JLabel("E-mail:");
		header_email.setFont(header);
		gbc.gridy = 3;
		this.add(header_email, gbc);
		
		JLabel header_endereco = new JLabel("Endereço:");
		header_endereco.setFont(header);
		gbc.gridy = 4;
		this.add(header_endereco, gbc);
		
		// Column 1
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.weightx = 1;

		telefone1 = new JLabel("1234-5678");
		telefone1.setFont(normal);
		gbc.gridy = 1;
		this.add(telefone1, gbc);
		
		telefone2 = new JLabel("99876-5432");
		telefone2.setFont(normal);
		gbc.gridy = 2;
		this.add(telefone2, gbc);
		
		email = new JLabel("teste@email.com");
		email.setFont(normal);
		gbc.gridy = 3;
		this.add(email, gbc);
		
		endereco = new JLabel("Endereço da Rua, 123");
		endereco.setFont(normal);
		gbc.insets = new Insets(16, 16, 16, 16);
		gbc.gridy = 4;
		this.add(endereco, gbc);
		
		layout_spacer = new JLabel();
		gbc.insets = new Insets(16, 16, 16, 16);
		gbc.weighty = 1;
		this.add(layout_spacer, gbc);
	}

	private void initProperties()
	{
		this.setName("Informações");
		this.setLayout(new GridBagLayout());
	}

}
