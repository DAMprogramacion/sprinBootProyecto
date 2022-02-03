package com.iesvirgendelcarmen.app5.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iesvirgendelcarmen.app5.entity.Empleado;
import com.iesvirgendelcarmen.app5.repository.DepartamentoRepository;
import com.iesvirgendelcarmen.app5.repository.EmpleadoRepository;
@Service
public class EmpleadoServiceImp implements EmpleadoService{
	@Autowired
	EmpleadoRepository empleadoRepository;
	@Transactional(readOnly = true)
	@Override
	public Optional<Empleado> findById(int id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id);
	}
	@Transactional
	@Override
	public Empleado save(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(empleado);
	}

}
