package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Profesor;

public interface IProfesorRepository {
	
	public void insertar(Profesor profesor);
	public void actualizar(Profesor profesor);
	//CRUD siempre con la pk
	public Profesor buscar(Integer id);
	//CRUD siempre con la pk
	public void eliminar(Integer id);
}
