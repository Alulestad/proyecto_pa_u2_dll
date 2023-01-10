package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.repository.IProfesorRepository;

@Service
public class ProfesorServiceImpl implements IProfesorService {

	@Autowired
	public IProfesorRepository iProfesorRepository;
	
	@Override
	public void agregar(Profesor profesor) {
		this.iProfesorRepository.insertar(profesor);

	}

	@Override
	public void modificar(Profesor profesor) {
		this.iProfesorRepository.actualizar(profesor);

	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iProfesorRepository.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.iProfesorRepository.eliminar(id);

	}

}
