package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo {

	@PersistenceContext
	public EntityManager entityManager;
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado aEliminar=this.buscar(id);
		this.entityManager.remove(aEliminar);
		
	}
	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		Empleado encontrado=this.entityManager.find(Empleado.class, id);
		return encontrado;
	}
	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
	}

}
