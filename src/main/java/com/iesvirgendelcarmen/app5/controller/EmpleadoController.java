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
import com.iesvirgendelcarmen.app5.entity.Empleado;
import com.iesvirgendelcarmen.app5.service.DepartamentoService;
import com.iesvirgendelcarmen.app5.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
	@Autowired
	EmpleadoService empleadoService;
	@Autowired
	DepartamentoService departamentoService;
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Empleado empleado){
		Optional<Departamento> oDepartamento = departamentoService.findById(empleado.getDepartamento().getId());
		if (oDepartamento.isPresent()) {
			empleado.setDepartamento(oDepartamento.get());
			return ResponseEntity.status(HttpStatus.CREATED).
					body(empleadoService.save(empleado));
		}
		return ResponseEntity.notFound().build();
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> readById(@PathVariable int id) {
		Optional<Empleado> oEmpleado = empleadoService.findById(id);
		if (! oEmpleado.isPresent())
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(oEmpleado.get());
	}
}
