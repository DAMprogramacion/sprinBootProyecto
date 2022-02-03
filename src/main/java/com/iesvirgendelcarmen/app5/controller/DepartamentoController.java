package com.iesvirgendelcarmen.app5.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iesvirgendelcarmen.app5.entity.Departamento;
import com.iesvirgendelcarmen.app5.service.DepartamentoService;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {
	@Autowired
	DepartamentoService departamentoService;
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Departamento departamento){
		return ResponseEntity.status(HttpStatus.CREATED).
				body(departamentoService.save(departamento));
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> readById(@PathVariable int id) {
		Optional<Departamento> oDepartamento = departamentoService.findById(id);
		if (! oDepartamento.isPresent())
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(oDepartamento.get());
	}
}
