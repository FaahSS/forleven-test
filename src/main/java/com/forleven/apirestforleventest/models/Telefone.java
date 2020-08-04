package com.forleven.apirestforleventest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_TELEFONE")
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="nr_telefone")
	private long number;
	@Column(name="cd_ddi", nullable=true)
	private int ddi;
	@Column(name="cd_ddd", nullable=true)
	private int ddd;
	@ManyToOne
	@JoinColumn(name="nr_matricula", nullable=false)
	private Aluno aln;
	
	
	public Telefone(long number, int ddi, int ddd) {
		super();
		this.number = number;
		this.ddi = ddi;
		this.ddd = ddd;
	}
	public Telefone() {
		super();
	}
	public Telefone(long number, int ddi, int ddd, Aluno aln) {
		super();
		this.number = number;
		this.ddi = ddi;
		this.ddd = ddd;
		this.aln = aln;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getDdi() {
		return ddi;
	}
	public void setDdi(int ddi) {
		this.ddi = ddi;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public Aluno getAluno() {
		return aln;
	}
	public void setAluno(Aluno aluno) {
		this.aln = aluno;
	}
	
	

}
