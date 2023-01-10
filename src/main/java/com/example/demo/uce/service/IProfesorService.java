package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Profesor;

public interface IProfesorService {

	public void agregar(Profesor profesor);
	public void modificar(Profesor profesor);
	//siempre con la pk
	public Profesor buscar(Integer id);
	//siempre con la pk
	public void borrar(Integer id);
}
