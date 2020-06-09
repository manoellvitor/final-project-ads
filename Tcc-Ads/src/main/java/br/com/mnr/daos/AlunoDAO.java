package br.com.mnr.daos;

import org.springframework.stereotype.Repository;

import br.com.mnr.models.Aluno;

@Repository
public class AlunoDAO extends GenericDAO<Aluno>{

	protected AlunoDAO(Class<Aluno> aluno) {
		super(aluno);
	}
	
	
}
