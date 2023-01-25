package com.example.demo.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.repo.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService {
@Autowired
private IHabitacionRepo habitacionRepo;
	
	
	@Override
	public void crear(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.insertar(habitacion);
	}

	@Override
	public Habitacion consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscar(id);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.update(habitacion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.habitacionRepo.delete(id);
	}

}
