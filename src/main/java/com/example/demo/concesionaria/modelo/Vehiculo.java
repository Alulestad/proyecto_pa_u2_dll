package com.example.demo.concesionaria.modelo;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
//PRICIPAL
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vehi")
	@SequenceGenerator(name = "seq_vehi", sequenceName = "seq_vehi",allocationSize = 1)
	@Column(name = "vehi_id")
	private Integer id;
	@Column(name = "vehi_chasis")
	private String chasis;
	@Column(name = "vehi_anio")
	private LocalDateTime anio;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name = "vehi_motor")
	private String motor;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(
			name = "vehiculo_cliente",
			joinColumns = @JoinColumn(name="vecl_id_vehiculo"),
			inverseJoinColumns = @JoinColumn(name="vecl_id_cliente")
			)
	private Set<Cliente> clientes;
	
	//Gets y sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public LocalDateTime getAnio() {
		return anio;
	}

	public void setAnio(LocalDateTime anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
	
	
}
