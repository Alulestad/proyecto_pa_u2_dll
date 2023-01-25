package com.example.demo.hotel.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.hotel.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HabitacionRepoImpl implements IHabitacionRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
			Habitacion habitacion= this.entityManager.find(Habitacion.class, id);
		return habitacion;
	}

	@Override
	public void update(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(habitacion);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Habitacion habitacion= this.entityManager.find(Habitacion.class, id);
		this.entityManager.remove(habitacion);
	}

}
