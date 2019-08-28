package exercicio01;

import java.util.Date;

public class Pessoa {
	private String nome;
	private char sexo;
	private Date nascimento;
	private String cpf;
	private String endereco;
	private Pessoa conjuge;
	
	public Pessoa () {}
	
	public Pessoa (String nome, char sexo, Date nascimento, String cpf, String endereco, Pessoa conjuge) {
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.endereco = endereco;
		this.conjuge = conjuge;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Pessoa getConjuge() {
		return conjuge;
	}
	public void setConjuge(Pessoa conjuge) {
		this.conjuge = conjuge;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", nascimento=" + nascimento + ", cpf=" + cpf + ", endereco="
				+ endereco + ".";
	}
	
	public String imprimirConjuge(boolean apenasNomes) {
		if (apenasNomes) {
			return this.conjuge.getNome() + " é conjuge de " + this.nome;
		}
		return this.conjuge + " é conjuge de " + this;
	}
}

