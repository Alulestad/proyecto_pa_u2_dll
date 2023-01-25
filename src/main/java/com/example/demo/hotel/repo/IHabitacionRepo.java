package com.example.demo.hotel.repo;

import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.modelo.Hotel;

public interface IHabitacionRepo {

	//CRUD
	public void insertar(Habitacion habitacion);
	public Habitacion buscar(Integer id);
	public void update(Habitacion habitacion);
	public void delete(Integer id);
}
