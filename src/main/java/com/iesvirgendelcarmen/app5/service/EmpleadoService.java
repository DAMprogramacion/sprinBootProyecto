package com.iesvirgendelcarmen.app5.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.iesvirgendelcarmen.app5.entity.Empleado;


@Service

public interface EmpleadoService {
	public Optional<Empleado> findById(int id);
	public Empleado save(Empleado empleado);
}
