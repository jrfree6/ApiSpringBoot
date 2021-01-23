package br.com.springbootapi.controller.PessoaController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

import br.com.springbootapi.entity.PessoaEntity;
import br.com.springbootapi.repository.PessoaRepository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
    private PessoaRepository _pessoaRepository;
	
	@RequestMapping(value = "/pessoa", method = RequestMethod.GET)
	@ResponseBody
	public List<PessoaEntity> getPessoas() {
		return  _pessoaRepository.findAll();
	}
	
	@RequestMapping(value = "/pessoa", method = RequestMethod.POST)
	public PessoaEntity POST(@Validated @RequestBody PessoaEntity pessoa) {
		return _pessoaRepository.save(pessoa);
	}
	
	@RequestMapping(value = "/pessoa/{id}", method = RequestMethod.GET)
	public ResponseEntity<PessoaEntity> GetById(@PathVariable(value = "id") long id) {
		
		Optional<PessoaEntity> pessoa = _pessoaRepository.findById(id);
		if(pessoa.isPresent()) {
			return new ResponseEntity<PessoaEntity>(pessoa.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	

}
