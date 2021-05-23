package br.edu.univas.vo;

public class Cliente {

	private String nome;
	private String CPF;
	private String cel;
	private Receita receita;

	public Cliente(String nome, String CPF, String cel, Receita receita) {

		this.nome = nome;
		this.CPF = CPF;
		this.cel = cel;
		this.receita = receita;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

}
