package com.forleven.apirestforleventest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.forleven.apirestforleventest.model.Aluno;
import com.forleven.apirestforleventest.repository.AlunoRepository;

@RestController
@RequestMapping("api")
public class AlunoResource {
	@Autowired
	private AlunoRepository alunoRepository;
	
	//GET
	@GetMapping("alunos")
	public List<Aluno> listaAlunos(){
		return alunoRepository.findAll();
	}
	
	@GetMapping("{codigo}")
	public Aluno buscar(@PathVariable int codigo) {
		return alunoRepository.findById(codigo).get();
	}
	
	//POST
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("aluno")
	public Aluno cadastrar(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	//PUT
	@PutMapping("{id}")
	public Aluno atualizar(@RequestBody Aluno aluno, @PathVariable int id) {
		aluno.setMatricula(id);
		return alunoRepository.save(aluno);
	}
	
	//DELETE
	@DeleteMapping("{codigo}")
	public void remover(@PathVariable int codigo) {
		alunoRepository.deleteById(codigo);
	}

}
