package com.example.demo.concesionaria.service;

import com.example.demo.concesionaria.modelo.Vehiculo;

public interface IVehiculoService {
	//CRUD negocio
	public void agregar(Vehiculo vehiculo);
	public Vehiculo buscar(Integer id);
	public Vehiculo buscartodos(Integer id);
	public void atualizar(Vehiculo vehiculo);
	public void borrar(Integer id);
	
	
}
