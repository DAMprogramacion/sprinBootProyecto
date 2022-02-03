package com.iesvirgendelcarmen.app5.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iesvirgendelcarmen.app5.entity.Departamento;
import com.iesvirgendelcarmen.app5.repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImp implements DepartamentoService{
	@Autowired
	DepartamentoRepository departamentoRepository;
	@Transactional(readOnly = true)
	@Override
	public Optional<Departamento> findById(int id) {
		// TODO Auto-generated method stub
		return departamentoRepository.findById(id);
	}
	@Transactional
	@Override
	public Departamento save(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoRepository.save(departamento);
	}

}
