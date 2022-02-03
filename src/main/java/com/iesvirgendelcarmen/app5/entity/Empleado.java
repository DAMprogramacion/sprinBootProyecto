package com.iesvirgendelcarmen.app5.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre_empleado", length = 100)
	private String enombre;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_departamento", foreignKey = @ForeignKey(name = "fk_id_departamento"))
	@JsonBackReference
	private Departamento departamento;
	
	public Empleado(int id, String enombre) {
		this.id = id;
		this.enombre = enombre;
	}
	public Empleado(String enombre) {
		this.enombre = enombre;
	}
	public Empleado() {
	}
	public String getEnombre() {
		return enombre;
	}
	public void setEnombre(String enombre) {
		this.enombre = enombre;
	}
	public int getId() {
		return id;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}
