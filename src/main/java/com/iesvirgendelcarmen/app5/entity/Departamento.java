package com.iesvirgendelcarmen.app5.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "departamentos")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre_departamento", length = 50)
	private String dnombre;
	@OneToMany(mappedBy="departamento", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Empleado> empleados;
		
	public Departamento(int id, String dnombre) {
		this.id = id;
		this.dnombre = dnombre;
	}
	public Departamento(String dnombre) {
		this.dnombre = dnombre;
	}
	public Departamento() {
	}
	
	
	public String getDnombre() {
		return dnombre;
	}
	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}
	public int getId() {
		return id;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
		for(Empleado e : empleados) {
            e.setDepartamento(this);
        }
	}
	
	

}
