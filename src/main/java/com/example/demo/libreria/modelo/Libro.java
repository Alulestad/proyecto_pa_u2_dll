package com.example.demo.libreria.modelo;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")
//PRINCIPAL
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_libr")
	@SequenceGenerator(name = "seq_libr",sequenceName = "seq_libr",allocationSize = 1)
	@Column(name = "libr_id")
	private Integer id;
	@Column(name = "libr_nombre")
	private String nombre;
	@Column(name = "libr_editorial")
	private String editorial;
	
	
	@ManyToMany
	@JoinTable(name="libro_autor",//Nombre de la tabla de rompimiento libro_autor dado que se eligio a libro como tabla principal
		joinColumns = @JoinColumn(name="liau_id_libro"),//joinColumns= con que columna va hacer el join, la columna FK de libro
		inverseJoinColumns = @JoinColumn(name="liau_id_autor")//inverseJoinColumns=...., la columna FK de autor
		) 												
	private Set<Autor> autores;//la coleccion lista  se reemplaza por la coleccion de set(CONJUNTO)
	
	
	
	//Gets y sets
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
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Set<Autor> getAutores() {
		return autores;
	}
	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	
}
