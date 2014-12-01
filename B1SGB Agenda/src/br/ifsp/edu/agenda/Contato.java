package br.ifsp.edu.agenda;

public class Contato {
	
	private String nome;
	private String telefone1;
	private String telefone2;
	private String email;
	private String endereco;
	
	public Contato()
	{
		
	}
	
	public Contato(String nome, String telefone1, String telefone2, String email, String endereco)
	{
		this.nome = nome;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
