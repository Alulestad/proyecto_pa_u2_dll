package com.example.demo.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.libreria.modelo.Autor;
import com.example.demo.libreria.repo.IAutorRepo;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepo autorRepo;
	
	@Override
	public void agregarAutor(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.insertar(autor);
	}

}
