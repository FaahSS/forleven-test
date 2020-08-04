package com.forleven.apirestforleventest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forleven.apirestforleventest.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
	List<Aluno> findByNome(String nomeAluno);
	
}
