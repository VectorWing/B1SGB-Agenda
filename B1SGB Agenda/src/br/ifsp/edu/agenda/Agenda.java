/**
 * IFSP São Paulo
 * B1SGB - Agenda Eletrônica
 * ----------------
 * João Nascimento - 
 * Lucas Barcellos - 1363417
 * Pedro Breder Esteves - 
 */

package br.ifsp.edu.agenda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import br.ifsp.edu.agenda.gui.MainWindow;

public class Agenda extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel 		main;
	private JMenuBar 	menubar;
	
	public Agenda()
	{
		this.initWindowLayout();
		this.initMenuBar();
		this.initWindowProperties();
	}

	private void initWindowProperties()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Papaco 1.0");
	}
	
	
	private void initMenuBar()
	{
		menubar = new JMenuBar();
		
		JMenu file = new JMenu("Arquivo");
		JMenuItem file_exit = new JMenuItem("Criar");
		file.add(file_exit);
		menubar.add(file);
		
		JMenu edit = new JMenu("Editar");
		JMenuItem edit_create = new JMenuItem("Criar");
		edit.add(edit_create);
		JMenuItem edit_edit = new JMenuItem("Alterar");
		edit.add(edit_edit);
		JMenuItem edit_delete = new JMenuItem("Remover");
		edit.add(edit_delete);
		menubar.add(edit);
		
		JMenu help = new JMenu("Ajuda");
		JMenuItem help_about = new JMenuItem("Sobre");
		help.add(help_about);
		menubar.add(help);
		
		this.setJMenuBar(menubar);
	}
	
	private void initWindowLayout()
	{
		main = new MainWindow();
		this.setContentPane(this.main);
		this.pack();
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Agenda main = new Agenda();
				main.setVisible(true);
            }
        });
	}
}
