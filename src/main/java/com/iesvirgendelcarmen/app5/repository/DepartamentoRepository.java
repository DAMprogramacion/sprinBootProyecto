package com.iesvirgendelcarmen.app5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iesvirgendelcarmen.app5.entity.Departamento;

@Repository
public interface DepartamentoRepository extends CrudRepository<Departamento, Integer>{

}
