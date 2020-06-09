package br.com.mnr.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mnr.models.Aluno;

@RestController
@RequestMapping("/alunoController")
public class AlunoController{
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public @ResponseBody void salvar(@RequestBody Aluno aluno) {
		
		System.out.println("Aluno-nome->"+ aluno.getNome());
		System.out.println("Aluno-email->"+ aluno.getEmail());
	}
}
