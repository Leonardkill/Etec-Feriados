package br.com.etechoracio.feriadoapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.feriadoapi.dao.FeriadoDAO;
import br.com.etechoracio.feriadoapi.model.Feriado;

@RestController
@RequestMapping("/feriados")
public class FeriadoController {
	
	@Autowired
	private FeriadoDAO dao;
	
	@GetMapping
	public List<Feriado> listar(){
		return dao.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Feriado> buscar (@PathVariable Long id){
		Optional<Feriado> resultado = dao.findById(id);
		
		if(resultado.isPresent()) {
			return ResponseEntity.ok(resultado.get());
		}
		return ResponseEntity.notFound().build();
	}
	@PostMapping
	public void inserir (@RequestBody Feriado f) {
		dao.save(f);
	}

}
