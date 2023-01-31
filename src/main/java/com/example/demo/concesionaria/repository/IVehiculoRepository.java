package com.example.demo.concesionaria.repository;

import com.example.demo.concesionaria.modelo.Vehiculo;

public interface IVehiculoRepository {
	//CRUD
	
	public void insert(Vehiculo vehiculo);
	public Vehiculo select(Integer id);
	public Vehiculo selectAll(Integer id);
	public void update(Vehiculo vehiculo);
	public void delete(Integer id);
	
	

}
