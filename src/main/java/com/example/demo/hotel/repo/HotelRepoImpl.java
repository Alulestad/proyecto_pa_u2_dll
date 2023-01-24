package com.example.demo.hotel.repo;

import org.springframework.stereotype.Service;

import com.example.demo.hotel.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Service
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		Hotel encontrado= this.entityManager.find(Hotel.class, id);
		return encontrado;
	}

	@Override
	public void update(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Hotel aEliminar=this.buscar(id);
		this.entityManager.remove(aEliminar);
		
	}

}
