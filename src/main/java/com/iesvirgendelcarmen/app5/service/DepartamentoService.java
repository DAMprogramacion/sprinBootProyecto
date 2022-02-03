package com.iesvirgendelcarmen.app5.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.iesvirgendelcarmen.app5.entity.Departamento;


@Service
public interface DepartamentoService {
	public Optional<Departamento> findById(int id);
	public Departamento save(Departamento departamento);
}
