package com.iesvirgendelcarmen.app5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iesvirgendelcarmen.app5.entity.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer>{

}
