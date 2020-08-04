package com.forleven.apirestforleventest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name="aluno", sequenceName="TB_SQ_ALUNO", allocationSize=1, initialValue=1000)
@Table(name="TB_ALUNO")
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="aluno")
	@Column(name="nr_matricula")
	private int matricula;
	@Column(name="nm_aluno", nullable=false)
	@Size(min=4)
	private String nome;
	@Column(name="nm_sobrenome", nullable=false)
	@Size(min=4)
	private String sobrenome;
	@OneToMany(mappedBy="aln", cascade=CascadeType.ALL)
	private List<Telefone> telefones;
	
	public void addTelefone(Telefone telefoneNovo) {
		telefoneNovo.setAluno(this);
		this.telefones.add(telefoneNovo);
	}
	
	
	public Aluno(int matricula, String nome, String sobrenome, List<Telefone> telefones) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefones = telefones;
	}


	public Aluno(int matricula, String nome, String sobrenome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}


	public Aluno() {
		super();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public List<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
	
	

}
