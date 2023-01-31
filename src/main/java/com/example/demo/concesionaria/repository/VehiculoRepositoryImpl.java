package com.example.demo.concesionaria.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.concesionaria.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insert(Vehiculo vehiculo) {
		this.entityManager.persist(vehiculo);

	}

	@Override
	public Vehiculo select(Integer id) {
		Vehiculo encontrado= this.entityManager.find(Vehiculo.class, id);
		return encontrado;
	}

	@Override
	public Vehiculo selectAll(Integer id) {
		Vehiculo encontrado= this.entityManager.find(Vehiculo.class, id);
		encontrado.getClientes().size();
		return encontrado;
	}

	@Override
	public void update(Vehiculo vehiculo) {
		this.entityManager.merge(vehiculo);

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo encontrado= this.entityManager.find(Vehiculo.class, id);
		this.entityManager.remove(encontrado);
	}

}
