package com.example.demo.libreria.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.libreria.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class AutorRepoImpl implements IAutorRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);
	}

}
