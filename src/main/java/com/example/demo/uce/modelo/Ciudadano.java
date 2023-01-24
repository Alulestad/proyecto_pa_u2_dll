package com.example.demo.uce.modelo;

import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_seq")
	@SequenceGenerator(name = "ciud_seq", sequenceName = "ciud_seq", allocationSize = 1)
	@Column(name = "ciud_id")
	private Integer id;
	@Column(name = "ciud_nombre")
	private String nombre;
	@Column(name = "ciud_apellido")
	private String apellido;
	
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL) //se va a mapear con ciudadano de la clase empleado
	//CascadeType.ALL uso casscada en todo, pero si quiero solo en el merge póngo en verz del all, merge
	//@OneToOne(mappedBy = "ciudadano")
	private Empleado empleado;
	
	//Get y set
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
}
