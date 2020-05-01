package com.contas.apiContas.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contas.apiContas.Repository.ContaRepository;
import com.contas.apiContas.model.Conta;

@RestController
@RequestMapping(value="/api")
public class ContaController {
	
	@Autowired
	ContaRepository contaRepository;
	
	@GetMapping("/contas")
	public List<Conta> listaContas(){
		return contaRepository.findAll();
	}
	
	@GetMapping("/conta/{id}")
	public Optional<Conta> listarUnicaConta(@PathVariable(value="id") Long id){
		return contaRepository.findById(id);
	}
	
	@PostMapping("/conta")
	public Conta salvarConta(@RequestBody Conta conta){
		return contaRepository.save(conta);
	}
	
	@PutMapping("/conta")
	public void atualizarConta(@RequestBody Conta conta){
		contaRepository.save(conta);
	}
	
	@DeleteMapping("/conta")
	public void deletarConta(@RequestBody Conta conta){
		contaRepository.delete(conta);
	}
}
